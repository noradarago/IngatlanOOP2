public abstract class Epulet {
    protected String cim;
    protected int alapterulet;
    protected int szobaszam;

    public Epulet() {
    }

    public Epulet(String cim, int alapterulet, int szobaszam) {
        this.cim = cim;
        this.alapterulet = alapterulet;
        this.szobaszam = szobaszam;
    }


    public abstract double getIngatlanAdo();
    public abstract double getSzamitottAlapterulet();

    @Override
    public String toString() {
        return "Az ingatlan címe: "+cim +", alapterulete: "+ alapterulet+" négyzetméter, szobák száma: "+szobaszam;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public int getAlapterulet() {
        return alapterulet;
    }

    public void setAlapterulet(int alapterulet) {
        this.alapterulet = alapterulet;
    }

    public int getSzobaszam() {
        return szobaszam;
    }

    public void setSzobaszam(int szobaszam) {
        this.szobaszam = szobaszam;
    }
}
