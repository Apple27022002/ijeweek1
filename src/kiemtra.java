import java.util.Scanner;

public class kiemtra {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Nhap so luong : ");
            int n = sc.nextInt();
            System.out.println("Nhap cac phan tu: ");
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("nhap i" + i + " : ");
                array[i] = sc.nextInt();
            }
            // tong chan
            int tongchan = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] % 2 == 0) {
                    tongchan += array[i];
                }
            }
            System.out.println("Tong chan : " + tongchan);
            // tim vi tri a
            System.out.print("Nhap vao a : ");
            int a = sc.nextInt();
            for (int i = 0; i < n; i++) {
                if (array[i] == a) {
                    System.out.print("Vi tri a la : " + i);
                }
            }
            //nhap roi xoa a
            int[] ad = new int[n - 1];
            int c = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == a) {
                    c = i;
                }
            }
            for (int i = 0; i < ad.length; i++) {
                if (c < i) {
                    ad[i] = array[i];
                } else {
                    ad[i] = array[i + 1];
                }

            }

        }
}
