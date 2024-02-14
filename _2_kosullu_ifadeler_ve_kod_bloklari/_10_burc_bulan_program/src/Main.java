import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        boolean isError = false;
        String burc = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Kaçıncı Ayda Doğdunuz: ");
        month = input.nextInt();
        System.out.print("Hangi Gün Doğdunuz: ");
        day = input.nextInt();
//
//        switch (month) {
//            case 1:
//                if (day >= 1 && day <= 31) {
//                    if (day < 22) {
//                        burc = "Oğlak";
//                    } else
//                        burc = "Kova";
//                } else
//                    isError = true;
//                break;
//            case 2:
//                if (day >= 1 && day <= 29) {
//                    if (day < 20) {
//                        burc = "Kova";
//                    } else
//                        burc = "Balık";
//                } else
//                    isError = true;
//                break;
//            case 3:
//                if (day >= 1 && day <= 31) {
//                    if (day < 21) {
//                        burc = "Balık";
//                    } else
//                        burc = "Koç";
//                } else
//                    isError = true;
//                break;
//            case 4:
//                if (day >= 1 && day <= 30) {
//                    if (day < 21) {
//                        burc = "Koç";
//                    } else
//                        burc = "Boğa";
//                } else
//                    isError = true;
//                break;
//            case 5:
//                if (day >= 1 && day <= 31) {
//                    if (day < 22) {
//                        burc = "Boğa";
//                    } else
//                        burc = "İkizler";
//                } else
//                    isError = true;
//                break;
//            case 6:
//                if (day >= 1 && day <= 30) {
//                    if (day < 23) {
//                        burc = "İkizler";
//                    } else
//                        burc = "Yengeç";
//                } else
//                    isError = true;
//                break;
//            case 7:
//                if (day >= 1 && day <= 31) {
//                    if (day < 23) {
//                        burc = "Yengeç";
//                    } else
//                        burc = "Aslan";
//                } else
//                    isError = true;
//                break;
//            case 8:
//                if (day >= 1 && day <= 30) {
//                    if (day < 23) {
//                        burc = "Aslan";
//                    } else
//                        burc = "Başak";
//                } else
//                    isError = true;
//                break;
//            case 9:
//                if (day >= 1 && day <= 31) {
//                    if (day < 23) {
//                        burc = "Başak";
//                    } else
//                        burc = "Terazi";
//                } else
//                    isError = true;
//                break;
//            case 10:
//                if (day >= 1 && day <= 30) {
//                    if (day < 23) {
//                        burc = "Terazi";
//                    } else
//                        burc = "Akrep";
//                } else
//                    isError = true;
//                break;
//            case 11:
//                if (day >= 1 && day <= 31) {
//                    if (day < 22) {
//                        burc = "Akrep";
//                    } else
//                        burc = "Yay";
//                } else
//                    isError = true;
//                break;
//            case 12:
//                if (day >= 1 && day <= 30) {
//                    if (day < 22) {
//                        burc = "Yay";
//                    } else
//                        burc = "Oğlak";
//                } else
//                    isError = true;
//                break;
//        }
//        if (isError) {
//            System.out.println("Hatalı Giriş Yaptınız");
//        } else
//            System.out.println("Burcunuz: " + burc);
//
//

///     Switch Case Yapısı Kullanmadan      ///
        if (month >= 1 && month <= 12) {
            if (month == 1) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Oğlak";
                    } else
                        burc = "Kova";
                } else
                    isError = true;
            } else if (month == 2) {
                if (day >= 1 && day <= 29) {
                    if (day < 20) {
                        burc = "Kova";
                    } else
                        burc = "Balık";
                } else
                    isError = true;
            } else if (month == 3) {
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        burc = "Balık";
                    } else
                        burc = "Koç";
                } else
                    isError = true;
            } else if (month == 4) {
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        burc = "Koç";
                    } else
                        burc = "Boğa";
                } else
                    isError = true;
            } else if (month == 5) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Boğa";
                    } else
                        burc = "İkizler";
                } else
                    isError = true;
            } else if (month == 6) {
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        burc = "İkizler";
                    } else
                        burc = "Yengeç";
                } else
                    isError = true;
            } else if (month == 7) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Yengeç";
                    } else
                        burc = "Aslan";
                } else
                    isError = true;
            } else if (month == 8) {
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        burc = "Aslan";
                    } else
                        burc = "Başak";
                } else
                    isError = true;
            } else if (month == 9) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Başak";
                    } else
                        burc = "Terazi";
                } else
                    isError = true;
            } else if (month == 10) {
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        burc = "Terazi";
                    } else
                        burc = "Akrep";
                } else
                    isError = true;
            } else if (month == 11) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Akrep";
                    } else
                        burc = "Yay";
                } else
                    isError = true;
            } else if (month == 12) {
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        burc = "Yay";
                    } else
                        burc = "Oğlak";
                } else
                    isError = true;
            }
        } else
            isError = true;

        if (isError == true) {
            System.out.println("Hatalı Bir Giriş Yaptınız. Lütfen Kontrol Edin.");
        } else
            System.out.println("Burcunuz: " + burc);

    }


}
