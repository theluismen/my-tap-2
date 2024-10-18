package exercise5;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    /* Exercise 5: We will import information from the accounts.txt file in CSV format (Comma separated values). Use TAP1/other/Tokens.
       Import this information in a List of Accounts where the four parameters correspond to:
            id :String, owner:String, type:enum[IF,CA,BA,SA], balance:double
       Perform the following operations:
            Use stream.map to increment the balance of all accounts in 10 euros
            Use stream.filter to obtain all account of type IF
            Use stream.max to obtain the account with the highest balance
            Combine filter and max to obtain the IF account with higher balance
    */

    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        List<Account2> accounts = Tokens.readAccounts("accounts.txt");
        List<Account2> a1, a2, a3, a4;

        // Cuentas originales
        for (Account2 account : accounts) {
            System.out.println(account); // Llama a account.toString() para mostrar la info
        }

        // Use stream.map to increment the balance of all accounts in 10 euros
        System.out.println("--- Use stream.map to increment the balance of all accounts in 10 euros");
        accounts.stream().map( account -> {
            Account2 accountAux = account.clone();
            accountAux.setBalance( accountAux.getBalance() + 10);
            return accountAux;
        } )
            .toList()
            .forEach(System.out::println);

        // Use stream.filter to obtain all account of type IF
        System.out.println("--- Use stream.filter to obtain all account of type IF");
        accounts.stream()
            .filter(account -> account.getType() == AccountType.IF )
            .toList()
            .forEach(System.out::println);

        // Use stream.max to obtain the account with the highest balance
        System.out.println("--- Use stream.max to obtain the account with the highest balance");
        Optional<Account2> max = accounts.stream()
            .max( ( b1, b2 ) -> Double.compare(b1.getBalance(), b2.getBalance()) );
        System.out.println( max );

        // Combine filter and max to obtain the IF account with higher balance
        System.out.println("--- Combine filter and max to obtain the IF account with higher balance");
        Optional<Account2> maxIF = accounts.stream()
                .filter( account -> account.getType() == AccountType.IF)
                .max( ( b1, b2 ) -> Double.compare(b1.getBalance(), b2.getBalance()) );
        System.out.println( maxIF );
    }
}
