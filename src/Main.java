public class Main {
    public static void main(String[] args) {
        Epulet[] epuletek = new Epulet[4];

        epuletek[0] = new Maganhaz("2132 Kukutyin, Diófa köz 2 ", 44, 1, 700);
        epuletek[1] = new Maganhaz("4587 Berőce, Október utca 42", 90, 3, 2000);
        epuletek[2] = new TarsashaziLakas("1222 Bp, Víg út 82", 50, 2, 12, 2);
        epuletek[3] = new TarsashaziLakas("3400 Miskolc, Avas utca 63", 65, 3, 6, 5);

        for (Epulet ep : epuletek) {
            System.out.println(ep);
        }
    }
}