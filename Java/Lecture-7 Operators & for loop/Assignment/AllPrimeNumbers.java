import java.util.Scanner;

public class AllPrimeNumbers {
    public static void main(String arg[]){
        int n,counter, i,  j;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        
        for(j=2; j<=n; j++){
            counter=0;
            for(i=2; i<=(j+1)/2; i++){
                if(j%i==0){
                    counter++;
                    break;
                }
            }
            if(counter==0)
                System.out.println(j);
        }
   }
}