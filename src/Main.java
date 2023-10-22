public class Main {
    public static void main(String[] args) {
        /*Client*/
        EnglishService EService = new EnglishTranslator();
        RussianService RService = new RussianTranslator();

        EnglishAdapter EAdapter = new EnglishAdapter(EService);
        RussianAdapter RAdapter = new RussianAdapter(RService);

        String text = "Hello, World!";
        String translatedText;

        translatedText = EAdapter.translate(text);
        System.out.println("English Translation: " + translatedText);

        translatedText = RAdapter.translate(text);
        System.out.println("Russian Translation: " + translatedText);
    }
}