package proxyComposite;

public class Employee implements FSStructualUnit {
    private String name;
    private int salary;
    private String division;

    public Employee(String name, int salary, String division) {
        setName(name);
        setSalary(salary);
        setDivision(division);
    }

    @Override
    public void paySalary() {
        System.out.println("Я, " + name + ", сотрудник " + division + ", получил зарплату в размере " + salary + ".");
    }

    @Override
    public void signSafety() {
        System.out.println("Я, " + name + ", сотрудник " + division + ", подписал технику безопасности.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

}
