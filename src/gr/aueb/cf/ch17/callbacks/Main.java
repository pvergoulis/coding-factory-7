package gr.aueb.cf.ch17.callbacks;

public class Main {

    public static void main(String[] args) {


        doPrint(new IPrintable() {
            @Override
            public void print() {
                System.out.println("Hello World");
            }
        });

        doPrint(new IPrintable() {
            @Override
            public void print() {
                System.out.println("Hello Coding!");
            }
        });
    }

    public static void doPrint(IPrintable iPrintable) {
        iPrintable.print();
    }
}
