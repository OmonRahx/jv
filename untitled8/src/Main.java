import taxes.TaxDebit;
import taxes.TaxDebitMinusCredit;
import taxes.TaxSystem;

public class Main {
    public static void main(String[] args) {

        taxes.TaxSystem TaxDebit = new TaxDebit();
        taxes.TaxSystem TaxDebitMinusCredit = new TaxDebitMinusCredit();
        Company company = new Company("Romashka");
        company.shiftMoney(1500);
        company.shiftMoney(-1500);
        company.shiftMoney(2500);
        TaxSystem taxSystem = TaxDebitMinusCredit;
        company.setTaxSystem(taxSystem);
        company.payTaxes();
        company.shiftMoney(1500);
        company.payTaxes();
    }
}

