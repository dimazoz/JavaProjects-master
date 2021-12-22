package prak26;

public class USDConvert implements ConvertibleStrategy{
    public void convers(double a){
        double val = 0.01323;
        val = val*a;
        System.out.println("Перевод " + a + " рублей в доллары: " + val);
    }
}
