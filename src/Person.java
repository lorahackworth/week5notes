public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.getName() + " is " + this.getAge() + " years old";
    }

    public void display(){
        System.out.println(this.getName() + " is " + this.getAge() + " years old.");
    }

    public void read(Book a){
        System.out.println(this.getName() + " is reading the book titled " + a.getTitle());
    }
}
