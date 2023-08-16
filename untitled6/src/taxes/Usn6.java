package taxes;

public class Usn6 extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return debit * 6 / 100;
    }
}
