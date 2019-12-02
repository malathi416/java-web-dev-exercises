package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
//        Student details = new Student();
//        details.setName("Malathi");
//        details.setStudentId(1);
//        details.setNumberOfCredits(1);
//        details.setGpa(4.0);
        Student firstStudent = new Student("Malathi",1,1,4.0);
        //toString method calling
        Student person = new Student("Violet");
        System.out.println(person.toString());
        System.out.println(person);
        //checking equals
        Student student1 = new Student("Maria", 1234);
        Student student2 = new Student("Maria", 1234);
//
//        System.out.println(student1.name + ", " + student1.id + ": " + student1);
//        System.out.println(student2.name + ", " + student2.id + ": " + student2);
        System.out.println(student1 == student2);
    }
}
