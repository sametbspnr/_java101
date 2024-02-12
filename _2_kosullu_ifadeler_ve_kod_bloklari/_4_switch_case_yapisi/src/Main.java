public class Main {
    public static void main(String[] args) {
        int day = 6;


        if (day == 1) {
            System.out.println("Bugün Pazartesi");
        } else if (day == 2) {
            System.out.println("Bugün Salı");
        } else if (day == 3) {
            System.out.println("Bugün Çarşamba");
        } else if (day == 4) {
            System.out.println("Bugün Perşembe");
        } else if (day == 5) {
            System.out.println("Bugün Cuma");
        } else if (day == 6) {
            System.out.println("Bugün Cumartesi");
        } else if (day == 7) {
            System.out.println("Bugün Pazar");
        }

        ///// Switch Case Ile Yazimi

        // Break yazmamız gerekli !!
        switch (day) {
            case 1:
                System.out.println("Bugün Pazartesi");
                System.out.println("Program Bitti");
                break;
            case 2:
                System.out.println("Bugün Salı");
                System.out.println("Program Bitti");
                break;
            case 3:
                System.out.println("Bugün Çarşamba");
                System.out.println("Program Bitti");
                break;
            case 4:
                System.out.println("Bugün Perşembe");
                System.out.println("Program Bitti");
                break;
            case 5:
                System.out.println("Bugün Cuma");
                System.out.println("Program Bitti");
                break;
            case 6:
                System.out.println("Bugün Cumartesi");
                System.out.println("Program Bitti");
                break;
            case 7:
                System.out.println("Bugün Pazar");
                System.out.println("Program Bitti");
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız");
        }
    }
}