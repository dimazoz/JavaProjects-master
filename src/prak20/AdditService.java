package prak20;

public enum AdditService {
    Commission(1), Insurance(2), MobileBank(3), SMSAlerts(4);
    private int numb;
    AdditService(int numb) {
        this.numb = numb;
    }
    int getNumb() {
        return numb;
    }
}
