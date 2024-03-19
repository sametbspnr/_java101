import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        int a = 2451, basamakSayisi = 0, numberCounter = 0;

        // Basamak Sayısı Bulma İşlemi
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0

        while (a != 0) {
            a /= 10;
            numberCounter++;
        }

        // Bir sayının son basamağını bulma
        // 2451 % 10 = 1
        int b = 2451;
        int c = b % 10;

        int sub = 2, sup = 3;
        int result = 1;
        for (int i = 1; i <= sup; i++ ){
            result *= sub;
        }
        System.out.println(result);

         */

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int giris = input.nextInt();
        int basamakSayisi = 0;
        int tempGiris = giris;
        int sonBasDeger;
        int result = 0;
        int basPow ;

        while (tempGiris != 0) {
            tempGiris /= 10;
            basamakSayisi++;
        }
        tempGiris = giris;
//        System.out.println(basamakSayisi);

        while (tempGiris != 0){
            sonBasDeger = tempGiris % 10;
            basPow = 1;
            for (int i=1; i<=basamakSayisi; i++){
                basPow *= sonBasDeger;
            }
            result += basPow;
            tempGiris /= 10;
//            System.out.println(sonBasDeger);
        }

        System.out.println("Sonuc: " + result);

        if (result == giris){
            System.out.println(giris + " bir armstrong sayısıdır.");
        }
        else
            System.out.println(giris + " bir armstrong sayısı değildir.");



    }
}