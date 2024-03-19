import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Ödev
//        Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
//
//        Örnek : 1643 = 1 + 6 + 4 + 3 = 14

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int sayi = inp.nextInt();
        int result = 0;
        int sonBasamakDeger;
        while (sayi != 0) {
            sonBasamakDeger = sayi % 10;
            sayi /= 10;
            result += sonBasamakDeger;
        }

        System.out.println("Girdiğiniz Sayıların Basamaklarının Toplamı: " + result);
    }
}