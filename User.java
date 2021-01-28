package bank;

import java.util.ArrayList;

public class User {
    private String name;
    private String surname;
    private int year;
    private int month;
    private int day;
    public ArrayList<Card> cards = new ArrayList<>();
    private ArrayList<Account> accounts = new ArrayList<>();

    public User(String name, String surname, int year, int month, int day) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    private User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void showCards(){
        for (Card card : cards) {
            System.out.println(card.getNumber());
        }
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }
}




