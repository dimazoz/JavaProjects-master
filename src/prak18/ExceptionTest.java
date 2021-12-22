package prak18;

public class ExceptionTest {
    static Client cl;
    static void testAccountNumb(int n) {
        try{
            cl.accountNumb = n;
            if(n < 0) throw new RuntimeException("Ошибка баланса");
        }finally {
            System.out.println("Произошла ошибка баланса! Он меньше 0!");
        }
    }

    static void doubleEx () {
        try {
            int numb = 0;
            int k = 5/numb;
        } catch (ArithmeticException e) {
            System.out.println("ОШИБКА!!!\nДеление на нуль: " + e);
        }
        System.out.println("\nВсе ошибки обработаны!");
    }

    public static void main(String[] args) {
        /*try {
            takeMoney(15);
        } catch (Exception e) {
            cl.balance = 0;
            System.out.println("Исключение перехвачено: теперь баланс 0");
            System.out.println();
        }*/
        doubleEx();
    }
}
