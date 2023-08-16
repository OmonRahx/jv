package taxes;

public class Usn15 extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
       if (debit <= credit) {
           return 0;
       }
       return (debit - credit) * 15 / 100;
    }

}
