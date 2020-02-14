package ua.iot.lviv.ua;

public class BankMain {
  public static void main(String[] args) {

    Bank.moneyCapacity = 124;
    final int ARRAY_LENGTH = 4;

    Bank firstBank = new Bank();
    Bank secondBank = new Bank("AlphaBank", 60, 150,
        210, "Lviv", 70, 300000);
    Bank thirdBank = new Bank("CreditBank", 40, 100, 60000);

    System.out.println(firstBank);
    System.out.println("");
    System.out.println(secondBank);
    System.out.println("");
    System.out.println(thirdBank);

    System.out.println("");
    System.out.println(firstBank.printMonCapacity());
    System.out.println("");
    System.out.println(Bank.printStaticMonCapacity());

    System.out.println("");

    Bank[] arrayOfBanks = new Bank[ARRAY_LENGTH];

    int index = 0;
    do {
      arrayOfBanks[index] = new Bank();
      index++;
    } while (index < ARRAY_LENGTH);

    for (Bank newIndex : arrayOfBanks) {
      newIndex.toString();
      System.out.println(newIndex.toString() + "\n");
    }
  }
}