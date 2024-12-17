package gr.aueb.cf.exercise2;

public class ReplaceElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3 ,4 ,5};

        System.out.println("Πρωτος πινακας");
        printArray(arr);

        replaceElement(arr,3,7);

        System.out.println("Πινακας αντικαταστησης");
        printArray(arr);

    }
    public static void printArray(int[]arr){

        for (int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static int getPosition(int[]arr , int value){
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++){
            if (arr[i]==value){
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }

    public static void replaceElement(int[] arr, int oldValue, int newValue){

        int positionToUpdate;

        positionToUpdate = getPosition(arr,oldValue);
        if (positionToUpdate == -1){
            System.out.println("Η τιμη " + oldValue + "δεν βρεθηκε");
            return;
        }
        arr[positionToUpdate] = newValue;
        System.out.println("Αντικατασταση της τιμης " + oldValue + " με " + newValue + " στη θεση " + positionToUpdate);
    }
}
