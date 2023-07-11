package score;

import account.Account;
import money.Money;

public class DebetScore extends Score {
    private CreditScore creditScore;

    public DebetScore(Money balance, Account owner, Integer
            number, CreditScore creditScore) {
        super(balance, owner, number);
        this.creditScore = creditScore;
    }
}