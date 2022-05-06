public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(10);
        employeeBook.addEmployee(new Employee("Дмитрий", "Иванов", "Сергеевич", 80000, 2)); // добавить нового сотрудника
        employeeBook.addEmployee(new Employee("Виктория", "Зотова", "Николаевна", 132000,1));
        employeeBook.addEmployee(new Employee("Кирилл", "Лебедев", "Владимирович", 95000, 3));
        employeeBook.addEmployee(new Employee("Юрий", "Семенов", "Андреевич", 138000, 2));
        employeeBook.addEmployee(new Employee("Наталья", "Петрова", "Вадимовна", 112000, 4));
        employeeBook.addEmployee(new Employee("Ирина", "Соколова", "Михаиловна", 118720, 1));
        employeeBook.addEmployee(new Employee("Егор", "Попов", "Леонидович", 118720, 1));
        employeeBook.addEmployee(new Employee("Ксения", "Антонова", "Юрьевна", 118720, 1));
        employeeBook.addEmployee(new Employee("сотрудник", "это", "на удаление",10,1));
        employeeBook.deleteEmployee("это сотрудник на удаление", 9); // удалить сотрудника
        employeeBook.changeEmployeeSalary("Иванов Дмитрий Сергеевич", 100000); // изменить зарплату сотрудника
        employeeBook.changeEmployeeDepartment("Антонова Ксения Юрьевна", 5); // изменить отдел сотрудника
        employeeBook.printAllEmployeeList(); // напечатать всю информацию по всем сотрудникам
        System.out.println();
        System.out.println(employeeBook.countTotalSalary()); // посчитать общую зарплату
        System.out.println(employeeBook.findMaxSalary()); // найти максимальную зарплату
        System.out.println(employeeBook.findMinSalary()); // найти минимальную зарплату
        System.out.println(employeeBook.countAverageSalary()); // найти среднюю зарплату
        System.out.println();
        employeeBook.printAllFullNames(); // напечатаь все ФИО
        System.out.println();
        employeeBook.indexSalary(1); // проиндексировать заплату всех сотрудникво
        System.out.println();
        System.out.println(employeeBook.findMaxDepSalary(1)); // найти макисмальную зарплату в отделе
        System.out.println(employeeBook.findMinDepSalary(1)); // найти минимальную зарплату в отделе
        System.out.println(employeeBook.countTotalDepSalary(1)); // посчитать общую зарплату в отделе
        System.out.println(employeeBook.countAverageDepSalary(1)); // посчиать среднюю зарплату в отделе
        System.out.println();
        employeeBook.indexDepSalary(1,1); // проиндексировать зарплату в отделе
        System.out.println();
        employeeBook.printDepartmentMembers(1); // напечатать сотрудниквов в отделе
        System.out.println();
        employeeBook.sortBySalaryLess(115000); // Найти всех сотрудников с зарплатой меньше числа
        System.out.println();
        employeeBook.sortBySalaryMore(130000); // Найти всех сотрудников с зарплатой больше числа
        System.out.println();
        employeeBook.printEmployeeByDepartment(); // Получить ФИО всех сотрудников по отделам
    }
}
