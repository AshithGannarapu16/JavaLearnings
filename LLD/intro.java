package LLD;

// Convention: Class names should start with a Capital letter (Intro)
public class intro { 
    String name; // 'String' must be capitalized
    int age;

    public intro(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public static void main(String[] args) {
    intro person = new intro("Alice", 30);
    System.out.println("Name: " + person.getName());
    System.out.println("Age: " + person.age);


} 


}
  
