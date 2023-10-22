public class RussianAdapter implements Translator {
    /*Adapter*/
    private RussianService russService;

    public RussianAdapter(RussianService service) {
        this.russService = service;
    }

    public String translate(String text) {
        return russService.translateToRussian(text);
    }
}