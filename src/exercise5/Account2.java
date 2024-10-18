package exercise5;

import exercise2.Customer;

public abstract class Account2 {
    /* ATRIBUTOS */
    private String id;
    private String owner;
    private AccountType type; // Suponiendo que Type es un enum o una clase definida en otra parte
    private double balance;

    // Constructor
    public Account2(String id, String owner, AccountType type, double balance) {
        this.id = id;
        this.owner = owner;
        this.type = type;
        this.balance = balance;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public AccountType getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account2 clone () {
        return switch ( this.type ) {
            case IF -> new InvestFund2(this.id, this.owner, this.type, this.balance);
            case CA -> new CheckingAccount2(this.id, this.owner, this.type, this.balance);
            case BA -> new BonusAccount2(this.id, this.owner, this.type, this.balance);
            case SA -> new SaveAccount2(this.id, this.owner, this.type, this.balance);
        };
    }

    public String toString() {
        return  "id:'" + id + '\'' +
                ", owner='" + owner + '\'' +
                ", type=" + type +
                ", balance=" + balance;
    }
}

