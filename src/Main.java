import kuchner.homework.finance.Bank;

public class Main {

    public static void main(String[] args) {

        Client client = new Client();
        client.name = "Maxim";
        client.age = 26;
        client.salary = 30_000;

        Bank bank = new Bank();

        int amount = client.calcSavings(bank, 34);   //amount_RUB

        System.out.println("Сумма накоплений: " + amount + " RUB");

    }
}
