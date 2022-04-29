public class Main {
    static Employee[] employees = new Employee[10];

    public static void printAllEmployeeList() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
    public static int countTotalSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public static int findMinSalary(Employee[] employees) {
        int minSalary = 1_000_000;
        for (Employee employee : employees) {
            if (employee == null) {
                break;
            }
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }
    public static int findMaxSalary(Employee[] employees) {
        int maxSalary = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                break;
            }
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }
    public static int countAverageSalary(Employee[] employees) {
        return countTotalSalary(employees) / Employee.getCount();
    }
    public static void printAllFullNames(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
    public static void main(String[] args) {
        Employee ivanov = new Employee("Дмитрий", "Иванов", "Сергеевич", 121000, 2);
        Employee zotova = new Employee("Зотова", "Виктория", "Николаевна", 132000, 1);
        Employee lebedev = new Employee("Кирилл", "Лебедев", "Владимирович", 95000, 3);
        Employee semenov = new Employee("Юрий", "Семенов", "Андреевич", 138000,2);
        Employee petrova = new Employee("Наталья", "Петрова", "Вадимовна", 112000, 4 );
        employees[0] = ivanov;
        employees[1] = zotova;
        employees[2] = lebedev;
        employees[3] = semenov;
        employees[4] = petrova;

        printAllEmployeeList(); // Получить список всех сотрудников со всеми имеющимися по ним данными
        System.out.println(countTotalSalary(employees)); // Посчитать сумму затрат на зарплаты в месяц.
        System.out.println(findMinSalary(employees)); // Найти сотрудника с минимальной зарплатой.
        System.out.println(findMaxSalary(employees)); // Найти сотрудника с максимальной зарплатой.
        System.out.println(countAverageSalary(employees)); // Подсчитать среднее значение зарплат.
        printAllFullNames(employees); // Получить Ф. И. О. всех сотрудников
    }
}
