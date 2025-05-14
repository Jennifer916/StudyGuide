public class StudyGuide {
    private ArrayList <Integer> scores;
    private String mode;
    private String answer; 
    private ArrayList <String [] [] > questions; 
    public StudyGuide (String m) {
        mode = m; 
    }
    public String playgame() {
        int score = 0 ; 
        int miss= 0 ; 
        int count = 0 ;
        if (mode = "hard") {
            miss = 3; 
        }
        while (count>miss) {
                int random = (int) (Math.random () * questions.size()) + 1; 
                getanswer();
                if (questions.get(random)[2]= getanswer()) {
                    score++;
                } else {
                    count++;
                }
            }
          scores.add(score); 
          return  "Congradulations, you got a " + score;  
    }
    public String getquestion () {
        Scanner s = new Scanner (System.in) ;
        answer = s.nextline();
        return answer;  
    }
    public ArrayList <String> questionbank () {
        return questions;
    }
    public void change ( String question, String answer) {
        
    }
    public boolean modifyquestion (int index, String question, String answer) {
        String [][] arr = {question, answer};
        if (index>questions.size ()) {
            return false; 
        } else { 
            if (index==question.size() ) {
                questions.add(arr);
                return true;
            }
        }
         questions.set(index,arr);
         return true; 
        
        
    }

}