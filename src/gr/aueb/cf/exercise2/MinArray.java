package gr.aueb.cf.exercise2;

public class MinArray {

    public static void main(String[] args) {
        int [] arr = {6, 2, 3, 4, 5, 6, 1};
        int position = getMinPosition(arr);

        System.out.println("Position: " + getMinPosition(arr));
    }

    public static int getMinPosition (int[]arr){
        if (arr == null || arr.length < 1) return -1;

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 0; i < arr.length;i++){
            if (arr[1] == minValue){
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }
}
