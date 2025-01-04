package gr.aueb.cf.christmasProjects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProjectThree {

    public static void main(String[] args) {
        String[][] data = new String[128][2];
        String filePath = "C:/tmp/project3.txt";

        try {
            int row = readFile(filePath, data);

            System.out.println("Ταξινομηση ανα χαρακτηρα :");
            sortByCharacter(data, row);
            printData(data, row);

            System.out.println();
            System.out.println("Ταξινομηση ανα συχνοτητα: ");
            sortByFrequency(data, row);
            printData(data, row);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static int readFile(String filePath, String[][] data) throws IOException {
        int row = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            int c;
            while ((c = br.read()) != -1) {
                char character = (char) c;
                if (Character.isWhitespace(character)) {
                    continue;
                }

                boolean found = false;
                for (int i = 0; i < row; i++) {
                    if (data[i][0].equals(String.valueOf(character))) {
                        int count = Integer.parseInt(data[i][1]);
                        data[i][1] = String.valueOf(count + 1);
                        found = true;
                        break;
                    }
                }

                if (!found && row < 128) {
                    data[row][0] = String.valueOf(character);
                    data[row][1] = "1";
                    row++;
                }
            }
        }
        return row;
    }


    public static void sortByCharacter(String[][] data, int row) {
        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j < row - 1 - i; j++) {
                if (data[j][0].compareTo(data[j + 1][0]) > 0) {
                    String[] temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }


    public static void sortByFrequency(String[][] data, int row) {
        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j < row - 1 - i; j++) {
                int freqCompare = Integer.parseInt(data[j][1]) - Integer.parseInt(data[j + 1][1]);
                if (freqCompare < 0 || (freqCompare == 0 && data[j][0].compareTo(data[j + 1][0]) > 0)) {
                    String[] temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }


    public static void printData(String[][] data, int row) {
        for (int i = 0; i < row; i++) {
            if (data[i][0] != null) {
                System.out.println("Χαρακτηρας: " + data[i][0] + " | Πληθος: " + data[i][1]);
            }
        }
    }
}
