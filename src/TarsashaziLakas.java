public class TarsashaziLakas extends Epulet {
    protected int erkelyMeret;
    protected int szomszedokSzama;

    public TarsashaziLakas() {
    }

    public TarsashaziLakas(String cim, int alapterulet, int szobaszam, int erkelyMeret, int szomszedokSzama) {
        super(cim, alapterulet, szobaszam);
        this.erkelyMeret = erkelyMeret;
        this.szomszedokSzama = szomszedokSzama;
    }

    @Override
    public double getIngatlanAdo() {
        return (300 * alapterulet);
    }

    @Override
    public double getSzamitottAlapterulet() {
        return (alapterulet+((double)erkelyMeret/2));
    }

    @Override
    public String toString() {
        return "Az ingatlan címe: "+cim +", alapterulete: "+ alapterulet+" négyzetméter, szobák száma: "+szobaszam+ " az erkély: "+erkelyMeret+" négyzetméter, szomszédok száma: "+szomszedokSzama;
    }

    public int getErkelyMeret() {
        return erkelyMeret;
    }

    public void setErkelyMeret(int erkelyMeret) {
        this.erkelyMeret = erkelyMeret;
    }

    public int getSzomszedokSzama() {
        return szomszedokSzama;
    }

    public void setSzomszedokSzama(int szomszedokSzama) {
        this.szomszedokSzama = szomszedokSzama;
    }
}
