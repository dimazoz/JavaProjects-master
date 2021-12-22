package prak21;
import java.util.ArrayList;

public class TestGeneric {
    static ArrayList<BankService> bankServices = new ArrayList<>();

    static public void printList(ArrayList<BankService> bs) {
        for(int i = 0; i < bs.size(); i++) {
            System.out.println(bs.get(i).accountNumb);
        }
    }
    public static void main(String[] args) {
        BankProducts bp = BankProducts.Deposit;
        AdditService as = AdditService.MobileBank;
        BankService bServ1 = new BankService(123, bp, as);
        bankServices.add(bServ1);
        BankService bServ2 = new BankService(678, bp, as);
        bankServices.add(bServ2);
        printList(bankServices);
    }
}
