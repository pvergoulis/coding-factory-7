package gr.aueb.cf.ch7;

public class IndexOfSubstrignApp {

    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o");
        int positionOfSecondo = cf.indexOf("o", 2);
        int lastPositionOfo = cf.lastIndexOf("o");

        System.out.println(positionOfo);
        System.out.println(positionOfSecondo);
        System.out.println(lastPositionOfo);

        String cf2 = cf.substring(1);
        String slice = cf.substring(1, 3);


        System.out.println(cf2);
        System.out.println(slice);

    }
}
