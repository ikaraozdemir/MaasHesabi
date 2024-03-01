public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Kemal",2000.0, 45, 1985);
        emp1.printEmployeeInfo();

        Employee emp2 = new Employee("Mehmet",1000.0, 30, 2019);
        emp2.printEmployeeInfo();

        Employee emp3 = new Employee("Ayşe",2000.0, 43, 2002);
        emp3.printEmployeeInfo();
    }
}