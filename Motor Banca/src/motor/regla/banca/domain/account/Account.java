package motor.regla.banca.domain.account;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int numberAccount;
    private int balance;
    private String accountType;

    private static List<Account> accountList= new ArrayList<>();

    public Account(int numberAccount, int balance, String accountType) {
        this.numberAccount = numberAccount;
        this.balance = balance;
        this.accountType = accountType;
    }

    public static void addAccount(int number, int balance, String type){
        Account account = new Account(number, balance, type);
        accountList.add(account);
        System.out.println("Add account: "+account);
    }

    @Override
    public String toString(){
        return "\nnumber: " +numberAccount+
                "\nbalance: " +balance+
                "\ntype: " +accountType;
    }
}
