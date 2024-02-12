import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kdvsiz, kdvli, kdv, kdvOran;

        Scanner inp = new Scanner(System.in);

        System.out.println("KDV Hariç Fiyat Giriniz: ");
        kdvsiz = inp.nextDouble();
        // System.out.println(kdvsiz);


        // Tutar 1000 tlden buyukse KDV orani 0.20, değilse KDV orani 0.18
        kdvOran = kdvsiz > 1000 ? 0.20 : 0.18;

        kdv = kdvsiz * kdvOran;
        System.out.println("KDV Tutarı: " + kdv);

        kdvli = kdvsiz + kdv;
        System.out.println("KDV Dahil Fiyat: " + kdvli);
    }
}