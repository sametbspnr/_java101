import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year, zodyak;
        String burc = "";
        boolean isError = false;
        System.out.println("Lütfen Doğum Yılınızı Giriniz: ");
        Scanner inp = new Scanner(System.in);
        year = inp.nextInt();

        zodyak = year % 12;

        switch (zodyak) {
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc = "Horoz";
                break;
            case 2:
                burc = "Köpek";
                break;
            case 3:
                burc = "Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Öküz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavşan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yılan";
                break;
            case 10:
                burc = "At";
            case 11:
                burc = "Koyun";

            default:
                isError = true;
        }
if (isError){
    System.out.println("Hatalı giriş yaptınız");
}else
    System.out.println("Çin Zodyağı Burcunuz: " + burc);


    }
}