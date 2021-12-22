package prak19;

public class ExceptionTest {

    static Client cl = new Client("Karl", 0, 3);
    static void testAccountNumb() throws Exception {
        cl.accountNumb -= 1;
        if (cl.accountNumb < 0)
            throw new Exception("Номер счёта - отрицательное число!");
        System.out.println(cl.accountNumb);

    }

    public static void main(String[] args) {
        try {
            testAccountNumb();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
