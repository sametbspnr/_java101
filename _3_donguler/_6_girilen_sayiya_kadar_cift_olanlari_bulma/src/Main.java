import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Sayı Giriniz: ");
//        int k = input.nextInt();
//
//        for (int i = 1; i <= k; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }


        //Ödev
        //Java döngüler ile 0'dan girilen sayıya kadar
        // olan sayılardan 3 ve 4'e tam bölünen sayıların
        // ortalamasını hesaplayan programı yazınız.

        int k;
        double sum = 0, counter = -1, average;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Giriniz: ");
        k = input.nextInt();
        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                counter++;
                System.out.println(i);
            }
        }

        if (counter > 0) {
            average = sum / counter;
            System.out.println("Average is " + average);
        } else System.out.println("Belirtilen aralıkta 3'e ve 4'e bölünen sayı bulunamadı.");
    }
}