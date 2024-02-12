import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r, alfa;
        double pi = 3.14;

        Scanner  inp = new Scanner(System.in);


        System.out.print("Dairenin yarıçapını giriniz : ");
        r = inp.nextInt();

        System.out.print("Alanını hesaplamak istediğiniz daire diliminin açısını giriniz :");
        alfa = inp.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        double dilimAlan = pi * r * r * alfa / 360;
        System.out.println("Daire diliminin alanı : " + dilimAlan );
        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi : " + cevre);



    }
}