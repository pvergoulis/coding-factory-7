package gr.aueb.cf.ch7;

public class StrTraverse {

    public static void main(String[] args) {
      String s1 = "Word";
      String s2 = "of";
      String s3 = "Warcraft";

      String s4 = s1 + " "+ s2 + " "+ s3;

      for (int i = 0; i < s4.length();i++){
          System.out.print(s4.charAt(i)+ " ");
      }
    }
}
