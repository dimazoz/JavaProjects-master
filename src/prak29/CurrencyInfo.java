package prak29;
import java.io.Serializable;
import java.util.Arrays;

public class CurrencyInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String[] clientsInfo;
    private String[] employeeInfo;
    private String[] bankServicesInfo;

    public CurrencyInfo(String[] clientsInfo, String[] employeeInfo, String[] bankServicesInfo){
        this.clientsInfo = clientsInfo;
        this.employeeInfo = employeeInfo;
        this.bankServicesInfo = bankServicesInfo;
    }

    public String[] getClientsInfo() {
        return clientsInfo;
    }

    public void setClientsInfo(String[] clientsInfo) {
        this.clientsInfo = clientsInfo;
    }

    public String[] getEmployeeInfo() {
        return employeeInfo;
    }

    public void setEmployeeInfo(String[] employeeInfo) {
        this.employeeInfo = employeeInfo;
    }

    public String[] getBankServicesInfo() {
        return bankServicesInfo;
    }

    public void setBankServicesInfoInfo(String[] bankServicesInfo) {
        this.bankServicesInfo = bankServicesInfo;
    }

    @Override
    public String toString() {
        return "CurrencyInfo{" +
                "clientsInfo=" + Arrays.toString(clientsInfo) +
                ",\n employeeInfo=" + Arrays.toString(employeeInfo) +
                ",\n bankServicesInfo=" + Arrays.toString(bankServicesInfo) +
                '}';
    }
}
