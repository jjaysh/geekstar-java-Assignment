import java.util.Scanner;

public class positiveno
{
    public static void main(String[] args) {
        int arr[] = new int[5];
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println("Positive elements in the array : " + arr[i]);
            }
        }

    }
}