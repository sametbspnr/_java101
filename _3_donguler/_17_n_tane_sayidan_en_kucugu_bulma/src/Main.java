import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç Tane Sayı Gireceksiniz ?: ");
        int n = inp.nextInt();
        int minnum = 0;
        int maxnum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int number = inp.nextInt();
            if (number >= maxnum) {
                maxnum = number;
            } else if (number <= minnum) {
                minnum = number;
            }
        }
        System.out.println("En Büyük Sayı: " + maxnum + "  En Küçük Sayı: " + minnum);
    }
}