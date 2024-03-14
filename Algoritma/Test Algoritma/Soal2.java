public class Soal2 {
    public static void main(String[] args) {
        functionX(1,10,2);
    }
    public static void functionX(int start, int end, int multiply) {
        for (int i = start; i <= end; i++) {
            for (int j = i; j <= end; j++) {
                System.out.print(j * multiply + " ");
            }
            System.out.println();
            end--;
        }
    }
}
