import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Not Ortalaması Hesaplayan Program

        // Degiskenleri tanımladık
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan degerleri al
        System.out.println("Matematik notunuzu giriniz:");
        mat = inp.nextInt();

        System.out.println("Fizik notunuzu giriniz:");
        fizik = inp.nextInt();

        System.out.println("Kimya notunuzu giriniz:");
        kimya = inp.nextInt();

        System.out.println("Turkce notunuzu giriniz:");
        turkce = inp.nextInt();

        System.out.println("Tarih notunuzu giriniz:");
        tarih = inp.nextInt();

        System.out.println("Muzik notunuzu giriniz:");
        muzik = inp.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ort = toplam/6;
        System.out.println("Not Ortalamanız: " + ort);

        System.out.println(ort >= 60 ? "Sınıftan Geçtiniz!" : "Sınıfta Kaldınız");
    }
}