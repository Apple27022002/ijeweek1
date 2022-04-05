import java.util.Scanner;

public class docso {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int so = sc.nextInt();
        String[] arr ={"Khong","mot","hai","ba","bon","nam","sau","bay","tam","chin","muoi"};
        String chuoi =null;
        if(so >=10 && so<=19){
            if(so%10 !=5){
                chuoi ="muoi"+arr[so%10];
            }
            else {
                chuoi = "muoi" +"lam";
            }
        }
        if (so >=20 && so <100){
            if(so%10==0){
                chuoi = arr[so/10]+"muoi";
            }
        }
        else if (so%10==1){
            chuoi = arr[so/10]+"muoi mot";

        }
        else if (so%10==5){
            chuoi = arr[so/10]+"muoi lam";
        }
        else {
            chuoi =arr[so/10]+ "muoi"+arr[so%10];
        }
    }

}
