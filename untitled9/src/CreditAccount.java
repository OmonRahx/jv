public class CreditAccount extends Account {
    private int creditLimit;

    public CreditAccount(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean add(long amount) {
        if (balance + amount > 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (balance - amount < -creditLimit){
            return false;
        }
        balance -= amount;
        return true;
    }
}
