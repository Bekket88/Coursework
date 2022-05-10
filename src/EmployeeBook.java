public class EmployeeBook {

    private static Employee[] employees;

    public EmployeeBook(int numberOfEmployees) {
        employees = new Employee[numberOfEmployees];
    }
    public void addEmployee(Employee newEmployee) { // Добавить нового сотрудника (создаем объект, заполняем поля, кладем в массив).
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                break;
            }
        }
    }
    public void deleteEmployee(String fullName, int id) { // Удалить сотрудника
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName().equals(fullName) || employees[i].getId() == id) {
                employees[i] = null;
                break;
            }
        }
    }
    public void changeEmployeeSalary(String fullName, int newSalary) { // Изменить зарплату сотруднику
        for (Employee employee : employees) {
            if (employee.getFullName().equals(fullName)) {
                employee.setSalary(newSalary);
                break;
            }
        }
    }
    public void changeEmployeeDepartment(String fullName, int newDepartment) { // Изменить отдел сотрудника
        for (Employee employee : employees) {
            if (employee.getFullName().equals(fullName)) {
                employee.setDepartment(newDepartment);
                break;
            }
        }
    }
    public void printEmployeeByDepartment() { // Напечатать список всех сотрудников по отделам
        for (int dep = 1; dep <= 5; dep++) {
           listDepartmentMembers(dep);
        }
    }
    public void listDepartmentMembers (int department) { // напечатать ФИО сотрудников в отделе
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println("Отдел " + employee.getDepartment() + ", Id=" + employee.getId() + ", " + employee.getFullName() + ", " + employee.getSalary());
            }
        }
    }
    public void printAllEmployeeList() { // напечатать список всех сотрудников со всеми параметрами.
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
    public int countTotalSalary() { // посчитать расходы на зарплаты
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public void findMinSalary() { // найти минимальную зарплату.
        int minSalary = employees[0].getSalary();
        String worker = "";
        for (Employee employee : employees) {
            if (employee == null) {
                break;
            } else if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                worker = employee.getFullName();
            }
        }
        System.out.println("Минимальная зарплата: " + worker + " " + minSalary);
    }
    public void findMaxSalary() { // найти максимальную зарплату.
        int maxSalary = employees[0].getSalary();
        String worker = "";
        for (Employee employee : employees) {
            if (employee == null) {
                break;
            } else if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                worker = employee.getFullName();
            }
        }
        System.out.println("Максимальная зарплата: " + worker + " " + maxSalary);
    }
    public int countAverageSalary() { // посчитать среднюю зарплату.
        return countTotalSalary() / Employee.getCount();
    }
    public void printAllFullNames() { // напечатать все ФИО
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
    public void indexSalary(int indexSalary) { // проиндексировать зарплату
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
    public void findMinDepSalary (int department) { // найти минимальную зарплату в отделе
        int minSalary = 1_000_000;
        String worker = "";
        for (Employee employee : employees) {
            if (employee == null) {
                break;
            } else if (employee.getDepartment() == department) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    worker = employee.getFullName();
                }
            }
        }
        System.out.println("Минимальная зарплата в отеде: " + worker + " " + minSalary);
    }
    public void findMaxDepSalary (int department) { // найти максимальную зарплату в отделе
        int maxSalary = 0;
        String worker = "";
        for (Employee employee : employees) {
            if (employee == null) {
                break;
            }
            else if (employee.getDepartment() == department) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    worker = employee.getFullName();
                }
            }
        }
        System.out.println("Максимальная зарплата в отделе: " + worker + " " + maxSalary);
    }
    public int countTotalDepSalary(int department) { // посчитать обузую зарплату в отделе
        int sum = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                break;
            } else if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public int countAverageDepSalary(int department) { // посчитать среднюю зарплату на отдел
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
    public void indexDepSalary(int indexSalary, int department) { // проиндексировать зарплату в отделе
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
    public void printDepartmentMembers (int department) { // напечатать ФИО сотрудников в отделе
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println("Id=" + employee.getId() + ", " + employee.getFullName() + ", " + employee.getSalary());
            }
        }
    }
    public void sortBySalaryLess (int salary) { // найти сотрудников с зарплатой ниже чем число
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println("Id=" + employee.getId() + ", " + employee.getFullName() + ", " + employee.getSalary());
            }
        }
    }
    public void sortBySalaryMore (int salary) { //  найти сотрудников с зарплатой выше чем число
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= salary) {
                System.out.println("Id=" + employee.getId() + ", " + employee.getFullName() + ", " + employee.getSalary());
            }
        }
    }
}
