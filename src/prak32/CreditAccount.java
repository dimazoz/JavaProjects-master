package prak32;

public class CreditAccount extends SpecialAccount {
    public CreditAccount(BankAccount bankAcc){
        super(bankAcc, "Кредитный счёт", 8);
    }
}
