import java.util.ArrayList;
import java.util.Scanner;
public class StudyGuide {
    private int highscore;
    private int currentscore;
    private int random;
    private ArrayList<String[]> questions;
    public StudyGuide () {
        questions = new ArrayList<String[]> ();
        highscore= 0;
        currentscore=0;
    }
    /* You call this method to start playing */
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
        currentscore= score;
        if (currentscore > highscore) {
            highscore = currentscore;
            System.out.println("You got a new high score!");
        }
        System.out.println("Congradulations, you got a " + currentscore);
    }

    /* This method takes in you answer */
    public String getanswer() {
        Scanner s = new Scanner(System.in);
        random = (int) (Math.random() * questions.size()) ;
        System.out.println(questions.get(random)[0]);
        String input =  s.nextLine();
        return input;
    }

    /*  This method allows you to modify your questions. You put in the index of the question you want to replace. Then you put in the new question and the answer to it 
    */
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
     public void removequestion (int index) { 
        if (index>=0 && index<questions.size()) {
            questions.remove(index);
        }
    }
    public int getscore() {
        return currentscore;
    }
    public int getHighScore () {
        return highscore;
    }
      public ArrayList <String[]> questionbank () {
        return questions;
    }
    public String toString (int i ) {

               return "Question: " + questions.get(i)[0] + "/n " + "Answer: " + questions.get(i)[1] ;
    }

}
    
