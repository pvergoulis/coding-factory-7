package gr.aueb.cf.ch7;

public class StrEquals {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = "ATHENS";

        boolean equal1 = s1.equals(s2);
        boolean equal2 = s1.equals(s3);
        boolean equal3 = s1.equalsIgnoreCase(s3);

        boolean equal4 = s1.toUpperCase().equals(s3.toUpperCase());

        System.out.println(equal1);
        System.out.println(equal2);
        System.out.println(equal3);
        System.out.println(equal4);
    }
}
