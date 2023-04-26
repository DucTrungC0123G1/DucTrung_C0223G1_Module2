public class String {
    public static int[] main(String[] args) {
        int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                int temp = 0;
                if (a[i] != -1 && a[j] != -1 && a[i] < a[j]) {
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
}
