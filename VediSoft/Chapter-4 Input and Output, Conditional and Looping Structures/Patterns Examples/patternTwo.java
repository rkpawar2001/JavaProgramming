class patternTwo {
    public static void main(String args[]) {
        int n = 10, i, j;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= (n - i); j++)
                System.out.print(" ");
            for (j = i; j >= 1; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}
