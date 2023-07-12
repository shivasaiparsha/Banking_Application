public class UNION_Bank implements RBI_Bank {


    private String accountNo;

    private String password;

    private double balance;
    private double minimumbalance=500;
    private double rateOfInterest = 7.5;

    public UNION_Bank(String accountNo,String password,double balance)
    {
        this.accountNo = accountNo;
        this.password = password;
        this.balance = balance;
    }

    public String deposit(int money) {

        if(money>0){
            balance = balance + money;
            return "Money :"+money+" has been added to your account. Total " +
                    "balance is"+balance;
        }
        else{
            return "Incorrect money entered";
        }
    }
    public String withdraw(int money,String password)
    {
        if(password.equals(this. password))
        {
            if(balance-minimumbalance>=money)
            {
                balance-=money;
                return ""+money+" has been withdrawn remaining balance"+balance;
            }
            else
            {
                return "Insufficent money";
            }
        }
        else {
            return "wrong passord entered";
        }
    }
    public String checkBalacne(String password) {

        if(this.password.equals(password)){
            return "The balance is "+this.balance;
        }else{
            return "Wrong password entered";
        }
    }

    public Double calculateInterest(int time) {

        Double simpleInterest = (balance*time*rateOfInterest)/100;

        return simpleInterest;

    }

}
