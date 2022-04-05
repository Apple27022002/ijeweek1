import java.util.Scanner;

public class th1vonglap {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner a1 =new Scanner(System.in);
        Scanner b1=new Scanner(System.in);
        Scanner c1=new Scanner(System.in);
        System.out.println("Nhap vao so tien muon vay");
        a =a1.nextDouble();
        System.out.println("Nhap vao ty le lai");
        b=b1.nextDouble();
        System.out.println("Nhap vao so thoi gian tra");
        c=c1.nextDouble();
        System.out.println("so tien lai la"+a*(b/12)*c);
    }
}
