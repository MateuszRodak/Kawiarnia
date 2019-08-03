package pl.mr.kawiarnia;

public class Kawa {

    enum rozmiar {SMALL, MEDIUM, BIG, XXL, WIADRO}


    private boolean mleko;
    private boolean cukier;
    private rozmiar size;


    public Kawa(boolean mleko, boolean cukier, rozmiar size) {
        this.mleko = mleko;
        this.cukier = cukier;
        this.size = size;
    }

    public void zaparz()
    {
        System.out.print("Zaparzono kawe: ");

        switch (size)
        {
            case SMALL:
                System.out.print(" mala");
                break;
            case MEDIUM:
                System.out.print(" srednia");
                break;
            case BIG:
                System.out.print(" duza");
                break;
            case XXL:
                System.out.print(" b.duza");
                break;
            case WIADRO:
                System.out.print(" wiadro");
                break;
        }

        if(mleko)
        {
            System.out.print(" z mlekiem");
        }
        if(cukier)
        {
            System.out.print(" slodzona");
        }
    };

    public boolean isMleko() {
        return mleko;
    }

    public boolean isCukier() {
        return cukier;
    }

    public rozmiar getSize() {
        return size;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kawa{");
        sb.append("mleko=").append(mleko);
        sb.append(", cukier=").append(cukier);
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}
