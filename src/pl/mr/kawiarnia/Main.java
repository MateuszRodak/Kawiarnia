package pl.mr.kawiarnia;


public class Main {


    public static void main(String[] args) {

        boolean mleko = args[0].equals("1");
        boolean cukier = args[1].equals("1");
        Kawa.rozmiar rozmiar = null;

        switch (args[2]) {
            case "1":
            rozmiar= Kawa.rozmiar.SMALL;
            break;
            case "2":
            rozmiar= Kawa.rozmiar.MEDIUM;
            break;
            case "3":
            rozmiar= Kawa.rozmiar.BIG;
            break;
            case "4":
            rozmiar= Kawa.rozmiar.XXL;
            break;
            case "5":
            rozmiar= Kawa.rozmiar.WIADRO;
            break;
            default:
            rozmiar= Kawa.rozmiar.SMALL;
            break;
        }

        Klient klient = new Klient(15);
        klient.zamowienie(mleko,cukier,rozmiar);

    }

}
