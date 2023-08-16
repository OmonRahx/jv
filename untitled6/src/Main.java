import taxes.TaxSystem;
import taxes.Usn15;
import taxes.Usn6;

public class Main {
    public static void main(String[] args) {
        taxes.TaxSystem TaxDebit = new Usn6();
        taxes.TaxSystem TaxDebitMinusCredit = new Usn15();
        Company company = new Company("Ромашка", Usn15);
        company.shiftMoney(1000);
        company.shiftMoney(-1000);
        company.shiftMoney(2000);
        TaxSystem taxSystem =
        company.setTaxSystem(taxSystem);
        company.payTaxes();
        company.shiftMoney(1000);
        company.payTaxes();
    }
}