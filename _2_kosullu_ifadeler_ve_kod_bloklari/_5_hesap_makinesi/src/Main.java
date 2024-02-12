import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextInt();

        System.out.println("1- Toplama\n2-Çıkarma\n3_Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();
/*
        if (select == 1) {
            System.out.print("Toplam: " + (n1 + n2));
        } else if (select == 2) {
            System.out.print("Çıkarma: " + (n1 - n2));
        } else if (select == 3) {
            System.out.print("Çarpma: " + (n1 * n2));
        } else if (select == 4) {
            if (n2 != 0) {
                System.out.print("Bölme: " + (n1 / n2));
            } else
                System.out.print("Bir sayı 0'a bölünemez");

        } else {
            System.out.print("Geçersiz İşlem Girdiniz");
        }*/


        ////// Switch Case Ile Yazimi ///////////

        switch (select) {
            case (1):
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case (2):
                System.out.println("Çıkarma: " + (n1 - n2));
                break;
            case (3):
                System.out.println("Çarpma: " + (n1 * n2));
                break;
            case (4):
                if (n2 != 0) {
                    System.out.println("Bölme: " + (n1 / n2));
                } else {
                    System.out.println(" Bir Sayı 0'a Bölünemez");
                }
                break;
            default:
                System.out.println("Hatalı işlem yaptınız");
        }
    }
}