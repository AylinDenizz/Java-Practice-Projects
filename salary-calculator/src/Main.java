import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(  "Aylin", new BigDecimal(10000), 45,2005);
        System.out.println(employee);
        employee.raiseSalary();
        System.out.println(employee);
        int bonus = employee.bonus();
        System.out.println("bonus is : "+ bonus);

    }
}