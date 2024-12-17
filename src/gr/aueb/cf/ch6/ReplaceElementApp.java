package gr.aueb.cf.ch6;

public class ReplaceElementApp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        //Εκτυπωση αρχικου πινακα
        System.out.println("Αρχικος Πινακας");
        printArray(arr);


        //Αντικατασταση του 3 με το 10
        replace(arr,3,10);

        //Εκτωπωση πινακα μετα την αντικατασταση
        System.out.println("Πινακας μετα την αντικατασταση: ");
        printArray(arr);
    }

    public static void replace(int[] arr, int oldVal, int newVal) {
        int positionToUpdate;

        positionToUpdate = getPosition(arr, oldVal);
        if (positionToUpdate == -1){
            System.out.println("Η τιμη " + oldVal + "δεν βρεθηκε");
            return;
        }
         arr[positionToUpdate] = newVal;
        System.out.println("Αντικατασταση της τιμης " + oldVal + " με " + newVal + " στη θεση " + positionToUpdate);

    }

    public static int getPosition(int[]arr, int value ){
        int positionToReturn = -1;

        for (int i = 0; i <arr.length; i++){
            if (arr[i] == value){
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }

    public static void printArray (int[] arr){
        for (int el : arr){
            System.out.print(el +" ");
        }
        System.out.println();
    }

}
