package GrootsPieFinder;


import java.util.ArrayList;

public class Main {



    public static void rec(ArrayList<Integer> arr,ArrayList<Integer> curr,int id, int sum, int target){
        if(id>=arr.size() || sum == target){
            if(sum == target){

                System.out.println(curr);
            }
            return;
        }
        if(sum>target){
            return;
        }

        sum += arr.get(id);
        curr.add(id);
        rec(arr,curr,id+1,sum,target);
        sum -= arr.get(id);
        curr.remove(curr.size()-1);

        rec(arr,curr,id+1,sum,target);
    }
    public static void pieFinder(ArrayList<Integer> arr, int target){

        ArrayList<Integer> curr = new ArrayList<>();

        rec(arr,curr,0,0,target);
    }

    public static void main(String args[]){

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        pieFinder(arr,6);
        
    }
}
