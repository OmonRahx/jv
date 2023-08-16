package taxes;

public class TaxDebitMinusCredit extends TaxSystem{
    @Override
    public int calcTaxFor(int debit, int credit) {
        int difference = debit - credit;
        return difference > 0 ? (int) Math.round(difference * 0.15) : 0;
    }
}
