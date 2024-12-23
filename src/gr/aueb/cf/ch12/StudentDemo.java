package gr.aueb.cf.ch12;

public class StudentDemo {

    public static void main(String[] args) {
        Student student = new Student();                                // Invoke Default Constructor
        Student bob = new Student(2,"Bob", "D.");  // Invoke Overloaded Constructor


        student.setId(1);                                                            //student.id = 1;
        student.setFirstname("Alice");                                               //student.firstname = "Alice";
        student.setLastname("W.");                                                   //student.lastname = "W.";


        System.out.println("ID: " + student.getId());
        System.out.println("Firstname: " + student.getFirstname());
        System.out.println("Lastname: " + student.getLastname());


        System.out.println("ID: " + bob.getId());
        System.out.println("Firstname: " + bob.getFirstname());
        System.out.println("Lastname: " + bob.getLastname());

        System.out.println("Students Instances Count: " + Student.getStudentsCount());



//        System.out.println("Id: " + student.id);
//        System.out.println("Firstname: " + student.firstname);
//        System.out.println("Lastname: " + student.lastname);
//        System.out.println(" " + student.firstname + " " + student.lastname + "  " + student.id);
    }
}
