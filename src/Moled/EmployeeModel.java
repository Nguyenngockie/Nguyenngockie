/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Moled;


public class EmployeeModel {
    private String name, address, gender;
    private int age, date, ID;
    private double cost, timeWork, salary1, salary2, salary3;

    
    public EmployeeModel(String name, String address, String gender, int age, int date, int ID, double cost, double timeWork, double salary1, double salary2, double salary3) {
        this.name = name;
        this.address = address;
        this.gender = gender;
       
        this.age = age;
        this.date = date;
        this.ID = ID;
        this.cost = cost;
        this.timeWork = timeWork;
        this.salary1 = salary1;
        this.salary2 = salary2;
        this.salary3 = salary3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(double timeWork) {
        this.timeWork = timeWork;
    }

    public double getSalary1() {
        return salary1;
    }

    public void setSalary1(double salary1) {
        this.salary1 = salary1;
    }

    public double getSalary2() {
        return salary2;
    }

    public void setSalary2(double salary2) {
        this.salary2 = salary2;
    }

    public double getSalary3() {
        return salary3;
    }

    public void setSalary3(double salary3) {
        this.salary3 = salary3;
    }

    @Override
    public String toString() {
        return "Nhanvien{" + "name=" + name + ", address=" + address + ", gender=" + gender + ", age=" + age + ", date=" + date + ", ID=" + ID + ", cost=" + cost + ", timeWork=" + timeWork + ", salary1=" + salary1 + ", salary2=" + salary2 + ", salary3=" + salary3 + '}';
    }
    
    
    
}
