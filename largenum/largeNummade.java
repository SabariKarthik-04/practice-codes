package largenum;

import java.util.Scanner;

public class largeNummade {
    static String largeNum(int[] arr,int N){
        for(int i = 0;i<N;i++){
            for(int j = i+1 ;j<N;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        StringBuilder n = new StringBuilder();
        for(int a:arr){
            n.append(a);
        }
        return n.toString();
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of The Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements in array : ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The largest number that can be made : "+largeNum(arr, n));
        sc.close();
    }
}
