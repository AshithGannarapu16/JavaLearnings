public class pi{
    // public static void main(String[] args){
    //     int r=5;
    //     double area=areaOfCircle(r);
    //     System.out.println("Area of circle with radius "+r+" is: "+area);
    // }
    // static double areaOfCircle(int r){
    //     double area=Math.PI*r*r;
    //     return area;
        
    // }

    // public static void main(String[] args) {
    //    System.out.println(evenSum(6)); 
    // }

    // static int evenSum(int n){
    //     int sum=0;
    //     for(int i=2;i<=n;i++){
    //         sum+=i;
    //     }
    //     return sum;
    // }

    public static void main(String[] args) {
         System.out.println(isEven(61));
         System.out.println("Hello");
    }

    static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}