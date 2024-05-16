import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n1 sayısını giriniz: ");
        int n1 = input.nextInt();

        System.out.println("n2 sayısını giriniz: ");
        int n2 = input.nextInt();


//        int ebob = 0;
//
//        // birim maliyeti 18 döngü
//        for (int i = 1; i <= n1; i++) {
//            if (n1 % i == 0 && n2 % i == 0) {
//                ebob = i;
//            }
//        }
//        System.out.println(ebob);
//
//        // birim maliyeti 14 döngü
//        for (int k = n1; k >= 1; k--) {
//            if (n1 % k == 0 && n2 % k == 0) {
//                ebob = k;
//                System.out.println(ebob);
//                break;
//            }
//        }

//        //ebob
//        int ebob = 0;
//        for (int k = n1; k >= 1; k--) {
//            if (n1 % k == 0 && n2 % k == 0) {
//                ebob = k;
//                System.out.println(ebob);
//                break;
//            }
//        }
//
//        //ekok
//        for (int i = 1; i <= (n1 * n2); i++) {
//            if (i % n1 == 0 && i % n2 == 0) {
//                System.out.println(i);
//                break;
//            }
//        }
//
//        System.out.println((n1 * n2) / ebob);


//        // "while" kullanarak ebob ve ekok

//        ebob
//        int ebob = 0;
//        int i = 1;
//        while (i <= n1) {
//            i++;
//            if (n1 % i == 0 && n2 % i == 0) {
//                ebob = i;
//                break;
//            }
//        }
//        System.out.println(ebob);

//        ebob
//        int ebob = 0;
//        int i = n1;
//        while (i >= 1) {
//            i--;
//            if (n1 % i == 0 && n2 % i == 0) {
//                ebob = i;
//                break;
//            }
//        }
//        System.out.println(ebob);


//        ekok
//        int ekok = 0;
//        int i = 1;
//        while (i <= (n1 * n2)) {
//            i++;
//            if (i % n1 == 0 && i % n2 == 0) {
//                ekok = i;
//                break;
//            }
//
//        }
//        System.out.println(ekok);
//    }
}