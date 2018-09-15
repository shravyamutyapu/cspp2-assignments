import java.util.Scanner;

/**
 * Solution class for code-eval.
 */
public final class Solution {
    /**
    * Constructs the object.
    */
    static class Quiz {
        int size;
        Quiz() {
            int size = 0;
        }

    }
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this Quiz
        Quiz q = new Quiz();
        // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
            case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                loadQuestions(s, q, Integer.parseInt(tokens[1]));
                break;
            case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
            case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore(q);
                break;
            default:
                break;
            }
        }
    }
    /**
     * Loads questions.
     *
     * @param      s              The scanner object for user input
     * @param      quiz           The quiz object
     * @param      questionCount  The question count
     */
    public static void loadQuestions(final Scanner s, final Quiz quiz, final int questionCount) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
        Quiz quiz1 = new Quiz();
        Scanner sc = new Scanner(System.in);
        //Object obj = new Object[10];
        int qncount = Integer.parseInt(sc.nextLine());
        System.out.println(qncount + " are added to the quiz");
        // for (int i = 1; i <= qncount; i++) {
        //     String[] lines = sc.nextLine().split(":");
        //     // lines = lines.;
        //     String[] choices = lines[1].split(",");
        //     String qn = lines[0];
        //     int correct = Integer.parseInt(lines[2]);
        //     int maxmarks = Integer.parseInt(lines[3]);
        //     int penalty = Integer.parseInt(lines[4]);


        }

    /**
     * Starts a quiz.
     *
     * @param      s            The scanner object for user input
     * @param      quiz         The quiz object
     * @param      answerCount  The answer count
     */
    public static void startQuiz(final Scanner s, final Quiz quiz, final int answerCount) {
        // write your code here to display the quiz questions
        // read the user responses from the console
        // store the user respones in the quiz object

        // for (int q = 0; q < 8; q++) {
        //     for (int i = 1; i <= 9; i++) {
        //         System.out.print("choice " + i + "   ")
        //     }
        //     System.out.println("");
        // }





    }

    /**
     * Displays the score report
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report
        int totalScore;
        //for(int i = 0;i<questionCount;i++){
        //totalScore += score[i];
    }
}

//}
