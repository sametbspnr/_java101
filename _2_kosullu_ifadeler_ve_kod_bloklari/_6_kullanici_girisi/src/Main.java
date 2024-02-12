import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, passwordreset, newPassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız");
        } else if (!(userName.equals("patika")) && password.equals("java123")) {
            System.out.println("Kullanıcı adınız yanlış.");
        } else if (userName.equals("patika") && (!(password.equals("java123")))) {
            System.out.print("Şifreniz yanlış. Şifrenizi değiştirmek için 'evet' yazın: ");
            passwordreset = inp.nextLine();
            if (passwordreset.equals("evet") || passwordreset.equals("Evet")) {
                System.out.print("Yeni şifrenizi girin : ");
                newPassword = inp.nextLine();
                if (!(newPassword == password)) {
                    System.out.print("Yeni şifreniz eski şifrenizle olamaz. Başka bir şifre deneyin: ");
                    newPassword = inp.nextLine();
                    System.out.print("Yeni şifreniz oluşturuldu. Giriş Yapabilirsiniz.");
                } else {
                    System.out.print("Yeni şifreniz oluşturuldu. Giriş Yapabilirsiniz.");
                }
            } else {
                System.out.print("Şifrenizi tekrar girin: ");
                password = inp.nextLine();
                if (password.equals("java123")) {
                    System.out.println("Giriş başarılı.");
                } else {
                    System.out.println("Şifrenizi yenilemeyi deneyin.");
                }
            }
        } else {
            System.out.println("Kullanıcı adı ve şifreniz yanlış.");
        }


//        Eğer şifre yanlış ise kullanıcıya şifresini
//        sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı
//        sıfırlamak isterse yeni girdiği şifrenin hatalı
//        girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini
//        kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
//        sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.


    }
}