import java.util.*;

import javax.xml.stream.events.StartDocument;

public class CountDuplicate {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        countDuplicate(arr,n);
    }

    public static void countDuplicate(int arr[],int n){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}

