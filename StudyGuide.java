import java.util.ArrayList;
import java.util.Scanner;
public class StudyGuide {
    private ArrayList <Integer> scores;
    private String mode;
    private String answer; 
    private ArrayList <String[]> questions;
  //  public StudyGuide () {
        
  //  }
    public String playgame() {
        int score = 0 ; 
        int miss= 3 ; 
        int count = 0 ;
        while (count>miss) {
                if (getquestion()) {
                    score++:
                } else {
                    count++;
                }
          sortscores(score); 
          return  "Congradulations, you got a " + score;  
    }
    public boolean getquestion () {
        Scanner s = new Scanner (System.in);
        int random = (int) (Math.random () * questions.size() + 1);
        System.out.println(questions.get(random)[1]);
        answer = s.nextLine();
        if (answer.indexOf(questions.get(random)[2])>=0 ) {
            score++;
            return true; 
        }
        count++;
        return false;
    }
    public ArrayList <String[]> questionbank () {
        return questions;
    }
    public void modifyquestion (int index, String question, String answer) {
        String [] arr = {question, answer};
        if (index>=questions.size ()) {
                questions.add(arr);
            }
         questions.set(index,arr);  
    }
    public void addquestion (String question, String answer) {
        String [] list = {question, answer};
        questions.add(list);
    } 
    public void sortscores (int score) {
            for (int i = 0 ; i<scores.size() ; i++ ) {
                if (score<scores.get(i)) {
                    scores.add(i, score);
                }
            }
        scores.add(score) ; 
}
