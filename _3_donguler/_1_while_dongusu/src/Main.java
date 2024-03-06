import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 1, k;
        System.out.println("Program başladı");
        while (i <= 5) {
            System.out.println(i);
            k = 1;
            while (k <= 10) {
                System.out.print(k + " ,");
                k++;
            }
            i++;
        }
        System.out.println("Program bitti");

        //////////

        int left = 100, right = 200;
        while (++left < --right) ;
        System.out.println(left);

        //////////

        int password;
        boolean isPasswordSuccess = false;

        Scanner input = new Scanner(System.in);

        while (!isPasswordSuccess) {
            System.out.println("Şifre Giriniz");
            password = input.nextInt();

            if (password == 123) {
                System.out.println("Doğru");
                isPasswordSuccess = true;
            } else
                System.out.println("Yanlış");

        }

    }
}