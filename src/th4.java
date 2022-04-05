import java.util.Scanner;

public class th4 {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner i =new Scanner(System.in);
        Scanner t =new Scanner(System.in);
        System.out.println("Nhap a");
        a=i.nextDouble();
        System.out.println("Nhap b");
        b=t.nextDouble();
        if (a==0){
            if (b==0){
                System.out.println("phuong trinh vo ngien");
            }else {
                System.out.println("phuong trinh vo nghiem");
            }
        }else{
            System.out.println("phuong trinh co nghiem la "+-b/a);
        }

    }
}
