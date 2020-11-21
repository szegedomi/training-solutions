package algorithmssum;

public class Transaction {

    private String accountNumber;
    private TransactionOperation to;
    private int amount;

    public Transaction(String accountNumber, TransactionOperation to, int amount) {
        this.accountNumber = accountNumber;
        this.to = to;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public TransactionOperation getTo() {
        return to;
    }

    public void setTo(TransactionOperation to) {
        this.to = to;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
