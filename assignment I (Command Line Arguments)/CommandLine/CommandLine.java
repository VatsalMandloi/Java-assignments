//assignmet 1.1 
// wap to enter n value from command line and a/d at last to decide 
//order(ascending/descending) and print in that particular order.
public class CommandLine {
    public static void main(String[] args) {
        if (args.length > 0) {
            int len = (args.length);

            if (args[len - 1].equals("d") || args[len - 1].equals("D")) {
                System.out.println("desencending Order:");
                for (int i = len - 2; i >= 0; i--) {
                    System.out.println(args[i]);
                }
            } else {
                System.out.println("By Default asencending Order:");
                for (int i = 0; i < len - 1; i++) {
                    System.out.println(args[i]);

                }
            }

        }
    }
}
