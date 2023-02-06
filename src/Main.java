public class Main {


    /*
    *Описание задачи:*

Напишите программу, которая занимается учетом сотрудников и помогает кадрам и бухгалтерии автоматизировать процессы.

С помощью вашей программы бухгалтерия и отдел кадров смогут узнавать следующую информацию:

1. Получить список всех сотрудников.
2. Посчитать сумму затрат на зарплаты.
3. Найти сотрудника с минимальной заплатой.
4. Найти сотрудника с максимальной зарплатой.
5. Подсчитать среднее значение зарплат.
     */
    private static Employee[] employees = new Employee[5];


    public static void main(String[] args) {
        employees[0] = new Employee("Ivanov Ivan Ivanovich", 1, 30000F);
        employees[1] = new Employee("Ivanov Ivan Ivanovich", 2, 40000F);
        employees[2] = new Employee("Ivanov Ivan Ivanovich", 3, 50000F);
        employees[3] = new Employee("Ivanov Ivan Ivanovich", 4, 50000F);
        employees[4] = new Employee("Ivanov Ivan Ivanovich", 3, 50000F);
        printEmployees();
        printSum();
        printMinSalary();
        printMaxSalary();
        printAverageSalary();
        printNames();


    }


    private static void printEmployees(){
        for(Employee employee: employees) {
            if(employee != null) {
                System.out.println(employee);
            }
        }

        }
        private static void printSum(){
        double sum = 0;
        for (Employee employee: employees) {
            if (employee!= null) {
                sum += employee.getSalary();
            }
        }
            System.out.println( " Sum salary " + sum);

        }
        private static void printMinSalary() {
        double min = Double.MAX_VALUE;
        Employee employeewithMinSalari = null;
        for(Employee employee: employees) {
            if(employee != null && employee.getSalary() < min){
                min = employee.getSalary();
                employeewithMinSalari = employee;
            }
        }
            System.out.println(" Employee with min salary " + employeewithMinSalari);
        }

    private static void printMaxSalary() {
        double max = Double.MIN_VALUE;
        Employee employeewithMAxSalari = null;
        for(Employee employee: employees) {
            if(employee != null && employee.getSalary() > max){
                max = employee.getSalary();
                employeewithMAxSalari = employee;
            }
        }
        System.out.println(" Employee with max salary " + employeewithMAxSalari);
    }

    private static void printAverageSalary() {
        double sum = 0;
        int countEmployee = 0;
        for (Employee employee: employees) {
            if (employee != null) {
                sum += employee.getSalary();
                countEmployee++;
            }
        }
        System.out.println(" Average salary " + sum / countEmployee);
    }
    private static void printNames (){
        for (Employee employee : employees) {
            if ( employee != null) {
                System.out.println(employee.getName());
            }
         }
    }
    }
