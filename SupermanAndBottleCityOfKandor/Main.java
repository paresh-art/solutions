package SupermanAndBottleCityOfKandor;

public class Main {
    //s = array of solar system, r = array of range for life
    public static int isLifePossible(double[][][] s, double[] r){
        double out = 0;
        double total =0;
        for(int i=0;i<s.length;i++){
            for(int j=0;j<s[i].length;j++){
                for(int k=0;k<s[i][j].length;k++){
                    if(k==0){
                        out = s[i][j][k];
                    }
                    out *= (1/s[i][j][k]);
                }
                total += out;
                out =0;
            }
            if(total >= r[0] && total <= r[r.length-1]){

                return 1;
            }
            total =0;
        }

        return -1;
    }

    public static void main(String args[]){

        double[][][] s = {{{0.433, // Stars output
                200 // Distance from the star
        }},{{
                0.89, // Star one's output
                400 // Distance from the star one
        },{
                0.6, // Star two's output
                300 // Distance from the star two
        }
        }};
        double[] r={0.003, 0.005};

        System.out.println(isLifePossible(s,r));



    }
}
