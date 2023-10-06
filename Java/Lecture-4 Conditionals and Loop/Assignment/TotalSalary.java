import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int basSalary = sc.nextInt();
        char gread = sc.next().charAt(0);

        double hra = basSalary*0.2;
        double da = basSalary*0.5;
        double pf = basSalary*0.11;
        int allow;
        if (gread == 'A') {
            allow = 1700;
        }
        else if(gread == 'B') {
            allow = 1500;
        }
        else{
            allow = 1300;
        }
        int TotalSalary = (int) Math.round(basSalary + da + allow + hra - pf);
        System.out.println(TotalSalary);
        sc.close();
    }
}
