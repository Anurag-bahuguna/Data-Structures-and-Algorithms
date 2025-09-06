public class patternProblem2 {

    public static void trianglePattern(){
        for(int i=0; i<=4; i++){
            for (int j=0; j<i+1; j++) {
                System.out.print("*" + ' ');
            }
            System.out.println();
        }
    }
     
    // Q each line print only same 
    public static void trianglePattern_Q1(){
        for(int i=1; i<=4; i++){
            for (int j=1; j<i+1; j++) {
                System.out.print(i + " ");          /*note : if i & j is start from 0 then -> (i+1) + " " */
            }
            System.out.println();
        }
    }
    // Q each line start with 1
    public static void trianglePattern_Q2(){
        for(int i=1; i<=4; i++){                /*note : if i is starat from 0 or 1 , there is no effect on proagram */
            for (int j=1; j<i+1; j++) {
                System.out.print(j + " ");          
            }
            System.out.println();
        }
    }


    //Q
    public static void reverseTrianglePattern() {
        int n = 4;
        for(int i=0; i<=n; i++){
            for (int j=i+1; j>0; j--) {
                System.out.print(j + " ");          
            }
            System.out.println();
        } 
    }
    public static void main(String[] args) {
        // trianglePattern();
        // trianglePattern_Q1();
        // trianglePattern_Q2();
        reverseTrianglePattern();
    }
}
