package ua.iot.lviv.ua;

public class Bank {
  static int moneyCapacity;
  protected int numberOfEmployees;
  protected int services;
  private String name;
  private int customerAmount;
  private long creditsAmount;
  private int peopleAmount;
  private String bankLocation;

  public Bank() {
    this("Unknown", 0, 0, 0, "Unknown", 0, 0);
  }

  public Bank(String name, int customerAmount, double creditsAmount, int peopleAmount,
      String bankLocation,
      int numberOfEmployees, int services) {
    this.name = name;
    this.customerAmount = customerAmount;
    this.creditsAmount = (long) creditsAmount;
    this.peopleAmount = peopleAmount;
    this.bankLocation = bankLocation;
    this.numberOfEmployees = numberOfEmployees;
    this.services = services;
  }

  public Bank(String name, int customerAmount, double creditsAmount, int peopleAmount) {
    this(name, customerAmount, creditsAmount, peopleAmount, null, 0, 0);
  }

  public static String printStaticMonCapacity() {
    return "moneyCapacity ( it`s a static ):" + moneyCapacity;
  }

  public String getName() {
    return name;
  }

  ;

  public void setName(String name) {
    this.name = name;
  }

  public int getCustomerAmount() {
    return customerAmount;
  }


  public void setCustomerAmount(int customerAmount) {
    this.customerAmount = customerAmount;
  }

  public long getCreditsAmount() {
    return creditsAmount;
  }

  public void setCreditsAmount(long CreditsAmount) {
    this.creditsAmount = creditsAmount;
  }

  public int getPeopleAmount() {
    return peopleAmount;
  }

  public void setPeopleAmount(int peopleAmount) {
    this.peopleAmount = peopleAmount;
  }

  public String getBankLocation() {
    return bankLocation;
  }

  public void setBankLocation(String bankLocation) {
    this.bankLocation = bankLocation;
  }

  @Override
  public String toString() {
    return "Bank{" + "name='" + name + '\'' + ", customerAmount=" + customerAmount
        + ", creditsAmount="
        + creditsAmount + ", peopleAmount=" + peopleAmount +
        ", bankLocation='" + bankLocation + '\''
        + ", numberOfEmployees=" + numberOfEmployees + ", services=" + services + '}';
  }

  public String printMonCapacity() {
    return "moneyCapacity ( it's not a static ) :" + moneyCapacity;
  }

  public void resertValues(String name, int customerAmount, double creditsAmount, int peopleAmount,
      String bankLocation, int numberOfEmployees, int services) {
    this.name = name;
    this.customerAmount = customerAmount;
    this.creditsAmount = (long) creditsAmount;
    this.peopleAmount = peopleAmount;
    this.bankLocation = bankLocation;
    this.numberOfEmployees = numberOfEmployees;
    this.services = services;
  }
}