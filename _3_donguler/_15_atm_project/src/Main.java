import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.println("Kullanıcı Adınız: ");
            userName = input.nextLine();

            System.out.println("Parolanız: ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına hoş geldiniz. ");
                do {
                    System.out.println("1- Para Yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Çıkış Yap");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.println("Para Miktarı: ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.println("Para Miktarı: ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye Yetersiz.");
                        } else balance -= price;
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz: " + balance);
                    }

                } while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere!");
                break;
            } else {
                right--;
                System.out.println("Hatalı Kullanıcı Adı veya Şifre. Tekrar Deneyiniz");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız: " + right);
                }
            }
        }
    }
}
