package gr.aueb.cf.exercise2;

public class PrintArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr);
    }

    public static void printArray(int[]arr){

        for (int el : arr){
            System.out.print(el +" ");
        }

    }
}
