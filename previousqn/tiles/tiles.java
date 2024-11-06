package tiles;

import java.util.ArrayList;
import java.util.Scanner;

public class tiles {
    static ArrayList<String> checkTile(String[] arr,int n){
        ArrayList<ArrayList<String>> res = new ArrayList<>();

        for(int i = 0 ; i < n;i++){
            ArrayList<String> sub = new ArrayList<>();
            sub.add(arr[i]);
            for(int j = 0 ;j < n;j++){
                if(i!=j&&sub.get(sub.size()-1).charAt(1)==arr[j].charAt(0)){
                    sub.add(arr[j]);
                }
            }
            res.add(sub);

        }
        int max =Integer.MIN_VALUE ;
        for(int i =0;i<res.size();i++){
            if(max<res.get(i).size()){
                max = i;   
            }
        }
        return res.get(max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        ArrayList<String> r = checkTile(arr, n);
         System.out.println(r);        
         sc.close();
    }
}
