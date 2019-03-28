package lesson13.practika;

public abstract class AbstractCountry implements Country{

    private  int naselenie;
    private  int coutKurort;
    private  int ploshad;
    private String stolica;
    private boolean viza;



    public int getNaselenie() {
        return naselenie;
    }

    public void setNaselenie(int naselenie) {
        this.naselenie = naselenie;
    }

    public int getCoutKurort() {
        return coutKurort;
    }

    public void setCoutKurort(int coutKurort) {
        this.coutKurort = coutKurort;
    }

    public int getPloshad() {
        return ploshad;
    }

    public void setPloshad(int ploshad) {
        this.ploshad = ploshad;
    }

    public void setStolica(String stolica) {
        this.stolica = stolica;
    }

    public boolean isViza() {
        return viza;
    }

    public void setViza(boolean viza) {
        this.viza = viza;
    }

    @Override
    public void printNaselenie() {
        System.out.println(naselenie);


    }

    @Override
    public void printCountKurort() {
        System.out.println(coutKurort);
    }

    @Override
    public void printPloshad() {
        System.out.println(ploshad);

    }

    @Override
    public String getStolica() {
        return stolica;
    }

    @Override
    public boolean needViza() {
        return viza;
    }


}
