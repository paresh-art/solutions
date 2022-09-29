package arkhamcity;

public class Main {
    public static int findNumOfStepsRequired(int n, int s){
        int steps = n*s;
        return steps;
    }


    public static void main(String args[]){

        System.out.println(findNumOfStepsRequired(3,10));
    }
}
