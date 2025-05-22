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
    public String playgame() {
        int score = 0;
        int miss = 3;
        int count = 0;
        while (count > miss) {
            if (answer.indexOf(questions.get(random)[2]) >= 0) {
                score++;
            } else {
               count++;
            }
        if (score > highscore) {
            highscore = score;
        }
        return "Congradulations, you got a " + score;
    }

    public boolean getquestion() {
        Scanner s = new Scanner(System.in);
        random = (int) (Math.random() * questions.size() + 1);
        System.out.println(questions.get(random)[1]);
        return s.nextLine();
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
}
    
