public class Main {
    public static void main(String[] args) {
        Person person = new Person("Raya", 19);
        person.display();
        person.adult();
        person.setName("Sana");
        System.out.println("the updated name is: "+ person.getName());
        person.setAge(10);
        System.out.println("the updated age is: "+ person.getAge());
        person.adult();
    }
}