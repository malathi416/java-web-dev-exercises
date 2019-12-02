package examples.Speech;

public class Greeting extends Message {
//    String language;
//    String text;
    boolean friendly;
    public Greeting(String aLanguage, String aText, boolean isFriendly) {
        super(aLanguage, aText);
        friendly = isFriendly;
    }
    public Greeting(String aLanguage, String aText) {
        super(aLanguage, aText);
    }

}
