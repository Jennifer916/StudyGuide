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
    a.addquestion("How to you say climate change in Spanish?", "cambio climatico");
    a.addquestion("What does the word reciclar mean" , "recycle");
   for (int i = 0; i<a.questionbank().size(); i++ ) {
        System.out.println(a.toString(i));
    }
   a.playgame();
    a.modifyquestion(4, "How do you say endangered species in Spanish", "el especies de peligro");
        for (int i = 0; i<a.questionbank().size(); i++ ) {
            System.out.println(a.toString(i));
        }
        a.getscore();
 }
}
