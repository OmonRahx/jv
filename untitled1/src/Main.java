// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import my.favourite.code.TaxUsn;
import my.favourite.code.Usn;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int earnings = 0;
        int spendings = 0;
        while (true) {
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
             int operation = Integer.parseInt(input);
             switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String moneyStr = scanner.nextLine();
                    int money = Integer.parseInt(moneyStr);
                    earnings = earnings + money;
                    break;
                case 2:
                    System.out.println("Введите сумму расходов:");
                    String moneyStr1 = scanner.nextLine();
                    int money1 = Integer.parseInt(moneyStr1);
                    spendings = spendings + money1;
                    break;
                case 3:
                    int UsnTax6 = Usn.usnTax6(earnings);
                    int TaxEarningsMinusSpendings15 = TaxUsn.taxEarningsMinusSpendings(earnings, spendings);

                    if (TaxEarningsMinusSpendings15 > UsnTax6) {
                        int Economy = TaxEarningsMinusSpendings15 - UsnTax6;
                        System.out.println("Мы советуем вам УСН доходы");
                        System.out.println("Ваш налог составит: " + UsnTax6 + " рублей");
                        System.out.println("Налог на другой системе: " + TaxEarningsMinusSpendings15 + " рублей");
                        System.out.println("Экономия: " + Economy + " рублей");
                    } else if (TaxEarningsMinusSpendings15 < UsnTax6){
                        int Economy = UsnTax6 - TaxEarningsMinusSpendings15;
                        System.out.println("Мы советуем вам УСН доходы минус расходы");
                        System.out.println("Ваш налог составит: " + TaxEarningsMinusSpendings15 + " рублей");
                        System.out.println("Налог на другой системе: " + UsnTax6 + " рублей");
                        System.out.println("Экономия: " + Economy + " рублей");
                    } else {
                        System.out.println("Налоги равны");
                    }

                    break;


                default:
                    System.out.println("Такой операции нет");
            }
        }
        System.out.println("Программа завершена!");
        }
    }
