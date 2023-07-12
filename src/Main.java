import java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello User!");
        System.out.println("Which bank you want to open an account");
        System.out.println("Print 1 to create in SBI_Bank and 2 to create in UNION_Bank");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        System.out.println("Enter password and initial deposit");
        String password = sc.next();
        Double initialBalance = sc.nextDouble();

        double account=Math.abs(Math.random()*Math.pow(10,9));
        String stringVersion = String.valueOf(account);

               RBI_Bank newBankAcc ;

               if(option==1) {
                   newBankAcc = new SBI_Bank(stringVersion, password, initialBalance);
               }
               else
               {
                   newBankAcc=new UNION_Bank(stringVersion, password, initialBalance);
               }

               String result = newBankAcc.withdraw(500,"shiva123");
               System.out.println(result);

        }
}