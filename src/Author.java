public class Author {

    private String firstName;
    private String lastName;

    public Author (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return "Имя - " + firstName + ". Фамлия -" + lastName;
    }

    public boolean equals(Author author) {
        if (author.toString().equals(this.toString())) {
            System.out.println("Автор один и тот же");
            return true;
        } else {
            System.out.println("Авторы разные");
            return false;
        }
    }
    public int hashCode() {
        return java.util.Objects.hash(this.toString());
    }
}
