import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int kilo;
        double boy, vucKitEnds;

        Scanner vki = new Scanner(System.in);

        System.out.print("Kilonuzu giriniz(kg) : ");
        kilo = vki.nextInt();

        System.out.print("Boyunuzu giriniz(m) : ");
        boy = vki.nextDouble();

        vucKitEnds = kilo / (boy * boy);

        System.out.print("Vücut kitle endeksiniz : " + vucKitEnds);




    }
}