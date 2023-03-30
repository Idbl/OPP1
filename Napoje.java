package pakiet;

public abstract class Napoje {
    private String nazwa;

    public Napoje(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public abstract void pij();

    public String toString(){
        return nazwa + " : " +  getClass().getName();
    }

}
