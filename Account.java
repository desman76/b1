package b1;

public class Account {
    private long number;
    private String currency;
    private User user;

    public Account(long number, String currency, User user) {
        this.number = number;
        this.currency = currency;
        this.user = user;
        this.user.addAccount(this);
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public User getUser() {
        return user;
    }
}
