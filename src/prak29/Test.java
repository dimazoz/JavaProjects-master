package prak29;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String[] clientsInfo = {"Иванов И.И.", "Сидоров В.П.", "Абрамов П.С."};
        String[] employeeInfo = {"Семёнов К.В.", "Соколов А.В.", "Николаев С.Г."};
        String[] bankServicesInfo = {"Иванов И.И. взял кредит на 500000 рублей, Баланс Сидорова В.П. составляет 780000 рублей, Депозит Абрамова П.С. составяет 3000000 рублей"};

        CurrencyInfo currencyInfo = new CurrencyInfo(clientsInfo, employeeInfo, bankServicesInfo);

        //создаем 2 потока для сериализации объекта и сохранения его в файл
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\nil03\\IdeaProjects\\JavaProjects\\src\\prak29\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // сохраняем данные в файл
        objectOutputStream.writeObject(currencyInfo);

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\nil03\\IdeaProjects\\JavaProjects\\src\\prak29\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        CurrencyInfo currencyInfo1 = (CurrencyInfo) objectInputStream.readObject();

        System.out.println(currencyInfo1);
    }
}
