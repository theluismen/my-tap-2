package exercise5;

import exercise2.exceptions.NoRetrieve;

public class InvestFund2 extends Account2 {
    /* ATRIBUTOS */

    /* MÉTODOS */
    // Constructor
    public InvestFund2(String id, String owner, AccountType type, double balance) {
        super(id,owner,type,balance);
    }
    // Métodos Varios

    public void withdrawMoney( int m ) throws NoRetrieve {
        throw new NoRetrieve("No Withdrawal from IF allowed !");
    }
}