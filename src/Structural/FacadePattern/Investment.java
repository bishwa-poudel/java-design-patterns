package Structural.FacadePattern;

import java.math.BigDecimal;

/**
 * @author Bishwa on 15/10/2020
 */
public class Investment implements IAccount {

    private BigDecimal initAmount;

    public Investment(BigDecimal initAmount) {
        this.initAmount = initAmount;
    }

    @Override
    public void deposit(BigDecimal amount) {

    }

    @Override
    public void withdraw(BigDecimal amount) {

    }

    @Override
    public void transfer(IAccount account, BigDecimal amount) {

    }

    @Override
    public int getAccountNumber() {
        return 0;
    }
}
