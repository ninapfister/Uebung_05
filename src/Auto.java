import at.ac.fh_kufstein.uebung_05.Classes.Fahrzeug;

public class Auto extends Fahrzeug
{
    private boolean klimaanlage;
    private short airbag;

    void klimaanlageAn()
    {
        if (klimaanlage==false)
        {
            this.klimaanlage = true;
        }
        else
        {
            System.out.println("Die Klimaanlage läuft bereits!");
        }
    }

    void klimaanlageAus() {
        if (klimaanlage == true) {
            this.klimaanlage = false;
        } else {
            System.out.println("Die Klimaanlage ist bereits aus!");
        }
    }
        public boolean isKlimaanlage()
        {
            return klimaanlage;
        }

        public void setKlimaanlage(boolean klimaanlage)
        {
            this.klimaanlage = klimaanlage;
        }

        public short getAirbag()
        {
            return airbag;
        }

        public void setAirbag(short airbag)
        {
            this.airbag = airbag;
        }
    }
