public class Soal1 {
    public static void main(String[] args) {
        int jumlahDeret = 5;
        int value = 2;

        for (int i = 0; i < jumlahDeret; i++) {
            value += (int)(3 * Math.pow(4, i));
            System.out.print(value);
            if (i < jumlahDeret - 1) {
                System.out.print(", ");
            }else{
                System.out.print(".");
            }
        }
    }
}
