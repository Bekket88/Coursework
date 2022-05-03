public class Main {
    static Employee[] employees = new Employee[10];

    public static void printAllEmployeeList() { // напечатать список всех сотрудников со всеми параметрами.
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
    public static int countTotalSalary(Employee[] employees) { // посчитать расходы на зарплаты
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public static int findMinSalary(Employee[] employees) { // найти минимальную зарплату.
        int minSalary = 1_000_000;
        for (Employee employee : employees) {
            if (employee == null) {
                break;
            }
            else if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }
    public static int findMaxSalary(Employee[] employees) { // найти максимальную зарплату.
        int maxSalary = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                break;
            }
            else if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }
    public static int countAverageSalary(Employee[] employees) { // посчитать среднюю зарплату.
        return countTotalSalary(employees) / Employee.getCount();
    }
    public static void printAllFullNames(Employee[] employees) { // напечатать все ФИО
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
    public static void indexSalary(Employee[] employees, int indexSalary) { // проиндексировать зарплату
        int index = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                index = employee.getSalary() * indexSalary / 100;
                index += employee.getSalary();
                employee.setSalary(index);
                System.out.println(employee.getLastName() + " после индексации зарплаты на " + indexSalary + "% получает " + employee.getSalary() + " рублей.");
            }
        }
    }
    public static int findMinDepSalary (Employee[] employees, int department) { // найти минимальную зарплату в отделе
        int minSalary = 1_000_000;
        for (Employee employee : employees) {
            if (employee == null) {
                break;
            }
            else if (employee.getDepartment() == department) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                }
            }
        }
        return minSalary;
    }
    public static int findMaxDepSalary (Employee[] employees, int department) { // найти максимальную зарплату в отделе
        int maxSalary = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                break;
            }
            else if (employee.getDepartment() == department) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                }
            }
        }
        return maxSalary;
    }
    public static int countTotalDepSalary(Employee[] employees, int department) { // посчитать расходы на отдел
        int employeesInDep = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                break;
            }
            else if (employee.getDepartment() == department) {
                sum += employee.getSalary();
                employeesInDep++;
            }
        }
        return sum / employeesInDep;
    }

    public static void indexDepSalary(Employee[] employees ,int indexSalary, int department) { // проиндексировать зарплату в отделе
        int index = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                index = employee.getSalary() * indexSalary / 100;
                index += employee.getSalary();
                employee.setSalary(index);
                System.out.println(employee.getLastName() + " из отдела N" + employee.getDepartment() + " получает " + employee.getSalary() + " рублей, после индексации зп на " + indexSalary + "%");
            }
        }
    }
    public static void printDepartmentMembers (Employee[] employees, int department) { // напечатать ФИО сотрудников в отделе
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println("Id=" + employee.getId() + ", " + employee.getFullName() + ", " + employee.getSalary());
            }
        }
    }
    public static void sortBySalaryLess (Employee[] employees, int salary) { // найти сотрудников с зарплатой ниже чем число
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println("Id=" + employee.getId() + ", " + employee.getFullName() + ", " + employee.getSalary());
            }
        }
    }
    public static void sortBySalaryMore (Employee[] employees, int salary) { //  найти сотрудников с зарплатой выше чем число
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= salary) {
                System.out.println("Id=" + employee.getId() + ", " + employee.getFullName() + ", " + employee.getSalary());
            }
        }
    }

    public static void main(String[] args) {
        Employee ivanov = new Employee("Дмитрий", "Иванов", "Сергеевич", 100000, 2);
        Employee zotova = new Employee("Виктория", "Зотова", "Николаевна", 132000, 1);
        Employee lebedev = new Employee("Кирилл", "Лебедев", "Владимирович", 95000, 3);
        Employee semenov = new Employee("Юрий", "Семенов", "Андреевич", 138000,2);
        Employee petrova = new Employee("Наталья", "Петрова", "Вадимовна", 112000, 4);
        Employee sokolova = new Employee("Ирина", "Соколова", "Михаиловна", 118720, 1);
        Employee popov = new Employee("Егор", "Попов", "Леонидовч", 129900, 3);
        Employee antonova = new Employee("Ксения", "Антовоа", "Юрьевна", 92300, 1);

        employees[0] = ivanov;
        employees[1] = zotova;
        employees[2] = lebedev;
        employees[3] = semenov;
        employees[4] = petrova;
        employees[5] = sokolova;
        employees[6] = popov;
        employees[7] = antonova;

        printAllEmployeeList(); // Получить список всех сотрудников со всеми имеющимися по ним данными
        System.out.println();
        System.out.println(countTotalSalary(employees)); // Посчитать сумму затрат на зарплаты в месяц.
        System.out.println(findMinSalary(employees)); // Найти сотрудника с минимальной зарплатой.
        System.out.println(findMaxSalary(employees)); // Найти сотрудника с максимальной зарплатой.
        System.out.println(countAverageSalary(employees)); // Подсчитать среднее значение зарплат.
        System.out.println();
        printAllFullNames(employees); // Получить Ф. И. О. всех сотрудников
        System.out.println();
        indexSalary(employees, 1); // Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %)
        System.out.println();
        System.out.println(findMinDepSalary(employees, 1)); // Найти в отделе сотрудника с макс зарплатой.
        System.out.println(findMaxDepSalary(employees, 1)); // Найти в отделе сотрудника с мин зарплатой.
        System.out.println(countTotalDepSalary(employees, 1)); //Посчитать сумму затрат на отдел.
        System.out.println();
        indexDepSalary(employees,1,2); // Проиндексировать зарплату в отделе.
        System.out.println();
        printDepartmentMembers(employees, 1); // Напечатать всех сотрудников отдела
        System.out.println();
        sortBySalaryLess(employees, 100000); // Напечатать всех сотрудников с зарплатой меньше числа.
        System.out.println();
        sortBySalaryMore(employees, 130000); // Напечатать всех сотрудников с зарплатой больше числа.
    }
}
