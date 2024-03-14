public class Soal2 {
    public static void main(String[] args) {
        functionX(1,5,2);
    }
    public static void functionX(int a, int b, int c) {
        
        for (int i = a; i <= b; i += c) {
            for (int j = i; j <= b; j++) {
                System.out.print(j * 2 + " ");
            }
            System.out.println();
        }
    }
}
