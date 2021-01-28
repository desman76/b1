package bank;

public class Card {
    private User user;
    private Account account;
    private long number;
    private int pin;
    private int cww;
    private int year;
    private int month;

    public Card(long number, int pin, int cww, int year, int month) {
        this.number = number;
        this.pin = pin;
        this.cww = cww;
        this.year = year;
        this.month = month;
    }

    private Card() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getNumber() {
        return number;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getCww() {
        return cww;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
