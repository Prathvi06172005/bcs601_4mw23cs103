public class Main {

    public static int fact(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    public static int min(int[] a) {
        int res = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < res) {
                res = a[i];
            }
        }
        return res;
    }

    public static int max(int[] a) {
        int res = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > res) {
                res = a[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {

        for (int i = 4; i <= 8; i++) {
            System.out.println(i + " " + fact(i));
        }

        int[] a = {20, 21, 30, 31, 44};

        System.out.println("min = " + min(a));
        System.out.println("max = " + max(a));
    }
}