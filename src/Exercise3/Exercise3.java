package Exercise3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person = new Person();
        System.out.print("Nhập tên người thứ nhất : ");
        person.setName(scanner.nextLine());
        System.out.print("Nhập tuổi người thứ nhất : ");
        person.setAge(Integer.parseInt(scanner.nextLine()));

        Person person1 = new Person();
        System.out.print("Nhập tên người thứ hai : ");
        person1.setName(scanner.nextLine());
        System.out.print("Nhập tuổi người thứ hai : ");
        person1.setAge(Integer.parseInt(scanner.nextLine()));

        if(person.getAge() > person1.getAge()){
            System.out.println(person.getName() +" lớn tuổi hơn " + person1.getName());
        }else {
            System.out.println(person1.getName() +" lớn tuổi hơn " + person.getName());
        }
    }
}
