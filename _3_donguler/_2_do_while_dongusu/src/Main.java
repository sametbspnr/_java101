import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pass;
        boolean asPassword = true;

        do {
            System.out.println("Şifre Giriniz: ");
            pass = input.nextInt();
            if (pass == 123){
                System.out.println("Doğru");
            asPassword = false;}
            else
            System.out.println("Yanlış");
        } while (asPassword);
        int i=1, j=1;
        while(i<3)
        {
            do
            {
                System.out.print(j + ",");
                j++;
            }while(j<4);
            i++;
        }
    }
}