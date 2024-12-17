package gr.aueb.cf.ch6;

/**
 * Δηλωση και αρχικοποιηση ενος πινακας
 * Populate
 * - new
 *  - unsized
 *  - array initializer
 *  - print τα στοιχεια ενος πινακα
 */
public class ArrayHello {

    public static void main(String[] args) {
        int [] arr = new int[3];   // declare and initialization
        int [] arr2 = {1, 2, 3 ,4 ,5};  // unsized initialization
        int [] arr3;
        arr3= new int[] {1, 2, 3, 4, 5}; // array initializer

        //populate
        arr [0] = 5;
        arr [1] = 10;
        arr [2] = 4;

        // traverse
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }

        // Enhanced for
        for (int el : arr3){
            System.out.print(el +" ");
        }
     }
}
