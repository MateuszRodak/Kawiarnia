package pl.mr.kawiarnia;

public class Kelner {



    void przyjmijZamowienie(Kawa kawa, int numerStolika)
    {
        System.out.println("Kelner przyja zamowienie na kawe" + kawa.toString());
        kawa.zaparz();
        dostarcz(kawa, numerStolika);

    };

    void dostarcz(Kawa kawa, int numerStolika)
    {
        System.out.println("\ndostarczono:" + kawa.toString() + "do stolika:" + numerStolika);
    };

}
