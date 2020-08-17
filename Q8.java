import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Number of queries:");
        int n= sc.nextInt();
        ArrayList<Integer> list= new ArrayList<>(n);
        int a;
        for(int i=1;i<=n;i++) {
            try
            {
                a=sc.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Invalid entry : String");
                break;
            }
            list.add(a);
        }
        for (Integer integer : list) {
            System.out.println((0.67)*integer);
        }
    }
}