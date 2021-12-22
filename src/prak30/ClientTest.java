package prak30;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void getAllClients() {
        Client client = new Client("Маша", 456738);
        Client client1 = new Client("Павел", 3486734);
        Client client2 = new Client("Люсия", 45980);

        ArrayList<Client> expected = Client.getAllClients();

        ArrayList<Client> actual = new ArrayList<>();
        actual.add(client);
        actual.add(client1);
        actual.add(client2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHowManyClients() {
        Client client = new Client("Маша", 456738);
        Client client1 = new Client("Павел", 3486734);
        Client client2 = new Client("Люсия", 45980);

        int expected = Client.getHowManyClients();

        int actual = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllBalanceClients() {
        Client client = new Client("Маша", 456738);
        Client client1 = new Client("Павел", 3486734);
        Client client2 = new Client("Люсия", 45980);

        int expected = Client.getAllBalanceClients();

        int actual = 456738+3486734+45980;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageBalanceOfAllClients() {
        Client client = new Client("Маша", 456738);
        Client client1 = new Client("Павел", 3486734);
        Client client2 = new Client("Люсия", 45980);

        int expected = Client.getAverageBalanceOfAllClients();

        int actual = (456738+3486734+45980)/3;

        Assert.assertEquals(expected, actual);
    }
}