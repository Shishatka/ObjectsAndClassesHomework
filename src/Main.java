//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author LeoTolstoy = new Author("Leo", "Tolstoy");
        Author FyodorDosoevsky = new Author("Fyodor", "Dostoevsky");
        Book bookA = new Book("War and Peace", LeoTolstoy, 1867);
        Book bookB = new Book("Crime and Punishment", FyodorDosoevsky, 1860);
        Book bookC = new Book("War and Peace", LeoTolstoy, 1867);

        bookB.setYearOfPublication(1866);
        System.out.println(bookB.getYearOfPublication());

        Author FyodorDosoevsky2 = new Author("Fyodor", "Dostoevsky");

        FyodorDosoevsky.equals(LeoTolstoy);
        System.out.println(FyodorDosoevsky.hashCode());
        System.out.println(bookA.equals(bookC));

    }
}