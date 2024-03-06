import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        //***       for dongusu
//        for (boolean run = true; run; ) {
//            System.out.println("Sayı Giriniz: ");
//            sayi = input.nextInt();
//            if (sayi < 0) {
//                run = false;
//            }
//        }


        //***       while dongusu
//        System.out.println("Sayı Giriniz: ");
//        sayi = input.nextInt();
//        while (sayi > 0){
//            System.out.println("Sayı Giriniz: ");
//            sayi = input.nextInt();
//        }


        //***       do-while dongusu
//        do {
//            System.out.println("Sayı Giriniz: ");
//            sayi = input.nextInt();
//        }
//        while (sayi > 0);


//        //***       for dongusu
//        for (int i = 1; i <= 10; i++){
//            System.out.println(i);
//        }


        //***       while dongusu
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }

    }

}

