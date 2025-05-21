import java.util.ArrayList;
import java.util.Scanner;
public class StudyGuide {
    private int highscore;
    private String mode;
    private String answer;
    private ArrayList<String[]> questions;
    public StudyGuide () {
        questions = new ArrayList<String[]> ();
    }
    public String playgame() {
        int score = 0;
        int miss = 3;
        int count = 0;
        while (count > miss) {
            if (getquestion()) {
                score++;
            } else {
                count++;
            }
        }
        if (score > highscore) {
            highscore = score;
        }
        return "Congradulations, you got a " + score;
    }

    public boolean getquestion() {
        int random = (int) (Math.random() * questions.size() + 1);
        System.out.println(questions.get(random)[1]);
        Scanner s = new Scanner(System.in);
        String answer = s.nextLine();
        if (answer.indexOf(questions.get(random)[2]) >= 0) {

            return true;
        }

        return false;
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
    public String questionbank() {
        for (int i = 0 ; i<questions.size(); i++ ) {
            String[] a = questions.get(i);
            return toString(a);
        }
    }
    public String toString (String [] a ) {

               return "Question: " + a[1] + "/n" + "Answer: " + a[2];
    }
}
    
