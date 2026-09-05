class Transaction {

    String type;
    double amount;

    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    void process() {
        System.out.println(type + " payment processed: Rs " + amount);
    }
}

public class Main {

    public static void main(String[] args) {

        Transaction[] transactions = {
                new Transaction("Card", 100),
                new Transaction("Cash", 50),
                new Transaction("Card", 200),
                new Transaction("Cash", 75),
                new Transaction("Card", 120)
        };

        for (Transaction t : transactions) {
            t.process();
        }
    }
}