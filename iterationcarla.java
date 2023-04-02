import java.util.Scanner;
public class iterationcarla {
    public static void main(String [] args){
        Scanner c = new Scanner(System.in);

        while (true){
       System.out.print("masukan angka:");
       int num = c.nextInt();

       int result = 1;
       String factString = ""; 

       for (int i=1; i<= num; i++){
           result = result*i;
           factString = factString + " * " + i;
       }
       
       if (num <= 0) {
           System.out.println("Perkalian faktorial adalah :" +result);
           System.out.println("hasilnya adalah :"+result );
           break;}

       System.out.println("perkalian faktorial adalah :" +factString);
       System.out.println("hasilnya adalah :" +result);
       
   }
    }
}

