public class Main {

    public static Employee[] employees = {
            new Employee("Гончарова Алиса Владимировна", 1, 30000),
            new Employee("Поляков Мирон Эрикович", 1, 25000),
            new Employee("Золотарев Даниил Маркович", 2, 40000),
            new Employee("Ильина Маргарита Данииловна", 2, 70000),
            new Employee("Панов Фёдор Викторович", 3, 35000),
            new Employee("Богомолов Илья Владиславович", 3, 45000),
            new Employee("Князев Николай Львович", 4, 27000),
            new Employee("Агафонов Леонид Романович", 4, 32000),
            new Employee("Козлова Кристина Александровна", 5, 51000),
            new Employee("Медведев Александр Филиппович", 5, 39500)
    };
    public static void main(String[] args) {
        System.out.println("Задание 1");
        printEmployees();
        System.out.println("Задание 2");
        totalSalary();
        System.out.println("Задание 3");
        lowestSalaryEmployee();
        System.out.println("Задание 4");
        highestSalaryEmployee();
        System.out.println("Задание 5");
        averageSalary();
        System.out.println("Задание 6");
        printEmployeesFullName();
    }


    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee + " ");
        }
    }

    private static int totalSalary() {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }

        System.out.println(totalSalary);
        return totalSalary;

    }

    public static void lowestSalaryEmployee() {
        Employee lowestSalaryEmployee = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary() < lowestSalaryEmployee.getSalary()) {
                lowestSalaryEmployee = employee;
            }
        }

        System.out.println(lowestSalaryEmployee +" это сотрудник с минимальной зарплатой");

    }

    public static void highestSalaryEmployee() {
        Employee lowestSalaryEmployee = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary() > lowestSalaryEmployee.getSalary()) {
                lowestSalaryEmployee = employee;
            }
        }

        System.out.println(lowestSalaryEmployee + " это сотрудник с максимальной зарплатой");

    }

    public static void averageSalary() {
        int averageSalary;
        averageSalary = totalSalary() / employees.length;

        System.out.println("Среднее значение зарплат = " + averageSalary);
    }

    public static void printEmployeesFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}