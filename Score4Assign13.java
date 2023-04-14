// java.util.Arrays is imported as to provide the list-sorting methods
// that are necessary to actually calculate the score of the diver
import java.util.Arrays;


// As the Score4Assign is also intened to be a class that exists solely
// for the methods written within it, its heading will also incorporate 
// the final keyword, and its default constructor will be private as well
public final class Score4Assign13 {
    // To create the basic properties of the score4Assignment class
    // starting with the SevenScoreArray that will store the
    // scores given by the seven diving judges
    public static float[] sevenScoreArray = new float[7]; 
    public static float[] fiveScoreArray = new float[5]; 
    public static float sumValue;
    public static float difficultyValue; 
    public static float finalScore = (difficultyValue * sumValue) * 0.6f;
    public static float[] allEnteredFloats = Arrays.copyOf(sevenScoreArray,
    9); 
    
    
    
    // To create the method that will perform the list organizing 
    // operations that are necessary to calculate the final score
    // of the diver in question
    public static float scoreSumCalculate(float[] givenArray) {
        // To sort the given array (which is supposed to be an instance
        // of the sevenSortArray), from lowest to highest
        Arrays.sort(givenArray);
        
        // To separate the lowest and the highest scores of the diver 
        // in question from the rest of their scores. Given that the 
        // lowest and highest are, respectively, the first and last 
        // items of the sevenScoreArray if read from left to right, 
        // it makes sense to remove them from the rest by creating 
        // a new list from the second to sixth items of the 
        // sevenScoreArray
        fiveScoreArray = Arrays.copyOfRange(givenArray, 1, 6);
        
        // To calculate the total sum of all the remaining score
        // The use of i = i + 1 notation to increase the counter of 
        // 'spent' for loop is for my own benefit, as the i++ notation
        // can be confusing for me 
        sumValue = 0; 
        for (int i = 0; i < (fiveScoreArray.length); i = i + 1) {
            sumValue = sumValue + fiveScoreArray[i];
        }
        
        
        return sumValue; 
    }
    
    // To assign all scores and the difficulty level of a given diver and 
    // their dive to another array, as to enable the user to see all of the 
    // information that they have entered about the aforementioned
    public static float[] allEnteredMake(float[] sSA,float[] aEF, float dV, float fS) {
        for (int i = 0; i < (sevenScoreArray.length); i = i + 1) {
            aEF[i] = sSA[i];
        }
        aEF[7] = dV;
        aEF[8] = fS;
        
        return aEF; 
    }
    
    // To create the method which allows the user to actually input the 
    // judge-given scores of a diver, and to calculate said diver's final 
    // score 
    public static float[] userEnteredScore4Diver() {
        // To actually have the user input the seven scores that were
        // given to the dive of the diver
        System.out.println("Please enter the seven scores that the judges gave to"
        + " \nthis diver");
        for (int i = 0; i < (sevenScoreArray.length); i = i + 1) {
            String cardinalEnding = new String("Please enter the score of judge No." + i); 
            sevenScoreArray[i] = input4Assign13.inputBasic();
        }
        
        // To establish the fiveScoreArray of this dive, and to
        /// calculate the sum of its values 
        sumValue = scoreSumCalculate(sevenScoreArray); 
        
        // To establish the difficulty level of the dive
        System.out.println("Please enter the difficulty level that was assigned to"
        + " \nthe diver's diver");
        difficultyValue = input4Assign13.inputDifficulty();
        
        // To calculate the final score of the diver
        finalScore = (sumValue * difficultyValue) * 0.6f;
        
        allEnteredFloats = allEnteredMake(sevenScoreArray,allEnteredFloats, 
        difficultyValue, finalScore);
        return allEnteredFloats;
    }
    
    // To print out a string which prints out the scores that the user entered, 
    // along with the difficulty level of the dive in question and the final 
    // score 
    public static void scoreToString(float[] allEnteredFloats) {
        System.out.println("Score of Judge No.1: " + allEnteredFloats[0]);
        System.out.println("Score of Judge No.2: " + allEnteredFloats[1]);
        System.out.println("Score of Judge No.3: " + allEnteredFloats[2]);
        System.out.println("Score of Judge No.4: " + allEnteredFloats[3]);
        System.out.println("Score of Judge No.5: " + allEnteredFloats[4]);
        System.out.println("Score of Judge No.6: " + allEnteredFloats[5]);
        System.out.println("Score of Judge No.7: " + allEnteredFloats[6]);
        System.out.println("\n\nDifficulty level of dive: " + allEnteredFloats[7]);
        System.out.println("\n\nFinal score of dive: " + allEnteredFloats[8]);
        
    }
}
