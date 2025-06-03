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

    public String getanswer() {
        Scanner s = new Scanner(System.in);
        random = (int) (Math.random() * questions.size()) ;
        System.out.println(questions.get(random)[0]);
        String input =  s.nextLine();
        return input;
    }

    /*  This method allows you to change your questions. You put in the index of the question you want to replace. Then you put in the new question, the answer, and the topic
    */
    public void modifyquestion(int index, String question, String answer, String topic) {
        String[] arr = {question, answer, topic};
        if (index >= questions.size()) {
            questions.add(arr);
        }
        questions.set(index, arr);
    }
    
    public void addquestion(String question, String answer,String topic) {
        String[] list = {question, answer,topic};
        questions.add(list);
    }
    public void removequestion (int index) { 
        if (index>=0 && index<questions.size()) {
            questions.remove(index);
        }
    }
    public void removetopic (String topic) { 
         for (int i = 0; i<questions.size(); i++ ) {
            if (questions.get(i)[2].equals(topic)) {
                questions.remove(i);
                i--;
            }
    }
    }
    public String [] seequestion(int index) {
        return questions.get(index);
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

               return "Question: " + questions.get(i)[0] + " /n " + "Answer: " + questions.get(i)[1] + " /n " + "Topic: " + questions.get(i)[2] ;
    }

}
    
