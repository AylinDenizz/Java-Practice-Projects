import java.math.BigDecimal;

public class Employee {
    private String name;
    private BigDecimal salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, BigDecimal salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public int bonus() {
        int bonus = 0;
        if (this.workHours >= 40) {
            bonus = (this.workHours - 40) * 30;
        }
        return bonus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }

    public void raiseSalary() {
        int workTime = 2021 - this.hireYear;
        if(workTime < 10) {
            this.setSalary(this.getSalary().multiply(new BigDecimal(105)).divide(new BigDecimal(100)));

        }
        else if(workTime >=10 && workTime < 20) {
            this.setSalary(this.getSalary().multiply(new BigDecimal(110)).divide(new BigDecimal(100)));
        }
        else if (workTime >=20) {
            this.setSalary(this.getSalary().multiply(new BigDecimal(115)).divide(new BigDecimal(100)));
        }
    }

}


