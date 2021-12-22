package prak32;

import java.util.Date;

public class BankService {
    public int accountNumb;
    public BankProducts productType;
    public AdditService additService;
    public Date openingDate;
    public Date closingDate;

    BankService(int acNumb, BankProducts bp, AdditService adSer) {
        accountNumb = acNumb;
        productType = bp;
        additService = adSer;
    }
    BankService(int acNumb, BankProducts bp, AdditService adSer, Date opDate, Date clDate){
        accountNumb = acNumb;
        productType = bp;
        additService = adSer;
        openingDate = opDate;
        closingDate = clDate;
    }
    public int getAccountNumb() {
        return accountNumb;
    }
    public void setAccountNumb(int accountNumb) {
        this.accountNumb = accountNumb;
    }
    public BankProducts getProductType() {
        return productType;
    }
    public void setProductType(BankProducts productType) {
        this.productType = productType;
    }
    public AdditService getAdditService() {
        return additService;
    }
    public void setAdditService(AdditService additService) {
        this.additService = additService;
    }
    public Date getOpeningDate() {
        return openingDate;
    }
    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }
    public Date getClosingDate() {
        return closingDate;
    }
    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }
}

