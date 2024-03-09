import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayı: ");
        n = input.nextInt();
        System.out.print("Üs Olacak Sayı: ");
        k = input.nextInt();
        int total = 1;

        // 4 ^ 3 = 4 * 4 * 4

        // with while
//        int i = 1;
//        while (i <= k) {
//            total *= n;
//            i++;
//        }


        // with for
        for (int  i = 1; i <= k; i++){
            total *= n;
        }

        System.out.println(total);
    }
}