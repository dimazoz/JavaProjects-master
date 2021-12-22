package prak28;

public class Client {
    public String name;
    public int accountNumb = 0;
    public float balance = 10;

    Client(){}
    Client(String name, int accountNumb, float balance){
        this.name = name;
        this.accountNumb = accountNumb;
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAccountNumb(int accountNumb) {
        this.accountNumb = accountNumb;
    }
    public int getAccountNumb() {
        return accountNumb;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public float getBalance() {
        return balance;
    }
    public void addMoney(int adding)
    {
        balance += adding;
    }
    public void takeMoney(int taking)
    {
        balance -= taking;
    }

    static class SpecialBalance{
        public float credOrDep;

        public SpecialBalance(int credOrDep){
            this.credOrDep = credOrDep;
        }

        public float getCredOrDep() {
            return credOrDep;
        }
        public void setCredOrDep(float credOrDep) {
            this.credOrDep = credOrDep;
        }
    }

    public static void main(String[] args) {
        Client.SpecialBalance bal = new Client.SpecialBalance(25);
        System.out.println(bal.getCredOrDep());
    }
}
