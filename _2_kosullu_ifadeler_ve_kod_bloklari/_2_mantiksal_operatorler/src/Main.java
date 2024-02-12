public class Main {
    public static void main(String[] args) {

        int a=20, b=20, c;
        boolean kosul1 = (a < b);
        boolean kosul2 = (a > b);
        boolean sonuc = kosul1 || kosul2;
        System.out.println(kosul1);

        c = ( a == b) ? 2 : 3;
        System.out.println(c);

        // && ve
        // || veya
        // ! degil
    }
}