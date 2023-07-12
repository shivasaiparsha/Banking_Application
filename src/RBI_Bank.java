public    interface RBI_Bank {

    public String deposit(int money);
    public String withdraw(int money, String password);

    public String checkBalacne(String password);
    public Double calculateInterest(int time);
}
