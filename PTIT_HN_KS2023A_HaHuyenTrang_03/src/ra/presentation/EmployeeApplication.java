package ra.presentation;

import ra.entity.Employee;

import java.util.Scanner;

public class EmployeeApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employee = new Employee[20];
        int employeeCount = 0;
        do{
            System.out.println("----------------------------Employee Menu----------------------------");
            System.out.println("1. Hiển thị danh sách nhân viên");
            System.out.println("2. Thêm mới nhân viên");
            System.out.println("3. Chỉnh sửa thông tin nhân viên");
            System.out.println("4. Xóa nhân viên");
            System.out.println("5. Tìm kiếm nhân viên");
            System.out.println("6. Sắp xếp ");
            System.out.println("0. Thoát chương trình");
            System.out.println("lựa chọn của bạn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if(employeeCount ==0){
                        System.out.println("Danh sách trống");
                    }else {
                        System.out.println("Danh sách nhân viên:");
                        for (int i = 0; i < employeeCount; i++) {
                            employee[i].displayData();
                        }
                    }
                    break;
                case 2:
                    if(employeeCount>employee.length){
                        System.out.println("Danh sách đầy");
                    }else {
                        System.out.println("Số lượng nhân viên cần thêm");
                        int empl = sc.nextInt();

                        for (int i = 0; i < empl; i++) {
                            Employee newemp = new Employee();
                            newemp.inputData(sc);
                            employee[employeeCount++] = newemp;
                        }
                        System.out.println("thêm nhân viên hoàn tất: ");
                        for (int i = 0; i < employeeCount; i++) {
                            employee[i].displayData();
                        }
                    }
                    break;
                case 3:
                    System.out.print(" số thứ tự nhân viên cần cập nhật: ");
                    int updateIndex = sc.nextInt() - 1;
                    sc.nextLine();
                    if (updateIndex >= 0 && updateIndex < employeeCount) {
                        employee[updateIndex].inputData(sc);
                    } else {
                        System.out.println("nhân viên không tồn tại");
                    }
                    break;
                case 4:
                    System.out.print(" mã nhân viên cần xóa: ");
                    int deleteIndex = sc.nextInt() - 1;
                    sc.nextLine();
                    if (deleteIndex >= 0 && deleteIndex < employeeCount) {
                        for (int i = deleteIndex; i < employeeCount - 1; i++) {
                            employee[i] = employee[i + 1];
                        }
                        employee[employeeCount - 1].displayData();
                        System.out.println("nhân viên đã được xóa.");
                    } else {
                        System.out.println("nhân viên không tồn tại");
                    }
                    break;
                case 5:
                    System.out.print(" tên nhân viên cần tìm: ");
                    String searchName = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < employeeCount; i++) {
                        if (employee[i].getEmployeeName().equalsIgnoreCase(searchName)) {
                            employee[i].displayData();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy nhân viên!");
                    }
                    break;
                case 6:
                    for (int i = 0; i < employeeCount - 1; i++) {
                        for (int j = 0; j < employeeCount - i - 1; j++) {
//                            if (employee[j].totalSalarys() > employee[j + 1].totalSalarys()) {
//                                Employee temp = employee[j];
//                                employee[j] = employee[j + 1];
//                                employee[j + 1] = temp;
//                            }
                        }
                    }
                    System.out.println("Danh sách nhân viên sau khi sắp xếp:");
                    for (int i = 0; i < employeeCount; i++) {
                        employee[i].displayData();
                    }
                    break;
                case 0:
                    break;
                    default:
                        System.out.println("chọn từ 0-6: ");
             }
        }while(true);
    }
}
