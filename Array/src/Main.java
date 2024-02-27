import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void ArrayInput(int a[], int n) {
        Scanner scanin = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i + ":");
            a[i] = scanin.nextInt();
        }

        //Random Array
//        Random random = new Random();
//
//        for (int i=0; i < n; i++){
//            a[i] = random.nextInt(20);
//        }
    }

    public static void ArrayOutput(int a[], int n) {
        System.out.println("Mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(a));
    }

    public static boolean LinearSearch(int a[], int n, int x) {
        int i = 0;
        while (i < n) {
            if (a[i] == x)
                return true;
            i++;
        }
        return false;
    }

//    public static boolean BinarySearch(int a[], int n, int x) {
//
//    }

    public static void insertElement(int a[], int n, int pos, int value){
        n++;
        for (int i = n - 1; i > pos; i--){
            a[i] = a[i-1];
        }
        a[pos] = value;
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Scanner scanin = new Scanner(System.in);
        int n = 4;
        int[] a = new int[n];
        ArrayInput(a, n);
        ArrayOutput(a, n);
        System.out.println("Số phần tử của mảng: " + a.length);
        Arrays.sort(a);
       // System.out.println("Mảng sau khi được sắp xếp: " + Arrays.toString(a));

        insertElement(a,n,2,3);
        System.out.println("Mảng sau khi được chèn: " + Arrays.toString(a));
//        int x;
//        System.out.println(("Nhập x: "));
//        x = scanin.nextInt();
//        if (Arrays.binarySearch(a, x) == 1) {
//            System.out.println("X có tồn tại trong mảng");
//        } else {
//            System.out.println("X không tồn tại trong mảng");
//        }
//
//        if (LinearSearch(a, n, x) == true)
//            System.out.println("Tìm thấy x");
//        else
//            System.out.println("Không tìm thấy x");
    }
}