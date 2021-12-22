package prak25;

public class SpecialAccount implements BankAccount{
    private BankAccount bankAcc;
    private String service;
    private int proc;

    public SpecialAccount(BankAccount bankAcc, String service, int proc) {
        this.bankAcc = bankAcc;
        this.service = service;
        this.proc = proc;
    }

    @Override
    public double getAccount() {
        return bankAcc.getAccount() + (bankAcc.getAccount() * proc)/100;
    }

    @Override
    public String getService() {
        return this.service + bankAcc.getService();
    }
}
