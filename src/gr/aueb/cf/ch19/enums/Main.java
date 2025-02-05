package gr.aueb.cf.ch19.enums;

import gr.aueb.cf.ch12.model.User;

public class Main {

    public static void main(String[] args) {
        UserRole roleStudent = UserRole.STUDENT;
        String strRole = roleStudent.name(); // like toString()
        System.out.println(strRole);


        UserRole role = UserRole.valueOf(strRole);
        System.out.println(role);
    }
}
