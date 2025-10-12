public class greet {
    // static void printHello(){
    //     System.out.println("Hello");
    // }
    public static void main(String[] args) {
    //     printHello();
    //     int ans=sum(5,6);
    //     System.out.println(ans);
    // }

    // static int sum(int a,int b){
    //     return a+b;
    // }
    String personalised=myGreet("Ashith Gannarapu S/O Gannarapu  murali");
    System.out.println(personalised);

    String personalised2=myGreet("Ashith");
    System.out.println(personalised2);



    }

    static String myGreet(String name){
        String message="Hello "+name;
        return message;
    }
}