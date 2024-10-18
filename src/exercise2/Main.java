package exercise2;

import exercise2.exceptions.NoRetrieve;

public class Main {
    /* Exercise 2. Using the Bank solution of TAP1, the goal is that Bank implements Iterable.
       Use the Java "for" iterator to traverse the Accounts in a Bank. */
    public static void main( String[] args ) {
        Bank bank = new Bank();

        // Clientes
        Customer c1 = new Customer ( 1,"Zuis","Calle","660" );
        Customer c2 = new Customer ( 2,"Uary","Banco","660" );
        Customer c3 = new Customer ( 3,"Aepe","Cajero","660" );

        // Añadir Clientes
        bank.addCustomer( c1 );
        bank.addCustomer( c2 );
        bank.addCustomer( c3 );

        // Añadir Cuentas
        bank.addAccount( new SaveAccount( c1, 10 ) );
        bank.addAccount( new InvestFund ( c2, 100) );
        bank.addAccount( new CheckingAccount( c3, 100) );

        /* Mostrar cuentas */
        for ( Account account: bank ) {
            System.out.println( account.toString() );
        }
    }
}