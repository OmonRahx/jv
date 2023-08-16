package taxes;

public class TaxDebit extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return (int) Math.round(debit * 6 / 100);
    }
}



