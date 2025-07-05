public class  Main{
    public static void main(String[] args) {
        message(1);

    }

    static void message(int n){
        if(n==5){
            System.out.print(5);
            return;
        }
        System.out.println(n);
        message(n+1);
       
    
         }

    

         

    

    }
