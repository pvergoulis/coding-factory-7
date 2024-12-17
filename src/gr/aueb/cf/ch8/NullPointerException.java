package gr.aueb.cf.ch8;

public class NullPointerException {

    public static void main(String[] args) {
        String s = null;

        if (s != null && s.equals("Athens")){
            System.out.println("Equals");
        }else {
            System.out.println("Not Equals");
        }
    }
}
