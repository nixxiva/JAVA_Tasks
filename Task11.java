public class Task11 {
    public static class Book{
        String title;
        String author;
        int yearPublished;
        double price;

        Book(String title, String author, int yearPublished, double price){
            this.title = title;
            this.author = author;
            this.yearPublished = yearPublished;
            this.price = price;
        }
    }

    public static class testingTheBook{
        public static void main(String[] args) {
            Book b1 = new Book("The Untold Story", "Rose Ann Pelagio", 2026, 21_500);
            Book b2 = new Book("Harry Potah", "Rolling Rolls", 1983, 23_350);
            Book b3 = new Book("Desaparesidos", "Lualhati Bautista", 1994, 3000);
            // (b1.title, b1.author, b1.yearPublished, b1.price).toString());fix this
        }
    }
}
