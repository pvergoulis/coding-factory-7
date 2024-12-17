package gr.aueb.cf.exercise2;

public class IsSymmetricExercise2 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2, 1};
        int[] arr2 = {2, 3, 4, 3, 2};
        int[] arr3 = {1, 2, 3, 4,5};

        System.out.println("Array 1 is symmetric: " + isSymmetric(arr1));
        System.out.println("Array 2 is symmetric: " + isSymmetric(arr2));
        System.out.println("Array 3 is symmetric: " + isSymmetric(arr3));
    }


    public static boolean isSymmetric(int[]arr){
        if (arr==null || arr.length == 0){
            return true;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            if (arr[left] != arr[right])
                return false;
            left++;
            right--;
        }
        return true;
    }
}
