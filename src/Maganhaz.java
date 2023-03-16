public class Maganhaz extends Epulet{
    protected int teleknagysag;

    public Maganhaz() {
    }

    public Maganhaz(String cim, int alapterulet, int szobaszam, int teleknagysag) {
        super(cim, alapterulet, szobaszam);
        this.teleknagysag = teleknagysag;
    }

    @Override
    public double getIngatlanAdo() {
        return (2 * teleknagysag)+(200*alapterulet);
    }

    @Override
    public double getSzamitottAlapterulet() {
        return this.alapterulet;
    }

    @Override
    public String toString() {
        return "Az ingatlan címe: "+cim +", alapterulete: "+ alapterulet+" négyzetméter, szobák száma: "+szobaszam+ ", a telek "+teleknagysag+" négyzetméter";

    }

    public int getTeleknagysag() {
        return teleknagysag;
    }

    public void setTeleknagysag(int teleknagysag) {
        this.teleknagysag = teleknagysag;
    }
}
