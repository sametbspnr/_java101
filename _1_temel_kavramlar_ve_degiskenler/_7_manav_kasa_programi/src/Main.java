import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patl, toplam;
        double armkg, elmkg, domkg, muzkg, patlkg;
        armut = 2.14; elma = 3.67; domates = 1.11; muz = 0.95; patl = 5;

        Scanner kasa = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : ");
        armkg = kasa.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        elmkg = kasa.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        domkg = kasa.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        muzkg = kasa.nextDouble();

        System.out.print("Patlıcan kaç kilo? : ");
        patlkg = kasa.nextDouble();

        toplam = (armut*armkg) + (elma*elmkg) + (domates*domkg) + (muz*muzkg) + (patl*patlkg);
        System.out.println("Toplam Tutar : " + toplam);

    }
}