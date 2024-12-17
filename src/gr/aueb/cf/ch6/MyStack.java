package gr.aueb.cf.ch6;

public class MyStack {
    static int[] stack = new int[50];
    static int top = -1;

    public static void main(String[] args) {

    }

    public static void push(int num) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = num;
    }

    private static int pop(){
        if (isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        return stack[top--];
    }

    private static void printStack(){
        if (isEmpty()) System.out.println("Stack is empty");

        for (int i= 0; i <= top;i++){
            System.out.println(stack[i]);
        }
    }
    public static boolean isFull(){
        return top == stack.length -1;
        // ειναι Φουλ οταν το top εχει φτασει στο τελευταιο στοιχειο της στηβας(stack)
    }

    public static boolean isEmpty(){
        return top == -1;
        // ειναι αδιο οταν το τοπ ειναι -1.
    }
}
