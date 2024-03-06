public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("i değeri 5'tir");
                continue;      // break donguden cıkartır,
                // continue dongunun altındaki kısmı
                // yapmayıp sonraki duruma gecer
            }
            System.out.println(i);
        }
    }
}