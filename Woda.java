package pakiet;

public class Woda extends Napoje{

    String marka;
    boolean gazowana;

    public Woda(String nazwa) {
        super(nazwa);
    }

    @Override
    public void pij() {
        System.out.println("Woda");
    }

    public void woda(){
        System.out.println("metoda woda");
    }
}
