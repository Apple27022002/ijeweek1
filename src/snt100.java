
public class snt100 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 2; i < 20; i++) {
            boolean k = true;
            for (int j = 2; j < i; j++){
                if (i%j==0){
                    k=false;
                    break;
                }
            }if(k==true) {
                System.out.println(i);
                count++;
            }
        }
    }
}
