import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int n;
//        int sum = 0;
//        Scanner scan = new Scanner(System.in);
//        do {
//            System.out.print("Sayı Giriniz: ");
//            n = scan.nextInt();
//            if (n % 2 == 1) {
//                sum += n;
//            }
//        } while (n > 0);
//
//        System.out.println("Toplam " + sum);



        ///////// Ödev

//        Java döngüler ile tek bir sayı girilene
//        kadar kullanıcıdan girişleri kabul eden
//        ve girilen değerlerden çift ve 4'ün
//        katları olan sayıları toplayıp ekrana
//        basan programı yazıyoruz.

        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        do {
            System.out.print("Sayı Giriniz: ");
            n = input.nextInt();

            if ((n % 2 == 0) && (n % 4 == 0)) {
                sum += n;
            }
        } while (n % 2 == 0);
        System.out.println("Toplam " + sum);
    }
}