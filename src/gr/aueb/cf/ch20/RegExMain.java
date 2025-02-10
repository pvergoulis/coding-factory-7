package gr.aueb.cf.ch20;

public class RegExMain {

    public static void main(String[] args) {
        String s = "A8ana Androustos";
//        String email = "pavlosvegoulis@gmail.com";
//        String date = "12/11/2012";
//        System.out.println(isRed(s));
//        System.out.println(isRedOrGreen(s));
//        System.out.println(beginsWithOneUpperCaseAndEndsInIng(s));
//        System.out.println(isOneLetterEndsInIng(s));
//        System.out.println(whitespaceDigit(s));
//        System.out.println(anySymbolDig(s));
//        System.out.println(isEmail(email));
//        System.out.println(isDate(date));
//        String[] tokens = doSplit(s);
//        for(String token : tokens) {
//            System.out.print(token +" ");
//        }
//
//        System.out.println(doReplace(s));
        System.out.println(doReplaceBackReference(s));

    }

    /**
     * Ελέγχει (matches) εαν το input String ειναι το "Red".
     * @param s
     * @return
     */
    public static boolean isRed(String s){
        return s.matches("red");
    }

    /**
     * Ελέγχει (matches) εαν το Input String ειναι "Red" ή "Green"
     * @param s
     * @return
     */
    public static boolean isRedOrGreen(String s) {
        return s.matches("red|green");
    }


    /**
     * Ελέγχει (matches) εαν το input String ειναι "red" ή "Red" ή "green" ή "Green"
     * @param s
     * @return
     */
    public static boolean isrRedOrgGreen(String s) {
        return s.matches("[rR]ed|[gG]reen");
    }

    public static boolean beginsWithOneUpperCaseAndEndsInIng(String s){
        return s.matches("[A-Z]ing");
    }


    public static boolean isOneLetterEndsInIng(String s){
        return s.matches("[A-Za-z]ing");
    }

    /**
     * Ελεγχει αν το πρωτο ειναι whitespace και το δευτερο ψηφιο
     * @param s
     * @return
     */
    public static boolean whitespaceDigit(String s) {
        return s.matches("\\s\\d"); // H matches vazei automata ^ stn arxi kai $ sto telos dld ("^\\s\\d$)
    }

    /**
     * Ελεγχει αν ξεκιναει απο οποιοδηποτε χαραχτηκρα (1, @, Κ, Α) και μετα αν εχει ψηφιο
     * @param s
     * @return
     */
    public static boolean anySymbolDig(String s){
        return s.matches(".\\d");
//        return s.matches(".[0-9]"); //ειναι το ιδιο

    }


    public static boolean isEmail(String s){
        return s.matches("\\w*\\.?\\w+@\\w+\\.[a-z]{2,4}");
    }

    public static boolean isDate (String s) {
        return s.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    public static String[] doSplit(String s) {
        return s.split("\\s+");
    }

    public static String doReplace(String s) {
        return s.replaceAll("\\s+", ",");
    }

    public static String doReplaceBackReference (String s){
        return s.replaceAll("(.+)\\s+(.+)", "$2 $1");
    }
}
