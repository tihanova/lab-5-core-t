package score;

import account.Account;
import money.Money;

public class CreditScore extends Score {
    public CreditScore(Money balance, Account owner, Integer
            number) {
        super(balance, owner, number);
    }
}
