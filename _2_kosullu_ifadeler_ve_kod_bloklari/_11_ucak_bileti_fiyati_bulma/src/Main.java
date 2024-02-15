import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km, yas, fly;
        double cost, tl_Km, ageDisRatio, returnDisRatio, ageDisCost, totalCost, ageDis, returnDis;

        Scanner input = new Scanner(System.in);

        System.out.print("Yolculuk yapacağınız mesafeyi Km cinsinden yazınız: ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk Tipini Giriniz (1 => Tek Yön , 2 => Gidiş Dönüş) ");
        fly = input.nextInt();

        ageDisRatio = 0;
        returnDisRatio = 0;


        if ((km > 0) && (yas > 0) && ((fly == 1) || (fly == 2))) {
            if (yas <= 12) {
                ageDisRatio = 0.5;
            } else if ((yas > 12) && (yas <= 24)) {
                ageDisRatio = 0.1;
            } else if (yas >= 65) {
                ageDisRatio = 0.3;
            }
            switch (fly) {
                case 1:
                    returnDisRatio = 0;
                    break;
                case 2:
                    returnDisRatio = 0.2;
                    break;
            }
            tl_Km = 0.10;
            cost = tl_Km * km;

            ageDis = cost * ageDisRatio;
            ageDisCost = cost - ageDis;

            returnDis = ageDisCost * returnDisRatio;

            totalCost = ageDisCost - returnDis;

            if (!(returnDisRatio == 0)) {
                totalCost = totalCost * 2;
            }

            System.out.println("Toplam Tutar: " + totalCost + " ₺");
        } else
            System.out.println("Hatalı Veri Girdiniz");



    }
}


