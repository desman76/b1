package b1;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Paul","Forstner", 1991,5,21);
        Account user1Account = new Account(1234541265, "RUR", user1);
        Card user1Card1 = new Card(1232145654, 7777, 111, 2022, 5);
        Card user1Card2 = new Card(1986548789, 7777, 222, 2022, 4);
        user1.addCard(user1Card1);
        user1.addCard(user1Card2);
        user1.showCards();
    }
}
