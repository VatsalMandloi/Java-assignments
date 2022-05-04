//assignmet 1.2 
//wap to enter n value from command line and find square and cube of given number and 
//display results in descending order.
public class SquareCube {
    public static void main(String[] args) {
        if (args.length > 0) {
            int len = (args.length);
            int a;
            for (int i = len - 1; i >= 0; i--) {
                a = Integer.parseInt(args[i]);
                System.out.println(" Square:" + (a * a) + ", Cube:" + (a * a * a));
            }
        }
    }
}
