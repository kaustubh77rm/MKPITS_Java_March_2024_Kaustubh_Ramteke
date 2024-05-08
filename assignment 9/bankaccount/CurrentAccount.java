package bankaccount;

public abstract class CurrentAccount extends BankAccount
{
    @Override
    public int deposit() { return deposit(); }

    @Override
    public int withdrawal() {
        return withdrawal();
    }

    @Override
    public int balanceInquiry() {
        return balanceInquiry();
    }
}