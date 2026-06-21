package Exercise8;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        int size = 0;
        Student[] students = new Student[size];
        while (true){
            System.out.println("==============MENU==============");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Cập nhật thông tin sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(new Scanner(System.in).nextLine());
            switch (choice){
                case 1:
                    if (size == 0){
                        System.out.println("Danh sách sinh viên trống.");
                    }else {
                        System.out.println("Danh sách sinh viên:");
                        for (Student student : students) {
                            if (student != null){
                                student.displayData();
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("==== Thêm sinh viên ====");
                    Student newStudent = new Student();
                    newStudent.inputData(new Scanner(System.in));
                    students = Arrays.copyOf(students, size + 1);
                    students[size] = newStudent;
                    size++;
                    System.out.println("Thêm sinh viên thành công.");
                    break;
                case 3:
                    System.out.print("Nhập ID sinh viên cần cập nhật: ");
                    int updateId = Integer.parseInt(new Scanner(System.in).nextLine());
                    boolean foundUpdate = false;
                    for (int i = 0; i < size; i++) {
                        if (students[i] != null && students[i].getId() == updateId) {
                            System.out.println("Nhập thông tin mới cho sinh viên có ID " + updateId + ":");
                            System.out.println("Nhập tên mới: ");
                            String newName = new Scanner(System.in).nextLine();
                            System.out.println("Nhập tuổi mới: ");
                            int newAge = Integer.parseInt(new Scanner(System.in).nextLine());
                            System.out.println("Nhập giới tính mới: ");
                            String newGender = new Scanner(System.in).nextLine();
                            System.out.println("Nhập địa chỉ mới: ");
                            String newAddress = new Scanner(System.in).nextLine();
                            System.out.println("Nhập số điện thoại mới: ");
                            String newPhone = new Scanner(System.in).nextLine();
                            students[i].setName(newName);
                            students[i].setAge(newAge);
                            students[i].setGender(Gender.valueOf(newGender));
                            students[i].setAddress(newAddress);
                            students[i].setPhoneNumber(newPhone);
                            foundUpdate = true;
                            System.out.println("Cập nhật thông tin sinh viên có ID " + updateId + " thành công.");
                            break;
                        }
                    }
                    if (!foundUpdate) {
                        System.out.println("Không tìm thấy sinh viên có ID " + updateId);
                    }
                    break;
                case 4:
                    System.out.print("Nhập ID sinh viên cần xóa: ");
                    int deleteId = Integer.parseInt(new Scanner(System.in).nextLine());
                    boolean foundDelete = false;
                    for (int i = 0; i < size; i++) {
                        if (students[i] != null && students[i].getId() == deleteId) {
                            students[i] = null;
                            foundDelete = true;
                            System.out.println("Xóa sinh viên có ID " + deleteId + " thành công.");
                            break;
                        }
                    }
                    if (!foundDelete) {
                        System.out.println("Không tìm thấy sinh viên có ID " + deleteId);
                    }
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại (1-5).");
            }
        }
    }
}
