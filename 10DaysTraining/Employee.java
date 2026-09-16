class Main {
    String empName;
    double empId;
    char empRank;
    double empSalary;

    void checkStats() {
        if(empRank == '1'){
            System.out.println("Car");
            System.out.println("House");
        }
        else if(empRank == '2'){
            System.out.println("car");
        }
        else if (empRank == '3'){
            System.out.println("Nothing");
        }

    }
}
public class Employee {
    public static void main(String[] args) {
        Main emp = new Main();

        emp.empName = "Krishna";
        emp.empId = 101;
        emp.empRank = '1';
        emp.empSalary = 80000000;


        emp.checkStats();
    }
}
