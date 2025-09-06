public class patternProblems {
    //squre pattern

    public static void squarePatternOfStars(){        
        for(int i=1; i<=5; i++) {
            for (int j=1; j<=5; j++){                
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void squarePatternOfNumbers(){        
        for(int i=1; i<=5; i++) {
            for (int j=1; j<=5; j++){                
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void squarePatternOfCharacters(){ 
        for(int i=1; i<=5; i++) {
            char ch = 'A';
            for (int j=1; j<=5; j++){                
                System.out.print(ch + " ");
                ch +=1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // squarePatternOfStars();
        // squarePatternOfNumbers();
        squarePatternOfCharacters();
    }
}
