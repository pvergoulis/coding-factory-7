package gr.aueb.cf.christmasProjects;

public class ProjectTwo {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};


        System.out.println("Max sum: " + maxSub(arr));
    }

    /**
     * O currentSum και ο MaxSum ξεκινανε με την τημη -2 (arr[0]),
     * οσο τρεχει η For προσθετουμε το CurrentSum και ενημερωνουμε το MaxSum.
     * πχ. Την πρωτη φορα θα γινει i = 0  , arr[i] -2 , currentSum -2 , maxSum-2
     *     Την δευτερη φορα θα γινει ι = 1, arr [i] 1, currentSum(-2,1) = 1 , maxSum =1
     *     Την τριτη φορα θα γινει i = 2, arr [i] -3 , currentSum (1-3,-3) = -2, maxSum = 1
     *     Την τεταρτη φορα θα γινει i = 3 , arr[4] , currentSum(-2,4) = 4, max(1,4) = 4
     *     etc.
     *
     *     Αν το current ειναι θετικο προσθετου το arr[i] στον maxSum.
     *
     *     Η for διατρεχει καθε τον πινακα μια φορα . Αρα η πολυπλοκοτητα ειναι Ο(n)
     * @param arr
     * @return
     */
    public static int maxSub(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (currentSum < 0) {
                currentSum = arr[i];
            } else {
                currentSum += arr[i];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }


        return maxSum;
    }
}
