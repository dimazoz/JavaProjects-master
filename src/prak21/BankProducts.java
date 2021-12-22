package prak21;

public enum BankProducts {
    Currency(1), Credit(2), Deposit(3), Promissory(4), DocumentsAndReceipts(5), PlasticCards(6);
    private int numb;
    BankProducts(int numb) {
        this.numb = numb;
    }
    int getNumb() {
        return numb;
    }
}

