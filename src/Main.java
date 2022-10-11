import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a[][] = new int[n][m];
        int k =0;
        for (int i =0;i <a.length;i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if  (i>0 && j>0){
                        a[i][j]=i*j;
                    }
                    else {
                        a[i][j]=k;
                    }
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();

        }
    }
}