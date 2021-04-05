import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int number = sc.nextInt();

        System.out.println("1. Kiểm tra số nguyên tố");
        System.out.println("2. Kiểm tra số chẵn lẻ");
        System.out.println("3. Kiểm tra số chính phương");
        System.out.println("4. Thoát chương trình");
        int choice;
        do {
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();


            switch (choice) {
                case 1:
                    int i = 2;
                    boolean check = true;
                    if (number >= 0) {
                        while (i <= Math.sqrt(number)) {
                            if (number % i == 0) {
                                check = false;
                                break;
                            }
                            i++;
                        }
                        if (check)
                            System.out.println(number + " is a prime.");
                        else
                            System.out.println(number + " is not a prime.");
                    } else {
                        System.out.println("Không có số nguyên tố nhỏ hơn 0");
                    }
                    break;
                case 2:
                    if (number % 2 == 0) {
                        System.out.println(number + " là số chẵn");
                    } else {
                        System.out.println(number + " là số lẻ");
                    }
                    break;
                case 3:
                    if (Math.sqrt(number) == (int) Math.sqrt(number)) {
                        System.out.println(number + " là số chính phương");
                    } else {
                        System.out.println(number + " không là số chính phương");
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        } while ((choice >= 1) && (choice <= 3));
    }
}
