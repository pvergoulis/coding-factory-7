package gr.aueb.cf.CFex;

public class ΜικρεςΕργασιες2 {

    public static void main(String[] args) {
        int[] arr = {1, 11, 32, 42, 12, 14, 51 ,15};
        int position;

        position = getPosition(arr,42);
        if (position == -1) {
            System.out.println("Το Στοιχείο δεν βρέθηκε");
        }else {
            System.out.println("Value: "+ arr[position] + ", Position: " + (position + 1));
        }
    }

    public static int getPosition(int[] arr, int value){
        int positionToreturn = -1;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == value){
                positionToreturn = i;
                break;
            }
        }
        return positionToreturn;
    }
}
