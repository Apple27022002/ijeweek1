import java.util.Scanner;

public class kiemtra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao N: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap vao phan tu: " + i);
            int number = scanner.nextInt();
            arr[i] = number;
        }
        displayArray(arr);
        System.out.println("");
        System.out.println("tong cac phan tu chan la: " + sum(arr));
        System.out.println("nhap vao so can tim: ");
        n = scanner.nextInt();
        System.out.println("vi tri cua so can tim la: " + findNumber(n, arr));
        System.out.println("nhap vao so muon xoa");
        n = scanner.nextInt();
        delElement(n, arr);
        System.out.println("nhap vao so muon them:");
        n = scanner.nextInt();
        System.out.println("nhap vao vi tri muon them:");
        int m = scanner.nextInt();
        addElement(n, m, arr);
    }
    static int sum(int[] arr) {
        int sum = 0;
        for (int num :
                arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
    static int findNumber(int num, int[] arr) {
        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                position = i;
            }
        }
        return position;
    }
    static void delElement(int num, int[] arr) {
        int[] arr2 = new int[arr.length - 1];
        int fake = findNumber(num, arr);

        if (fake != -1) {
            for (int i = 0; i < fake ; i++) {
                arr2[i] = arr[i];
            }
            for (int i = fake; i < arr2.length; i++) {
                arr2[i] = arr[i+1];
            }
        }
        displayArray(arr2);
    }
    static void addElement(int num,int position, int[] arr) {
        String str = "";
        int[] arr2 = new int[arr.length+1];
        if (position >= 0) System.arraycopy(arr, 0, arr2, 0, position);
        arr2[position] = num;
        for (int i = position+1; i < arr2.length; i++) {
            arr2[i] = arr[i-1];
        }
        displayArray(arr2);
    }
    static String  displayArray(int[] arr) {
        System.out.printf("mang la: ");
        String str = "";
        for (int a: arr
        ) {
            str += System.out.printf( a + "\t");
        }
        return str;
    }
}