public class StudyGuide {
    private ArrayList <Integer> scores;
    private String mode;
    private String answer; 
    private int score; 
    private int count ;
    private int miss= 3; 
    private ArrayList <String[]> questions; 
  //  public StudyGuide () {
        
  //  }
    public String playgame() {
        int score = 0 ; 
        int miss= 5 ; 
        int count = 0 ;
        int size =  questions.size();
        while (count>miss) {
                getquestion();
        }
          scores.add(score); 
          return  "Congradulations, you got a " + score;  
    }
    public boolean getquestion () {
        Scanner s = new Scanner (System.in);
        int random = (int) (Math.random () * size) + 1; 
        System.out.println(questions.get(random)[1]);
        answer = s.nextline();
        if (answer.indexOf(questions.get(random)[2])>=0 ) {
            score++;
            return true;
        }
        count++;
        return false;
    }
    public ArrayList <String> questionbank () {
        return questions;
    }
    public void change ( String question, String answer) {
        
    }
    public boolean modifyquestion (int index, String question, String answer) {
        String [] arr = {question, answer};
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
    public void addquestion (String question, String answer) {
        String [] list = {question, answer};
        questions.add(list);
    }


}