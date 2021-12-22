package prak28;

public class Money {
    double val = 0.011771;
    public void whatWeDo(float a){
        val = val*a;
        System.out.println("Перевод " + a + " рублей в евро: " + val);
    }

    public static void main(String[] args) {
        Money m1 = new Money();
        Money m2 = new Money().new USD();
        m1.whatWeDo(30);
        m2.whatWeDo(30);
    }

    private class USD extends Money {
        @Override
        public void whatWeDo(float a) {
            double val = 0.01323;
            val = val*a;
            System.out.println("Перевод " + a + " рублей в доллары: " + val);
        }
    }
}