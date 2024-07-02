package view;

import Controler.EmployeeController;
import Moled.EmployeeModel;
import java.util.ArrayList;

import java.util.Scanner;

public class EmployeeView {
    
    private EmployeeController Controler;
    private Scanner scanner;
    
    public EmployeeView(EmployeeController Controler, Scanner scanner) {
        this.Controler = Controler;
        this.scanner = scanner;
    }
    
    public void choice(Scanner scanner, ArrayList<EmployeeModel> employee, int choice) {
        
        do {
            System.out.println("=======Choice menu============");
            System.out.println("1.Nhập thông tin nhân viên");
            System.out.println("2.hiện danh sách nhân viên");
            System.out.println("3.thay đổi thông tin nhân viên");
            System.out.println("4.xóa nhân viên");
            System.out.println("5.tìm thông tin nhân viên bằng ID");
            System.out.println("6.cập nhật luong nhân viên - tính lương nhân viên");
            System.out.println("0.chọn 0 để thoát");
            
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    addemployee(employee);
                    break;
                case 2:
                    display(employee);
                    break;
                case 3:
                    changeemployee(scanner, employee, choice);
                    break;
                case 4:
                    clearemploy(employee, scanner, choice);
                    break;
                case 5:
                    search(scanner, employee, choice);
                    break;
                case 6:
                    employeeSalary(scanner, employee, choice, choice, choice, choice, choice);
                    break;
                
            }
            
        } while (choice != 0);
        
    }
    
    public void addemployee(ArrayList<EmployeeModel> employee) {
        
        Controler.addemployee(scanner, employee);
    }
    
    public void display(ArrayList<EmployeeModel> employee) {
        Controler.display(employee);
    }

    public void changeemployee(Scanner scanner, ArrayList<EmployeeModel> employee, int ID) {
        Controler.changeemployee(scanner, employee, 0);
    }

    public void clearemploy(ArrayList<EmployeeModel> employee, Scanner scanner, int choice) {
        Controler.clearemploy(employee, scanner, choice);
    }
    
    public EmployeeController search(Scanner scanner, ArrayList<EmployeeModel> employee, int sear) {
        Controler.search(scanner, employee, sear);
        return null;
    }
    
    public void employeeSalary(Scanner scanner, ArrayList<EmployeeModel> employee, double time, int choice, int id, double salary, int shift) {
        Controler.employeeSalary(scanner, employee, time, choice, id, salary, shift);
    }
}
