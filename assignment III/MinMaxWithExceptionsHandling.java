import java.util.Scanner;

//assignmet 3.1 
// wap to find maximun & minimun in a set of values without using Array 

public class a {
    public static void main(String[] args) {
        int size = 0, a = 0, min = 0, max = 0;
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        {
            System.out.println("Enter no of values to be entered for evaluation: ");
            try {
                size = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Error!! v247..Entering value other than integer.");
                flag = false;
            }
        }
        if (size <= 0) {
            flag = false;
            System.out.println(
                    "Size being equal or smaller than 0(zero) doesn't make sence try value greater than.. You know you are smart");
        }
        for (int i = 0; i < size; i++) {
            System.out.println("enter " + (i + 1) + " value :");
            try {
                a = scan.nextInt();
            } catch (Exception e) {

                System.out.println("Error!! v247..Entering value other than integer.");
                flag = false;
            }
            if (i == 0) {

                min = max = a;
            } else {
                if (a < min) {
                    min = a;
                }
                if (a > max) {
                    max = a;
                }
            }
        }
        if (flag) {
            System.out.println("Maximum Value:" + max + ", Minimum Value:" + min);
        } else {
            System.out.println("Please try Re-Entering acceptable values.");
        }
        scan.close();
    }
}
