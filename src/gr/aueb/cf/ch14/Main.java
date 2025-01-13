package gr.aueb.cf.ch14;

import gr.aueb.cf.ch14.model.Point;
import gr.aueb.cf.ch14.model.Teacher;
import gr.aueb.cf.ch14.services.CodingFactorySingleton;
import gr.aueb.cf.ch14.services.HelloUtil;

public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Pavlos" , "Vergoulis");
        Teacher teacher2 = new Teacher(2, "jim" , "Vergoulis");
        Teacher teacher3 = new Teacher(3, "K." , "Detsis");

        HelloUtil.sayHello();

        Point p1 = Point.getInstance();
        Point p2 = Point.getRandomPoint();

        System.out.println(p1);
        System.out.println(p2);


        CodingFactorySingleton cf1;
        cf1 = CodingFactorySingleton.getINSTANCE();
        CodingFactorySingleton cf2 = CodingFactorySingleton.getINSTANCE();

        System.out.println(cf1);
        System.out.println(cf2);


    }
}
