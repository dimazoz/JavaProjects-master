package prak25;

public class Test {
    public static void main(String[] args) {
        BankAccount acc1 = new CurrentAccount("Текущий счёт", 20000);
        BankAccount acc2 = new CurrentAccount("Дополнительные операции", 3000);
        BankAccount saving = new SavingsAccount(acc2);
        BankAccount cred = new CreditAccount(acc2);

        System.out.println("Текущий счёт:");
        System.out.println(acc1.getAccount());
        System.out.println("Депозитный счёт (изначально 3000)");
        System.out.println(saving.getAccount());
        System.out.println("Кредитный счёт (изначально 3000)");
        System.out.println(cred.getAccount());
    }
}
