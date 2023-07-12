public class SBI_Bank implements RBI_Bank{
    private String accNo;
    private String password;
    private double rateOfInterest=6.0;
    private double balance;

    private Integer minimumBalance=500;

    public SBI_Bank(String accNo, String password, double balance)
    {
        this.accNo=accNo;
        this.password=password;
        this.balance=balance;
    }

    public String withdraw(int money, String password)
    {
        if(this.password.equals(password))
        {
            if(balance-minimumBalance>=money)
            {
                balance=balance-money;
                return "Money"+money+"has been withdrawn successfully";
            }
            else
            {
                return "insufficient balance "+balance+"found";
            }

        }
        else
        {
            return "wrong password entered";
        }
    }

    public String deposit(int money)
    {
        if(money>0)
        {
            balance+=money;
            return "Money added successfully";
        }
        else
        {
            return "wrong money entered";
        }
    }


    public Double calculateInterest(int time) {

        Double simpleInterest = (balance*time*rateOfInterest)/100;
        return simpleInterest;
    }
    public String checkBalacne(String password) {

        if(password.equals(this.password)){
            return "The balance is "+this.balance;
        }else{
            return "Wrong password entered";
        }
    }

}
