package score;

import account.Account;
import money.Money;

public class CurrentScore extends Score {
    private DebetScore debetScore;

    public CurrentScore(Money balance, Account owner, Integer
            number, DebetScore debetScore) {
        super(balance, owner, number);
        this.debetScore = debetScore;
    }
}