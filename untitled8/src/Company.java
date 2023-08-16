import taxes.TaxDebit;
import taxes.TaxSystem;
public class Company {
    protected String title;
    protected int debit = 0;
    protected int credit = 0;
    protected TaxSystem taxSystem;

    public Company(String title) {
        this.title = title;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }


        public void payTaxes() {
            System.out.println("Компания " + title + " оплатила налог в размере " + taxSystem.calcTaxFor(debit, credit) + "руб.");
            debit = 0;
            credit = 0;

        }
    }




