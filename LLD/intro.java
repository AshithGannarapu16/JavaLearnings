// // package LLD;
// import LLD.Student;

// Convention: Class names should start with a Capital letter (Intro)
 
public class intro {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.id = 1;
        student1.name = "Alice";
        student1.age = 20;
        student1.gradYear = 2024;

        Student student2 = new Student();
        student2.id = 2;
        student2.name = "Bob";
        student2.age = 22;
        student2.gradYear = 2023;

        System.out.println("Student 1 Information:");
        student1.displayInfo();

        System.out.println("\nStudent 2 Information:");
        student2.displayInfo();


    }
} 

  
