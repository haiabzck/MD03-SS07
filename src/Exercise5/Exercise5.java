package Exercise5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        Product[] products = new Product[size];
        while (true) {
            System.out.println("====================MENU====================");
            System.out.println("1. Nhập thông tin sản phẩm");
            System.out.println("2. Hiển thị thông tin sản phẩm");
            System.out.println("3. Cập nhật thông tin sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    if(size > 0){
                        System.out.println("==== Thêm sản phẩm ====");
                        System.out.print("ID: ");
                        String id = scanner.nextLine().toUpperCase();
                        if (id.isEmpty()) {
                            System.out.println("ID không được để trống.");
                            id = scanner.nextLine().toUpperCase();

                        }
                        for (Product product : products) {
                            if (product != null && product.getId().equals(id)) {
                                System.out.println("ID đã tồn tại. Vui lòng nhập ID khác.");
                                id = scanner.nextLine().toUpperCase();
                            }
                        }
                        System.out.print("Tên sản phẩm: ");
                        String name = scanner.nextLine().trim();
                        System.out.print("Giá: ");
                        double price = Double.parseDouble(scanner.nextLine().trim());
                        Product newProduct = new Product(id, name, price);
                        products = java.util.Arrays.copyOf(products, size + 1);
                        products[size] = newProduct;
                        size++;
                    }else {
                        System.out.print("Nhập số lượng sản phẩm: ");
                        size = Integer.parseInt(scanner.nextLine());
                        products = new Product[size];
                        for (int i = 0; i < size; i++) {
                            System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
                            System.out.print("ID: ");
                            String id = scanner.nextLine().toUpperCase();
                            if (id.isEmpty()) {
                                System.out.println("ID không được để trống.");
                                id = scanner.nextLine().toUpperCase();
                            }
                            for (Product product : products) {
                                if (product != null && product.getId().equals(id)) {
                                    System.out.println("ID đã tồn tại. Vui lòng nhập ID khác.");
                                    id = scanner.nextLine().toUpperCase();
                                }
                                break;
                            }
                            System.out.print("Tên sản phẩm: ");
                            String name = scanner.nextLine().trim();
                            System.out.print("Giá: ");
                            double price = Double.parseDouble(scanner.nextLine().trim());
                            products[i] = new Product(id, name, price);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Thông tin sản phẩm:");
                    for (Product product : products) {
                        if (product != null) {
                            System.out.println("ID: " + product.getId() + ", Tên sản phẩm: " + product.getName() + ", Giá: " + product.getPrice());
                        }
                    }
                    break;
                    case 3:
                    System.out.print("Nhập ID sản phẩm cần cập nhật: ");
                    String updateId = scanner.nextLine();
                    boolean found = false;
                    for (Product product : products) {
                        if (product != null && product.getId().equals(updateId)) {
                            System.out.print("Tên mới: ");
                            product.setName(scanner.nextLine());
                            System.out.print("Giá mới: ");
                            product.setPrice(Double.parseDouble(scanner.nextLine()));
                            found = true;
                            System.out.println("Cập nhật thành công.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy sản phẩm với ID: " + updateId);
                    }
                    break;
                case 4:
                    System.out.print("Nhập ID sản phẩm cần xóa: ");
                    String deleteId = scanner.nextLine();
                    found = false;
                    for (int i = 0; i < products.length; i++) {
                        if (products[i] != null && products[i].getId().equals(deleteId)) {
                            products[i] = null; // Xóa sản phẩm bằng cách gán null
                            found = true;
                            System.out.println("Xóa thành công.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy sản phẩm với ID: " + deleteId);
                    }
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại (1-5).");
            }
        }
    }
}
