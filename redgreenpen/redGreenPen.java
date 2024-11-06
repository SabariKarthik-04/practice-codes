package redgreenpen;

import java.util.Scanner;

public class redGreenPen {
    
    static int changefromRedtoGreen(int[] arr,int n){
        int change= 0;
        for(int i = 0; i<n-1;i++){
            if(arr[i]%2 != 0 && arr[i+1]%2 == 0){
                change++;
            }
        }
        return change;
    }
    static int change(int[] arr,int n){
        int change= 0;
        for(int i = 0; i<n-1;i++){
            if((arr[i]%2 != 0 && arr[i+1]%2 == 0)||(arr[i]%2 == 0 && arr[i+1]%2 != 0)){
                change++;
            }
        }
        return change;
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
        System.out.println("Changes Made From Red To Green : "+ changefromRedtoGreen(arr, n));
        System.out.println("Changes Made : "+ change(arr, n));

        sc.close();

    }
}
