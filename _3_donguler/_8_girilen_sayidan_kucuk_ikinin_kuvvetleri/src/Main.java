import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner inp = new Scanner(System.in);
//        System.out.print("Sayı Giriniz: ");
//        int n = inp.nextInt();
//        int i;
//        for (i = 1; i < n; i *= 2) {
//            System.out.println(i);
//        }


//        Ödev
//        Java döngüler ile girilen sayıya
//        kadar olan 4 ve 5'in kuvvetlerini
//        ekrana yazdıran programı yazıyoruz.

        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı Giriniz: ");
        int n = inp.nextInt(), i, j;
        for (i = 1; i < n; i *= 4) {
            System.out.println("i= " + i );
            }
        for (j = 1; j < n; j *= 5) {
            System.out.println("j= " + j );
        }
    }
}