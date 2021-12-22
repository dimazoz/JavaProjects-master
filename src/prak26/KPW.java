package prak26;

public class KPW extends Money{
    public KPW(){
        this.convStrategy = new KPWConvert();
    }
}
