package gr.aueb.cf.exercise2;

public class SearchArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        final int SECRET = 4;
        boolean found = false;

        for (int i = 0; i < arr.length;i++) {
            if (arr[i] == SECRET) {
                found = true;
                break;
            }
        }

            if (found){
                System.out.println("You have found the secret");
            }else{
                System.out.println("Failed");
            }
        }
    }

