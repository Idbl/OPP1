package pakiet;

public class Sok extends Napoje{

    public Sok(String nazwa) {
        super(nazwa);
    }

    @Override
    public void pij() {
        System.out.println("Sok");
    }
}
