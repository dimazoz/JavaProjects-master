package prak20;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDate {
    public static String dateOp(Date date){
        DateFormat dtForm = new SimpleDateFormat("dd.MM.yyyy");
        return dtForm.format(date);
    }
    public static void main(String[] args){
        BankProducts bp = BankProducts.Credit;
        AdditService aServ = AdditService.Insurance;
        BankService bServ = new BankService(123, bp, aServ);
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();
        bServ.setOpeningDate(date);
        System.out.println(date);
        System.out.println("Дата открытия " + bServ.productType+" владельца счёта "+bServ.accountNumb+": "+bServ.openingDate);
    }
}
