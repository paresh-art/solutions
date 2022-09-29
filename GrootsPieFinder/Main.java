package GrootsPieFinder;


import java.util.ArrayList;

public class Main {

    public static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    public static void rec(ArrayList<Integer> arr,ArrayList<Integer> curr,int id, int sum, int target){
        if(id>=arr.size() || sum == target){
            if(sum == target){
                ans.add(curr);
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
        System.out.println(ans);
    }

    public static void main(String args[]){




    }
}
