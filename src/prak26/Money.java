package prak26;

public class Money {
    public void whatWeDo(){
        System.out.println("Конвертация валют");
    }

    ConvertibleStrategy convStrategy;
    public void convers(double a){
        convStrategy.convers(a);
    }
}
