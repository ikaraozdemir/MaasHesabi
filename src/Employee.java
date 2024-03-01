public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(double salary) {
        if (this.salary > 1000) {
            return (this.salary * 0.03);
        }
        return 0;
    }

    public double bonus(int workHours) {
        if (this.workHours > 40) {
            return ((this.workHours - 40) * 30);
        }
        return 0;
    }

    public double raiseSalary(int hireYear, double salary) {
        int workedYear = (2021 - this.hireYear);
        if (workedYear > 19) {
            return (this.salary * 0.15);
        } else if (workedYear > 9 && workedYear < 20) {
            return (this.salary * 0.10);
        }
        return (this.salary * 0.05);
    }

    public void printEmployeeInfo() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax(this.salary));
        System.out.println("Bonus : " + bonus(this.workHours));
        System.out.println("Maaş Artışı : " + raiseSalary(this.hireYear, this.salary));
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary - tax(this.salary) + bonus(this.workHours)));
        System.out.println("Toplam maaş : " + (this.salary - tax(this.salary) + bonus(this.workHours) + raiseSalary(this.hireYear, this.salary)));
        System.out.println("===================================");
    }
}
