package prak17;
import java.util.Scanner;

enum BankProducts {
    Currency(1), Credit(2), Deposit(3), Promissory(4), DocumentsAndReceipts(5), PlasticCards(6);
    private int numb;
    BankProducts(int numb) {
        this.numb = numb;
    }
    int getNumb() {
        return numb;
    }
}

public class EnumTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankProducts prod1 = BankProducts.Currency;
        BankProducts prod2 = BankProducts.PlasticCards;
        BankProducts prod3;
        System.out.println("Выберите вид банковского продукта");
        System.out.println("1 - Валютные операции");
        System.out.println("2 - Потребительский кредит");
        System.out.println("3 - Сберегательные депозиты");
        System.out.println("4 - Коммерческие векселя");
        System.out.println("5 - Документы и расписки");
        System.out.println("6 - Пластиковые карты");
        int n = scanner.nextInt();
        prod3 = switch (n) {
            case 1 -> BankProducts.Currency;
            case 2 -> BankProducts.Credit;
            case 3 -> BankProducts.Deposit;
            case 4 -> BankProducts.Promissory;
            case 5 -> BankProducts.DocumentsAndReceipts;
            case 6 -> BankProducts.PlasticCards;
            default -> null;
        };
        System.out.println("Ваши продукты:\n" +
                "1 - " + prod1.name() +
                "\n2 - " + prod2.name());
        if (prod3 != null)
            System.out.println("3 - " + prod3.name());

        System.out.println("\nВсе банковские продукты:");
        for (BankProducts b : BankProducts.values()){
            System.out.println(b.getNumb() + " - " + b);
        }
        System.out.println("Все константы и порядковые значения:");
        System.out.println("\nПрименение метода compareTo():");
        if (prod1.compareTo(prod2) < 0) System.out.println(prod1 + " предшествует " + prod2);
        if (prod1.compareTo(prod2) > 0) System.out.println(prod2 + " предшествует " + prod1);
        if (prod1.compareTo(prod3) == 0) System.out.println(prod1 + " равно " + prod3);

        System.out.println("\nПрименение метода equals():");
        if (prod1.equals(prod2)) System.out.println("Ошибка!");
        if (prod1.equals(prod3)) System.out.println(prod1 + " равно " + prod3);

        System.out.println("\nСравнить на равенство:");
        if (prod1 == prod3) System.out.println(prod1 + " == " + prod3);
    }
}