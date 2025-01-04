package gr.aueb.cf.christmasProjects;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class ProjectOne {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(new File("C:/tmp/project1.txt"));
             PrintStream ps = new PrintStream("C:/tmp/project1-out.txt",StandardCharsets.UTF_8)){
            final int LOTTO_SIZE = 6;
            int[] inputArr = new int[49];
            int pivot = 0;
            int num;
            int window;
            int[]result = new int[LOTTO_SIZE];


            while ((num = in.nextInt()) != -1 && pivot <= 48){
                inputArr[pivot++] = num;
            }

            int[] numbers = Arrays.copyOfRange(inputArr, 0, pivot);
            Arrays.sort(numbers);


            window = pivot - LOTTO_SIZE;
            for (int i = 0; i <= window; i++) {
                for (int j = i + 1; j <= window + 1; j++) {
                    for (int k = j + 1; k <= window + 2; k++) {
                        for (int l = k + 1; l <= window + 3; l++) {
                            for (int m = l + 1; m <= window + 4; m++) {
                                for (int n = m + 1; n <= window + 5; n++) {
                                    result[0] = numbers[i];
                                    result[1] = numbers[j];
                                    result[2] = numbers[k];
                                    result[3] = numbers[l];
                                    result[4] = numbers[m];
                                    result[5] = numbers[n];

                                    if (!isEven(result, 4) && !isOdd(result, 4) && !sameEnding(result,3)
                                            && !sameTen(result,3) && !twoConsecutives(result)) {
                                        ps.printf("%d %d %d %d %d %d\n",
                                                result[0], result[1], result[2], result[3], result[4], result[5]);
                                        System.out.printf("%d %d %d %d %d %d\n",
                                                result[0], result[1], result[2], result[3], result[4], result[5]);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static boolean isEven (int[] arr, int threshold){
        int evenCount = 0;

        for (int el : arr){
            if (el % 2 == 0){
                evenCount++;
            }
        }
        return evenCount >= threshold;
    }


    public static boolean isOdd (int[] arr, int threshold){
        int oddCount = 0;

        for (int el : arr){
            if (el % 2 != 0){
                oddCount++;
            }
        }
        return oddCount >= threshold;
    }


    public static boolean sameEnding(int[]arr,int threshold){
        int[] endings = new int[10];

        for (int el : arr){
            endings[el % 10]++;
        }
        for (int count : endings){
            if (count > threshold){
                return true;
            }
        }
        return false;

    }

    public static boolean sameTen(int[] arr, int threshold){
        int[] ten = new int[5];

        for (int el : arr){
            ten[el/10]++;
        }

        for (int count : ten) {
            if (count > threshold){
                return  true;
            }
        }
        return false;

    }

    public static boolean twoConsecutives(int[] arr){
        int count = 0;

        for (int i = 0; i <= 3; i++){
            if (arr[i] == arr[i+1] - 1 && arr[i] == arr[i+2] -2) {
                count++;
                break;
            }

        }
        return count >=1;
    }

}