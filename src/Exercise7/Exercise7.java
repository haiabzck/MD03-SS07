package Exercise7;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tử số của phân số thứ nhất: ");
        int numerator1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập mẫu số của phân số thứ nhất: ");
        int denominator1 = Integer.parseInt(scanner.nextLine());
        if (denominator1 == 0) {
            System.out.println("Mẫu số không thể bằng 0. Vui lòng nhập lại.");
            denominator1 = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Phân số thứ nhất: " + numerator1 + "/" + denominator1);

        System.out.println("Nhap tử số của phân số thứ hai: ");
        int numerator2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap mẫu số của phân số thứ hai: ");
        int denominator2 = Integer.parseInt(scanner.nextLine());
        if (denominator2 == 0) {
            System.out.println("Mẫu số không thể bằng 0. Vui lòng nhập lại.");
            denominator2 = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Phân số thứ hai: " + numerator2 + "/" + denominator2);

        Fraction fraction1 = new Fraction(numerator1, denominator1);
        Fraction fraction2 = new Fraction(numerator2, denominator2);

        Fraction sum = fraction1.add(fraction2);
        Fraction difference = fraction1.subtract(fraction2);
        Fraction product = fraction1.multiply(fraction2);
        Fraction quotient = fraction1.divide(fraction2);
        System.out.println("Phép tính trên hai phân số trước khi rút gọn: ");
        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + difference);
        System.out.println("Tích: " + product);
        System.out.println("Thương: " + quotient);
        System.out.println("Phép tính trên hai phân số sau khi rút gọn: ");
        System.out.println("Tổng: " + sum.simplify());
        System.out.println("Hiệu: " + difference.simplify());
        System.out.println("Tích: " + product.simplify());
        System.out.println("Thương: " + quotient.simplify());
    }
}
