package Structural.FacadePattern;

import java.math.BigDecimal;

/**
 * @author Bishwa on 15/10/2020
 */
public class Customer {
    public static void main(String[] args) {
        BankService bankService = new BankService();

        int mySaving = bankService.createNewAccount("saving", new BigDecimal(500));
        int myInvestment = bankService.createNewAccount("investment", new BigDecimal(500));

        bankService.transferMoney(mySaving, myInvestment, new BigDecimal(300));
    }
}
