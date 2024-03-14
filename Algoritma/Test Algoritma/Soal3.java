public class Soal3 {
    public static void main(String[] args) {
        functionX(1,5);
    }
    public static void functionX(int start, int end) {
        for (int i = end; i >= start; i--) {
            for (int j = end; j >= i; j--) {
                System.out.print(j + " ");
            }
            for (int k = 1; k <= i-1; k++) {
                System.out.print(i + " ");
            }
            for (int l = i-1; l >= 1; l--){
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
