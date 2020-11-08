package Structural.FacadePattern;

import java.math.BigDecimal;

/**
 * @author Bishwa on 15/10/2020
 */
public interface IAccount {
    public void deposit(BigDecimal amount);
    public void withdraw(BigDecimal amount);
    public void transfer(IAccount account, BigDecimal amount);

    public int getAccountNumber();
}
