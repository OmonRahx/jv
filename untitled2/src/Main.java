public class Main {
    public static void main(String[] args) {
        Book book = new Book("Сто лет одиночества", 1967, "Габриэль Гарсия Маркес", 544);
        book.title = "Сто лет одиночества";
        book.releaseYear = 1967;
        book.author = "Габриэль Гарсия Маркес";
        book.pages = 544;

        System.out.println(book.isBig());
        System.out.println(book.matches("лет"));
        System.out.println(book.matches("Гарсия"));
        System.out.println(book.estimatePrice());

    }
}
