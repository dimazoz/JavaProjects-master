package prak26;

public class USD extends Money{
    public USD(){
        this.convStrategy = new USDConvert();
    }
}
