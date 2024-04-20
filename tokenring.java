import java.util.*;

class tokenring {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        int n = scan.nextInt();
        int m = n - 1;
        // Decides the number of nodes forming the ring
        int token = 0;
        int ch = 0, flag = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(" " + i);
        }
        System.out.println(" " + 0);

        System.out.println("Enter sender:");
        int s = scan.nextInt();
        System.out.println("Enter receiver:");
        int r = scan.nextInt();
        System.out.println("Enter Data:");
        int a;
        a = scan.nextInt();
        System.out.print("Token passing:");
        for (int i = token, j = token; (i % n) != s; i++, j = (j + 1) % n) {
            System.out.print(" " + j + "->");
        }
        System.out.println(" " + s);
        System.out.println("Sender " + s + " sending data: " + a);
        for (int i = s + 1; i != r; i = (i + 1) % n) {
            System.out.println("data  " + a + " forwarded by " + i);
        }
        System.out.println("Receiver " + r + " received data: " + a + "\n");
    }
}
