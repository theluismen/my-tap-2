package exercise5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by pedro on 9/21/15.
 */
public class Tokens {
    public static List<Account2> readAccounts(String fileName) throws IOException {
        //public static void main(String[] args ) throws IOException {

        FileReader fis = new FileReader(fileName);
        BufferedReader dis = new BufferedReader(fis);
        String line;
        List<Account2> accounts = new ArrayList<>();
        String id, owner;
        AccountType type;
        double balance;

        while ((line = dis.readLine()) != null) {
            StringTokenizer tokens = new StringTokenizer(line, ",");
            id = tokens.nextToken();
            owner = tokens.nextToken();
            type = AccountType.valueOf(tokens.nextToken());
            balance = Double.valueOf(tokens.nextToken());

            switch ( type ) {
                case IF:
                    accounts.add( new InvestFund2( id, owner, type, balance ));
                    break;
                case CA:
                    accounts.add( new CheckingAccount2( id, owner, type, balance ));
                    break;
                case BA:
                    accounts.add( new BonusAccount2( id, owner, type, balance ));
                    break;
                case SA:
                    accounts.add( new SaveAccount2( id, owner, type, balance ));
                    break;
            }
        }

        dis.close();

        return accounts;
    }
}