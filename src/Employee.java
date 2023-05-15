public class Employee {
    private Integer id;
    private String fullName;
    private Integer department;
    private Integer salary;
    private static Integer idCounter = 1;


    public Employee(String fullName, Integer department, Integer salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter++;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getDepartment() {
        return department;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getId() {
        return id;
    }

    public int getIdCounter() {
        return idCounter;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ФИО " + fullName + '\'' +
                ", Отдел " + department +
                ", Зарплата " + salary +
                ", id=" + id +
                '}';
    }
}
