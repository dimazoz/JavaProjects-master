package prak26;

public class Test {
    public static void main(String[] args) {
        Money eur = new EUR();
        Money kpw = new KPW();
        Money usd = new USD();

        eur.convers(3000);
        kpw.convers(3000);
        usd.convers(3000);

    }
}
