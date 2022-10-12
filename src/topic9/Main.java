package topic9;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Juan Doe");
        client.setAge(42);
        client.setPhone("+34 612 456 789");
        client.setCredit("+ABC");
        System.out.printf("The client '%s' is %d years-old, with phone number '%s', credit: '%s'\n",
                client.getName(), client.getAge(), client.getPhone(), client.getCredit());

        Employee employee = new Employee();
        employee.setName("Ana Gomez");
        employee.setAge(27);
        employee.setPhone("+34 622 333 444");
        employee.setSalary(31500);
        System.out.printf("The employee '%s' is %d years-old, with phone number '%s', salary: %s euros (gross)/year",
                employee.getName(), employee.getAge(), employee.getPhone(), employee.getSalary());
    }
}