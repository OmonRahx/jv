import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumProducts = 0;


        String[] products = {"Молоко", "Хлеб", "Гречка"};
        int[] prices = {80, 27, 120};
        System.out.println("Список возможных товаров для покупки:");
        int[] count = new int[products.length];

        for (int i = 0; i < products.length; i++) {
            System.out.println(i + 1 + "." + products[i] + " " + prices[i] + " " + "руб/шт");
        }

        while (true) {
            System.out.println("Выберите номер товара и количество или введите 'end'");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            if ("end".equals(input)) {
                System.out.println("Ваша корзина: ");

                for (int i = 0; i < count.length; i++) {
                    if (count[i] > 0) {
                        System.out.println(products[i] + " " + count[i] + " " + "шт" + " " + prices[i] + " " + "руб/шт" + " " + prices[i] * count[i] + " " + "руб в сумме");
                    }
                }

                System.out.println("Итого " + sumProducts + " " + "рублей");
                break;
            }

            int productNumber = Integer.parseInt(parts[0]) - 1;
            int productCount = Integer.parseInt(parts[1]);
            count[productNumber] += productCount;
            sumProducts += count[productNumber] * prices[productNumber];
        }
    }

}
