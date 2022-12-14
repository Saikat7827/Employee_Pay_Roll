package com.bridgelabz;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EmployeePayrollService {
    private List<EmployeePayrollData> employeePayrollList;
    public EmployeePayrollService(){}

    public EmployeePayrollService(List<EmployeePayrollData>employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        Scanner scanner = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(scanner);
        employeePayrollService.writeEmployeePayrollData();
    }
    private void readEmployeePayrollData(Scanner scanner){
        System.out.println("Enter Employee ID");
        int id = scanner.nextInt();
        System.out.println("Enter Employee Name");
        String name = scanner.next();
        System.out.println("Enter Employee Salary ");
        double salary = scanner.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id,name,salary));
    }
    private void writeEmployeePayrollData(){
        System.out.println("Writing Employee Payroll Roster to Console"+employeePayrollList);
    }
}
