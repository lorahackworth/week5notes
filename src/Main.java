public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Person person1 = new Person("Joe", 14);
        Person person2 = new Person("Kieran", 40);
        System.out.println(person1);

        person2.display();

        Book book1 = new Book("Goosebumps", "R.L. Stine", "Thriller", 100);

        Book book2 = new Book("Programming Logic", "Joyce Ferrell", "Comp Sci", 25);

        System.out.println(book1);
        System.out.println(book2);

        System.out.println(Book.numBooks);

        person2.read(book2);
    }
}