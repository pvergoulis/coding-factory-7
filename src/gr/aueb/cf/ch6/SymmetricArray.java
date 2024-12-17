package gr.aueb.cf.ch6;

public class SymmetricArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2, 1};
        int[] arr2 = {2, 4, 5, 4, 2};
        int[] arr3 = {2, 2, 3, 3, 1};

        System.out.println("arr1 ειναι συμμετρικος: " + isSymmetricWhile(arr1));
        System.out.println("arr2 ειναι συμμετρικος: " + isSymmetricWhile(arr2));
        System.out.println("arr3 ειναι συμμετρικος: " + isSymmetricWhile(arr3));
    }

    public static boolean isSymmetric(int[]arr){
        boolean isSymmetric = true;
        for (int i = 0, j = arr.length -1; i < j; i++, j--){
            if (arr[i] != arr[j]){
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }

  public static boolean isSymmetricWhile(int[]arr){
        if (arr == null || arr.length == 0){
            return true; // ο Πινακας ειναι συμμετρικος
        }

        int left = 0;
        int right = arr.length -1;

        while (left < right){
            if (arr[left] != arr[right]){
                return false;
            }
            left ++;
            right --;
        }
        return true;
  }



}
