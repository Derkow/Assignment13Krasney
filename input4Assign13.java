// The reason as to why one of the keywords of this class is final as it 
// apparently helps to turn a top-level class (like this one) into a static
// class by making any subclass within the top-level class in question
// being recognized as legitimate code to execute, at least per the words
// of the user Paul Sasik per this answer on StackExchange:
// https://stackoverflow.com/a/7486111


import java.util.Scanner; 
public final class input4Assign13 {  
    // The reason as to why the default constructor of this class is given
    // the prive keyword is to prevent any other class from accessing
    // this class 
    private input4Assign13() {
    }
    
    static Scanner userInput = new Scanner(System.in);
    
    // To create the method that will check all the numbers entered by 
    // the user in the course of Assignment 13
    public static float inputBasic() {
        System.out.println("Please enter a number. It can be any number from " 
        + "zero to ten, and it can be a decimal as well.");
        // To serve as the controlling variable for the while loop down below.
        // The while loop exists as to prevent the user from having to reload 
        // the program when they make a mistake when entering input
        int placeholder1 = 1; 
        float inputBasicFloat = 0f;
        while (placeholder1 == 1) {
            inputBasicFloat = userInput.nextFloat();
            if (inputBasicFloat < 0 || 10 < inputBasicFloat ) {
                System.out.println ("Please enter a value that is in the bounds described above");
                continue;
            }
            else {
                break;
            }
        }
        return inputBasicFloat;
    }
    
    // To create the method that will check the number entered by the user 
    // when answering the question about the difficulty level of the diver
    // in question's dive 
    public static float inputDifficulty() {
        System.out.println("Please enter a value that can be any number from 1.2 to 3.8");
        int placeholder2 = 1; 
        float inputDifficultyFloat = 0f;
        while (placeholder2 == 1) {
            inputDifficultyFloat = userInput.nextFloat();
            if (inputDifficultyFloat < 1.2 || 3.8 < inputDifficultyFloat) {
                System.out.println ("Please enter a value that is in the bounds described above");
                continue;
            }
            else {
                break;
            }
        }
        return inputDifficultyFloat; 
    }
    
    
    // To create the method that will check the answers the user gives in response to 
    // questions contained within the main program Given that such question is a 
    // yes-or-no question, this method will check to 
    // see if the answer of the user is either yes or no. If the answer is neither yes 
    // or no, the program will ask the user to answer the question again, and will do 
    // so via a while loop. A placeholder variable will not be created for the while 
    // loop of this method, as it will be the truth-value of of the expression 
    // yes.equals(no), which will assuredly be false 
    public static String inputString() {
        System.out.println("Please answer either yes or no to the above question.");
        String yes = "YES";
        String no = "NO";
        String inputStringAnswerProto = "";
        String inputStringAnswer = "";
        
        
        while (yes.equals(no) == false) {
            inputStringAnswerProto = userInput.nextLine();
            inputStringAnswer = inputStringAnswerProto.toUpperCase();
            if (yes.equals(inputStringAnswer) == true && no.equals(inputStringAnswer) == false) {
                break;
            } 
            else if (yes.equals(inputStringAnswer) == false && no.equals(inputStringAnswer) == true) {
                break;
            }
            else {
                continue;
            }
        }
    
        return inputStringAnswer;
    }
    
    
}

