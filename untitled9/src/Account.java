public abstract class  Account {
    protected int balance;

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);

    public boolean transfer(Account account, long amount) {
        if (pay(amount)) {
            if ((account.add(amount))) {
                return true;
            } else {
                add(amount);
                return false;
            }
        } else {
            return false;
        }
    }
    public int getBalance(){
        return balance;
    }
}


