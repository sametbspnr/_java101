import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* int a, b; double c;
        Scanner inp = new Scanner(System.in);

        System.out.println("Birinci Kenarı Giriniz: ");
        a = inp.nextInt();

        System.out.println("İkinci Kenarı Giriniz: ");
        b = inp.nextInt();

        c = Math.sqrt((a * a) + (b * b));

        System.out.println("Hipotenüsün Uzunluğu: " + c);
        */

        /*////////////////////////////////////////////////*/
        // Kenar verilerini aldıgımız ucgenin alanını hesaplama
        int kenar1, kenar2, kenar3, cevre; double u, alan;

        Scanner kenarlar = new Scanner(System.in);

        System.out.println("Birinci Kenarı Giriniz: ");
        kenar1 = kenarlar.nextInt();

        System.out.println("İkinci Kenarı Giriniz: ");
        kenar2 = kenarlar.nextInt();

        System.out.println("Üçüncü Kenarı Giriniz: ");
        kenar3 = kenarlar.nextInt();

        cevre = kenar1 + kenar2 + kenar3;
        System.out.println("Çevre: " + cevre);

        u = cevre /2;

        alan = Math.sqrt(u * (u - kenar1)* (u - kenar2) * (u - kenar3));

        System.out.println("Alan: " + alan);
    }
}