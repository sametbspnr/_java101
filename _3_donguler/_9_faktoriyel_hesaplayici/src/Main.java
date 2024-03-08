import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        // n! = 1 * 2 * 3 * ... * n;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Faktöriyel Sayısını Giriniz: ");
//        int n = input.nextInt();
//        int total = 1;
//
//        for (int i = 1; i <= n; i++) {
//            total = total * i;
//        }
//        System.out.println(n + ". Faktöriyel: " + total);


        // ÖDEV -- Kombinasyon Formulü

        Scanner input = new Scanner(System.in);
        int total_n = 1;
        int total_r = 1;
        int total_n_r = 1;
        int combn;

        System.out.println("C(n,r) kombinasyonu için; ");
        System.out.print("n sayısını giriniz: ");
        int n = input.nextInt();
        System.out.print("r sayısını giriniz: ");
        int r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            total_n = total_n * i;
        }
        for (int j = 1; j <= r; j++) {
            total_r = total_r * j;
        }

        for (int k = 1; k <= (n-r); k++) {
            total_n_r = total_n_r * k;
        }
        combn = total_n / (total_r * total_n_r);

        System.out.println(n + "'in " + r + "'li kombinasyonu: " +  combn );


    }
}