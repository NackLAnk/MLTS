public class EnglishAdapter implements Translator {
    /*Adapter*/
    private EnglishService engService;

    public EnglishAdapter(EnglishService service) {
        this.engService = service;
    }

    public String translate(String text) {
        return engService.translateToEnglish(text);
    }
}