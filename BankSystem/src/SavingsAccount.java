/**
 * Created by Gary on 13/08/2017.
 */
public class SavingsAccount extends Account{

    private float interestRate;

    public SavingsAccount(String accountName, int accountId, boolean isActive, float interestRate) {
        super(accountName, accountId, isActive);
        this.interestRate = interestRate;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public float checkBalance(){
        return balance;
    }

    public void deposit(float amount){
        balance += amount;
    }

    public void addInterest(){
        float interestToAdd;

        interestToAdd = (balance * interestRate)/100;
        balance += interestToAdd;
    }
}