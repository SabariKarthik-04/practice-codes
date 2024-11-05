package microsoftIntern;

import java.util.ArrayList;
import java.util.Scanner;
public class ChocolateFactory {
    static ArrayList<Integer> choco(int[] arr,int n){
        for(int i = 0;i<n;i++){
            if(arr[i]==0){
                for(int j=n-1;j>i;j--){
                    if(arr[j]!=0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = i+1 ;j<n;j++){
                if(arr[i] == 0||arr[j]==0){
                    continue;
                }
                else if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        ArrayList<Integer> li = new ArrayList<>();
        for(int i:arr){
            li.add(i);
        }

        for(int i=0;i<li.size()-1;i++){
            if(li.get(i).equals(li.get(i+1))){
                li.remove(i+1);
            }
        }

        return li;
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
        ArrayList<Integer> res = choco(arr, n);
        for(int r:res){
            System.out.print(r+" ");
        }
        sc.close();
    }
}
