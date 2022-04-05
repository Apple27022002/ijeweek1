public class test {
    public static void main(String[] args) {
        double a[] = {5, 7, 8, 9, 10};
        double b[] = new double[4];
        for (int i = 2; i < a.length - 1; i++) {
            a[i] = a[i + 1];

        }
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
            System.out.println(b[i]);
        }


    }
}
