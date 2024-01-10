interface Bank {
    double calculateInterestRate();
}
class SavingsAccount implements Bank {
    private double balance;
    private double interestRate;
    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }
    @Override
    public double calculateInterestRate() {
        return balance * interestRate;
    }
}
class CreditAccount implements Bank {
    private double balance;
    private double interestRate;
    public CreditAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }
    @Override
    public double calculateInterestRate() {
        return balance * interestRate;
    }
}
