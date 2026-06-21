package Exercise8;

import java.util.Scanner;

public class Student {

    private int id;
    private String name;
    private int age;
    private Gender gender;
    private String address;
    private String phoneNumber;

    public Student() {

    }
    public Student(int id, String name, int age, Gender gender, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void inputData(Scanner sc) {
        System.out.println("Nhập thông tin sinh viên:");
        System.out.print("ID: ");
        this.id = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Tên: ");
        this.name = sc.nextLine().trim();
        System.out.print("Tuổi: ");
        this.age = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Giới tính (MALE   - NAM, FEMALE - NỮ, OTHER - KHÁC): ");
        String genderInput = sc.nextLine().toUpperCase();
        this.gender = Gender.valueOf(genderInput);
        System.out.print("Địa chỉ: ");
        this.address = sc.nextLine().trim();
        System.out.print("Số điện thoại: ");
        this.phoneNumber = sc.nextLine().trim();
    }

    public void displayData() {
        System.out.print("ID: " + id);
        System.out.print(",Tên: " + name);
        System.out.print(",Tuổi: " + age);
        System.out.print(",Giới tính: " + gender);
        System.out.print(",Địa chỉ: " + address);
        System.out.println(",Số điện thoại: " + phoneNumber);
    }
}
