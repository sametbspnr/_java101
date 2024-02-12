public class Main {
    public static void main(String[] args) {
        int a = 2, b = 20, c = 1;

        System.out.println(b++);
        if ((a < b) && (a < c)) {
            System.out.println("a en küçük sayıdır");
        } else if ((b < a) && (b < c)) {
            System.out.println("b en küçük sayıdır");
        } else if ((c < a) && (c < b)) {
            System.out.println("c en küçük sayıdır");
        }

        //

        if (a < b) {
            if (a < c) {
                if (a == 10) {
                    System.out.println("A sayısı 10'dur");
                }
            } else {
                System.out.println("A sayısı C'den büyüktür");
            }
        }
    }
}