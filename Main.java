public class Main {
    public static void main(String[] args) {
    StudyGuide a = new StudyGuide (); 
    a.addquestion("What is the yo form of poder in future tense?", "podre","Future tense");
    a.addquestion("What is the tu form of salir in future tense?", "saldras","Future tense" );
    a.addquestion("What is the nosotros form of querer in future tense?", "querremos","Future tense");
    a.addquestion("What is the el/ella form of comer in future tense?", "comeran","Future tense");
    a.addquestion("What is the ellos/ellas form of escribir in future tense?", "escribira","Future tense");
    a.addquestion("What is the ellos/ellas form of beber in conditional form?", "beberian", "Conditional");
    a.addquestion("What is the el/ella form of hablar in conditional form?", "hablaria","Conditional");
    a.addquestion("What is the nosotros form of tener in conditional form?", "tendriamos","Conditional");
    a.addquestion("What is the yo form of vivir in conditional form?", "viviria","Conditional");
    a.addquestion("What is the tu form of aprender in conditional form?", "aprenderias","Conditional");
    a.addquestion("What is the yo form of salir in conditional form?", "saldria","Conditional");
    a.addquestion("What is the tu form of the word escribir in imperfect tense", "escribias", "Imperfect");
    a.addquestion("What is the yo form of the word ir in preterite tense", "fui", "Preterite");
    a.addquestion("What is the yo form of the word sacar in preterite tense", "saque","Preterite");
    a.addquestion("What is the el/ella form of the word estar in preterite tense", "estuvo","Preterite");
    a.addquestion("What is the el/ella form of the word mirar in preterite tense", "miro","Preterite");
    a.addquestion("What is the ellos/ellas form of the word beber in preterite tense", "bebieron","Preterite");
    a.addquestion("What is the nosotros form of the word ser in preterite tense", "fuimos","Preterite");
    a.addquestion("What is the el/ella form of the word ser in imperfect tense", "era","Imperfect");
    a.addquestion("What is the tu form of the word ir in imperfect tense", "ibas","Imperfect");
    a.addquestion("What is the tu form of the word ver in imperfect tense", "veias","Imperfect");
    a.addquestion("What is the yo form of the word ver in preterite tense", "vi","Preterite");
    
    a.playgame();

    a.modifyquestion(6, "What is the tu form for comer in preterite tense ", "comio", "Preterite");
    a.removequestion(0);
    a.removequestion (3);
    for (int i = 0; i<a.questionbank().size(); i++ ) {
          System.out.println(a.toString(i));
    }
    a.seequestion(3);
    for (int i = 0; i<a.questionbank().size(); i++ ) {
        System.out.println(a.toString(i));
    }
    
    a.playgame();

    System.out.println(a.getHighScore()); 
    a.removetopic("Conditional");
    for (int i = 0; i<a.questionbank().size(); i++ ) {
        System.out.println(a.toString(i));
    }
 }
}
