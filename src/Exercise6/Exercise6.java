package Exercise6;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        Category[] categories = new Category[size];

        while (true) {
            System.out.println("====================MENU====================");
            System.out.println("1. Nhập thông tin danh mục");
            System.out.println("2. Hiển thị thông tin danh mục");
            System.out.println("3. Cập nhật thông tin danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    if (size > 0) {
                        System.out.println("==== Thêm danh mục ====");
                        System.out.print("ID: ");
                        String id = scanner.nextLine().toUpperCase();
                        if (id.isEmpty()) {
                            System.out.println("ID không được để trống.");
                            id = scanner.nextLine().toUpperCase();
                        }
                        for (Category category : categories) {
                            if (category != null && category.getId().equals(id)) {
                                System.out.println("ID đã tồn tại. Vui lòng nhập ID khác.");
                                id = scanner.nextLine().toUpperCase();
                            }
                        }
                        System.out.print("Tên danh mục: ");
                        String name = scanner.nextLine().trim();
                        System.out.print("Mô tả: ");
                        String description = scanner.nextLine().trim();
                        Category newCategory = new Category(id, name, description);
                        categories = java.util.Arrays.copyOf(categories, size + 1);
                        categories[size] = newCategory;
                        size++;
                    } else {
                        System.out.print("Nhập số lượng danh mục: ");
                        size = Integer.parseInt(scanner.nextLine());
                        categories = new Category[size];
                        for (int i = 0; i < size; i++) {
                            System.out.println("Nhập thông tin danh mục thứ " + (i + 1) + ":");
                            System.out.print("ID: ");
                            String id = scanner.nextLine().toUpperCase();
                            if (id.isEmpty()) {
                                System.out.println("ID không được để trống.");
                                id = scanner.nextLine().toUpperCase();
                            }
                            for (Category category : categories) {
                                if (category != null && category.getId().equals(id)) {
                                    System.out.println("ID đã tồn tại. Vui lòng nhập ID khác.");
                                    id = scanner.nextLine().toUpperCase();
                                }
                                break;
                            }
                            System.out.print("Tên danh mục: ");
                            String name = scanner.nextLine().trim();
                            System.out.print("Mô tả: ");
                            String description = scanner.nextLine().trim();
                            categories[i] = new Category(id, name, description);
                        }
                    }
                    break;
                case 2:
                    System.out.println("==== Danh sách danh mục ====");
                    for (Category category : categories) {
                        if (category != null) {
                            System.out.println("{ ID: " + category.getId() + ", Tên danh mục: " + category.getName() + ", Mô tả: " + category.getDescription() + " }");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhập ID danh mục cần cập nhật: ");
                    String updateId = scanner.nextLine().toUpperCase();
                    boolean found = false;
                    for (Category category : categories) {
                        if (category != null && category.getId().equals(updateId)) {
                            System.out.print("Nhập tên danh mục mới: ");
                            String newName = scanner.nextLine().trim();
                            System.out.print("Nhập mô tả mới: ");
                            String newDescription = scanner.nextLine().trim();
                            category.setName(newName);
                            category.setDescription(newDescription);
                            found = true;
                            System.out.println("Cập nhật danh mục thành công.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy danh mục với ID: " + updateId);
                    }
                    break;
                case 4:
                    System.out.print("Nhập ID danh mục cần xóa: ");
                    String deleteId = scanner.nextLine().toUpperCase();
                    found = false;
                    for (int i = 0; i < categories.length; i++) {
                        if (categories[i] != null && categories[i].getId().equals(deleteId)) {
                            categories[i] = null;
                            found = true;
                            System.out.println("Xóa danh mục thành công.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy danh mục với ID: " + deleteId);
                    }
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
