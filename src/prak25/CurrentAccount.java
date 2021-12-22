package prak25;

public class CurrentAccount implements BankAccount {
    private String service;
    private double account;

    public CurrentAccount(String service, double account) {
        this.service = service;
        this.account = account;
    }

    @Override
    public double getAccount() {
        return account;
    }

    @Override
    public String getService() {
        return service;
    }
}
