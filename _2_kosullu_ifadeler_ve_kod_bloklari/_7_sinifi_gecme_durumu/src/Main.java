import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        int topDers, dersAzalt;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.println("Muzik notunuz: ");
        muzik = inp.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.println("Turkce notunuz: ");
        turkce = inp.nextInt();

        topDers = 5;
        dersAzalt = 0;

        if (mat<0 || mat>100){
            mat = 0;
            dersAzalt++;
        }


        if (muzik<0 || muzik>100){
            muzik = 0;
            dersAzalt++;
        }

        if (fizik<0 || fizik>100){
            fizik = 0;
            dersAzalt++;
        }

        if (kimya<0 || kimya>100){
            kimya = 0;
            dersAzalt++;
        }

        if (turkce<0 || turkce>100){
            turkce = 0;
            dersAzalt++;
        }

        double avarage = (mat + fizik + muzik + kimya + turkce)/(topDers - dersAzalt);

        if (avarage < 55){
            System.out.println("Sınıfta Kaldınız");
        }
        else {
            System.out.println("Tebrikler sınıfı geçtiniz");
        }
        System.out.println("Ortalamanız: " + avarage);
    }
}