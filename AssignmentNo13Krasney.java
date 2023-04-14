// This program was written on March 27th by Alexandra Krasney

/**
 * Pseudo-Code: 
 * 
 * 1) Create scanner object 
 * 2) Create input class, which will check input to see if it is 
 * a non-negative float or not, and if it is not in fact a positive float, 
 * will prompt the user to enter again
 * 3) Create inputDifficulty method of input class which will also prompt
 * the user to enter again if what was previously entered is not a value
 * between 1.2 and 3.8
 * 4) Create score class, which will use input class to fill an array of 
 * floats named sevenScoreArray, which represents the seven scores given 
 * by the judges of the dive in question
 * 5) In score class, first use sort() method to arrange the seven scores
 * in ascending order, and then use slice() method to remove the highest
 * and lowest scores of the seven scores (which are respectively the first
 * and last items in sevenScoreArray to create a new array of floats known 
 * as fiveScoreArray
 * 6) Use reduce() method to calculate the sum total of fiveScoreArray, 
 * storing the resulting value in a float known as sumTotal 
 * 7) Use inputDifficulty to obtain the difficulty value of the dive, 
 * which is then stored in a float known as difficultyValue
 * 8) To obtain the score, multiply sumTotal by difficultyValue, and
 * then multiply the resulting product by 0.6 to obtain the score
 * 9) Return the score as a float known as score 
 * 10) In main program, create a string that explain the purpose of the 
 * program, and then a do-while loop
 * 11) Within the do-while loop of the main program, create and then 
 * execute an object of the score class 
 * 12) Print out the float that is returned by the score object of the 
 * main method, and then ask if the user would like to calculate the
 * scores of another diver 
 * 13) Check the input entered by the user in response to the previous 
 * question -- program will continue if user answers "Yes", no matter the 
 * case of the entered letters of the user's answer, exit the
 * program if the user enters "No", again regardless of the case of its 
 * letters, and tell the user to re-enter their answer if it is neither 
 * yes or no in its content (the method, named inputString(),for checking 
 * the input given for the previous question will also be stored in the 
 * input class)
 */
import java.util.Arrays;

public class AssignmentNo13Krasney {
    public static void main(String[] args) {
        // To inform the user to start the program
        System.out.println("Please enter something to start the program");
        // To inform the user of this program's purpose 
        System.out.println("The purpose of this program is calculate the final score of a" 
        + " \ndiver's dive. To do so first, however, the user must enter the seven scores"
        + " \nthat the judges assigned to said dive, in addition to the level of difficulty"
        + " \nthat it was judgex to have.");
        System.out.println("\n\nFurthermore, if the user wishes it to be so, this program"
        + " \ncan print out a summary containing the information that they entered in"
        + " \naddition to the final score, as well as to repeat the process with another diver.");
        
        // To create the placeholder variable for the main do-while loop 
        // of this program
        String placeholder = "YES";
        String answer = "";
        
        // To allow the user the choice of whether or not to calculate
        // the score of a diver in the first place 
        
        do {
        System.out.println("Do wish to calculate the final score of a diver in a compeition?");
        answer = input4Assign13.inputString();
        
        if (placeholder.equals(answer) == true) {
            // This while loop is to allow the user the two choices of 
            // of seeing a summary of the divers' score that they had 
            // entered, and of the option of t
            while (placeholder.equals(answer) == true) {
                float[] diverScore = Score4Assign13.userEnteredScore4Diver();
                System.out.println("Do you wish to see a summary of the data "
                + "that was just entered?");
                answer = input4Assign13.inputString();
                if (placeholder.equals(answer) == true) {
                    Score4Assign13.scoreToString(diverScore);
                }
                else {
                    System.out.println("The final score of the diver in question is: "
                    + "\n" + diverScore[8]);
                }
                
                System.out.println("\nDo you wish to enter the score of another " +
                "diver?");
                answer = input4Assign13.inputString();
                if (placeholder.equals(answer) == true) {
                    continue; 
                }
                else {
                    answer = "NO";
                    System.out.println("This program will end then.");
                    break;
                }
            }
        }
        else {
            // Means that the answer returned is "NO"
            System.out.println("This program will end then.");
            break;
        }
        
        } while (placeholder.equals(answer) == true);
    }

}