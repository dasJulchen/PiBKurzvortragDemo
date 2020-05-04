package demo;

public class ReparaturFassade {
    private static ReparaturFassade instance;
    private RadAusbauer radAusbauer;
    private Mantelwechsler mantelwechsler;
    private RadEinbauer radEinbauer;

    /**
     * privater Konstrukter
     */
    private ReparaturFassade(){
        radAusbauer = new RadAusbauer();
        radEinbauer = new RadEinbauer();
        mantelwechsler = new Mantelwechsler();
    }

    /**
     * Klassenmethode, die einziges Objekt von ReparaturFassade zurückgibt und gegebenenfalls vorher neu erzeugt
     * @return ReparaturFassade
     */
    public static ReparaturFassade getInstance(){
        if(instance == null){
            instance = new ReparaturFassade();
        }
        return instance;
    }

    /**
     * delegiert den Mantelwechsel an die drei Klassen, die Teilaufgaben erfüllen
     */
    public void wechselMantel(){
        radAusbauer.baueRadAus();
        mantelwechsler.wechselMantel();
        radEinbauer.baueRadEin();
    }
}
