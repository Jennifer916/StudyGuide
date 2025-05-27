import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class StudyGuide {
    private int highscore;
    private String mode;
    private String answer;
    private int random;
    private ArrayList<String[]> questions;
    public StudyGuide () {
        questions = new ArrayList<String[]> ();
    }
    public void playgame() {
        int score = 0;
        int miss = 3;
        int count = 0;
        while (count < miss) {
            String useranswer = getanswer();
            if (useranswer.indexOf(questions.get(random)[1]) >= 0) {
                score++;
                System.out.println("You're right!");
            } else {
                count++;
                System.out.println("You're wrong!");
            }
        }
        System.out.println("Game's over");
        if (score > highscore) {
            highscore = score;
            System.out.println("You got a new high score!");
        }
        System.out.println("Congradulations, you got a " + score);
    }

    public String getanswer() {
        Scanner s = new Scanner(System.in);
        random = (int) (Math.random() * questions.size()) ;
        System.out.println(questions.get(random)[0]);
        String input =  s.nextLine();
        s.nextLine();
        return input;
    }

    public void modifyquestion(int index, String question, String answer) {
        String[] arr = {question, answer};
        if (index >= questions.size()) {
            questions.add(arr);
        }
        questions.set(index, arr);
    }

    public void addquestion(String question, String answer) {
        String[] list = {question, answer};
        questions.add(list);
    }


    public int getscore() {
        return highscore;
    }
    public ArrayList<String[]> questionbank() {

        return questions;
    }
    public String toString (int i ) {

               return "Question: " + questions.get(i)[0] + "/n " + "Answer: " + questions.get(i)[1] ;
    }
    public String [] searchquestion (int index) {
        for (int i = 0 ; i<questions.size(); i++ ) {
            if (i== index) {
                return questions.get(i);
            }
        }
        String [] nothing = {"Nothing", "Nothing"};
        return nothing;

    }

}
    
