import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    StudyGuide a = new StudyGuide (); 
    a.addquestion("What does the marea negra mean?", "oil spill");
    a.addquestion("what does the word terremoto mean?", "earthquake");
    a.addquestion("How do you say glass in Spanish?", "vidrio");
    a.addquestion("How do you say flood in Spanish?", "inundacion");
    a.addquestion("What does the word pila mean? ", "battery");
    for (int i = 0; i<a.questionbank().size(); i++ ) {
        System.out.println(a.toString(i));
    }
    a.playgame();
 }
}
