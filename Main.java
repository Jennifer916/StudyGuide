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
    a.addquestion("What is the tu form of the word escribir in imperfect tense", "escribias");
    a.addquestion("What is the yo form of the word ir in preterite tense", "fui");
    a.addquestion("What is the yo form of the word sacar in preterite tense", "saque");
    a.addquestion("What is the el/ella form of the word estar in preterite tense", "estuvo");
    a.addquestion("What is the el/ella form of the word mirar in preterite tense", "miro");
    a.addquestion("What is the ellos/ellas form of the word beber in preterite tense", "bebieron");
    a.addquestion("What is the nosotros form of the word ser in preterite tense", "fuimos");
    a.addquestion("What is the el/ella form of the word ser in imperfect tense", "era");
    a.addquestion("What is the tu form of the word ir in imperfect tense", "ibas");
    a.addquestion("What is the tu form of the word ver in imperfect tense", "veias");
    a.addquestion("What is the yo form of the word ver in preterite tense", "vi");
    
    for (int i = 0; i<a.questionbank().size(); i++ ) {
        System.out.println(a.toString(i));
    }
    a.playgame();
    a.modifyquestion(4, "How do you say endangered species in Spanish", "el especies de peligro");
    for (int i = 0; i<a.questionbank().size(); i++ ) {
          System.out.println(a.toString(i));
    }
    a.removequestion(0);
    a.removequestion (3);
    for (int i = 0; i<a.questionbank().size(); i++ ) {
        System.out.println(a.toString(i));
    }
    a.playgame();
    System.out.println(a.getHighScore()); 
 }
}
