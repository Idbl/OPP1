package pakiet;

public class Oranżada extends Napoje {

    public Oranżada(String nazwa) {
        super(nazwa);
    }

    @Override
    public void pij() {
        System.out.println("Oranzada");
    }
}
