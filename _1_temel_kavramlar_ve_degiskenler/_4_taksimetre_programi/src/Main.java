import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double taksiMetre, mesafeKm, acilisUcreti, kmUcret, yolUcret;
        Scanner mesafe = new Scanner(System.in);
        System.out.println("Katedilen Mesafeyi KM Cinsinden Giriniz: ");
        mesafeKm = mesafe.nextDouble();
        System.out.println(mesafeKm);

        acilisUcreti = 10;
        kmUcret = 2.2;
        yolUcret = mesafeKm * kmUcret;

        taksiMetre = acilisUcreti + yolUcret;
        taksiMetre = (taksiMetre < 20) ? 20 : taksiMetre;
        System.out.print("Taksimetre: " + taksiMetre);
    }
}