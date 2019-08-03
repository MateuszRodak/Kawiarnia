package pl.mr.kawiarnia;

public class Klient {

    private int numerStolika;

    public Klient(int numerStolika) {
        this.numerStolika = numerStolika;
    }

    public void zamowienie(boolean mleko, boolean cukier, Kawa.rozmiar rozmiar) {
        Kawa kawa = new Kawa(mleko, cukier, rozmiar);
        Kelner kelner = new Kelner();
        kelner.przyjmijZamowienie(kawa,numerStolika);
    }

}
