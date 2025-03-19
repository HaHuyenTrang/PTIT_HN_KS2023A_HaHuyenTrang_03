package ra.entity;

import java.util.Scanner;

public class Employee implements IApp {
    private String employeeId ;
    private String employeeName ;
    private String birthday;
    private String phoneNumber;
    private boolean sex;
    private float coefficient ;
    private int allowanceSalary;
    private String department;
    private byte status =1;

    //contructor
    public Employee() {}


    public Employee(String employeeId, String employeeName, String birthday, String phoneNumber, boolean sex, float coefficient, int allowanceSalary, String department, byte status) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.coefficient = coefficient;
        this.allowanceSalary = allowanceSalary;
        this.department = department;
        this.status = status;
    }

    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public boolean getSex(){
        return sex;
    }
    public void setSex(){
        this.sex = sex;
    }
    public float getCoefficient(){
        return coefficient;
    }
    public void setCoefficient(float coefficient){
        this.coefficient = coefficient;
    }
    public int getAllowanceSalary(){
        return allowanceSalary;
    }
    public void setAllowanceSalary(int allowanceSalary){
        this.allowanceSalary = allowanceSalary;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public byte getStatus(){
        return status;
    }
    public void setStatus(byte status){
        this.status = status;
    }


    @Override
    public void inputData(Scanner sc) {
        System.out.print("Nhập vào id nhân viên: ");
        employeeId = sc.nextLine();
        sc.nextLine();
        System.out.print("Nhập vào tên nhân viên: ");
        employeeName = sc.nextLine();
        System.out.print("Nhập vào ngày sinh của nhân viên: ");
        birthday = sc.nextLine();
        System.out.print("Giới tính của nhân viên: ");
        phoneNumber = sc.nextLine();
        System.out.print("Nhập hệ số lương: ");
        coefficient = sc.nextFloat();
        System.out.print("Nhập phụ cấp lương: ");
        allowanceSalary = sc.nextInt();
        System.out.print("Phòng ban của nhân viên: ");
        department = sc.nextLine();
        sc.nextLine();
    }
    @Override
    public void displayData() {
        System.out.println("Id nhân viên: " + employeeId+"tên: "+employeeName+" ngày sinh: "+birthday+" giới tính(true- nữ, false-nam):  "+sex +" số đt: "+phoneNumber+ "tổng lương: "+totalSalarys(coefficient,allowanceSalary)+" trạng thái: "+status);
    }
    public static float totalSalarys (float coefficient,int allowanceSalary) {
        float totalSalary = BASE_SALARY * coefficient + allowanceSalary;
        return totalSalary;
    }
}
