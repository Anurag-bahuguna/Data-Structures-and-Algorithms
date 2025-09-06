public class patternProblems {
    //squre pattern
    //Q Wap to print squarePatternOfNumbers but new numbers in next line
    public static void squarePattern_Question() {
        int num =1;
        for(int i=1; i<=4; i++) {
            for(int j=1; j<=4; j++) {
                System.out.print(num + " ");
                num++;                
            }
            System.out.println();
            
        }
    }
  
    //Q Wap to print squarePatternOfNumbers but each line print same number
    public static void squarePattern_Question2() {
        int num =1;
        for(int i=1; i<=4; i++) {
            for(int j=1; j<=4; j++) {
                System.out.print(num + " ");                               
            }
            System.out.println();
            num++;
            
        }
    }

    public static void main(String[] args) {
        
        squarePattern_Question();
        squarePattern_Question2();
    }
}
