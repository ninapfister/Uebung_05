package at.ac.fh_kufstein.uebung_05.Classes;

public class Fahrzeug
{
    private short reifen;
    private String farbe;
    private short ps;
    private short tueren;
    private boolean gestartet;
    private short geschwindigkeit;

    public short getReifen()
    {
        return reifen;
    }

    public void setReifen(short reifen)
    {
        this.reifen = reifen;
    }

    public String getFarbe()
    {
        return farbe;
    }

    public void setFarbe(String farbe)
    {
        this.farbe = farbe;
    }

    public short getPs()
    {
        return ps;
    }

    public void setPs(short ps)
    {
        this.ps = ps;
    }

    public short getTueren()
    {
        return tueren;
    }

    public void setTueren(short tueren)
    {
        this.tueren = tueren;
    }

    public boolean isGestartet()
    {
        return gestartet;
    }

    public void setGestartet(boolean gestartet)
    {
        this.gestartet = gestartet;
    }

    public short getGeschwindigkeit()
    {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(short geschwindigkeit)
    {
        this.geschwindigkeit = geschwindigkeit;
    }

    public static int getAnzahl()
    {
        return anzahl;
    }

    public static void setAnzahl(int anzahl)
    {
        Fahrzeug.anzahl = anzahl;
    }

    public static int anzahl;

    void starten()
    {
        gestartet = true;
    }
    void stoppen()
    {
        gestartet = false;
    }
    void beschleunigen(short geschwindigkeit)
    {
        if (gestartet==true)
        {
            if ((this.geschwindigkeit + geschwindigkeit) <= 250)
            {
                this.geschwindigkeit = (short) (this.geschwindigkeit + geschwindigkeit);
            }
        }
    }
    void bremsen (short geschwindigkeit)
    {
        if (gestartet==true)
        {
            if ((this.geschwindigkeit - geschwindigkeit) >=0)
            {
                this.geschwindigkeit = (short) (this.geschwindigkeit - geschwindigkeit);
            }
        }
    }
}
