package topic8;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 41, "+XX XXX XXX XXX");

        // Correct person details via setters
        person.setName("Juan Doe");
        person.setAge(42);
        person.setPhone("+34 612 456 789");

        // Showing person details via getters - method 1
        System.out.printf("%s: %d years, phone number %s\n",
                person.getName(), person.getAge(), person.getPhone());

        // Showing person details via toString method -method 2
        System.out.println(person);
    }
}