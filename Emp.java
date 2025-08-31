public class Emp{
  private byte Id;
private int balance;
private  String Bank;
  private char Gender;
  
  public byte getId() {
    return Id;
  }

  public void setId(byte Id) {
    this.Id = Id;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getBank() {
    return Bank;
  }

  public void setBank(String bank) {
    Bank = bank;
  }

  public char getGender() {
    return Gender;
  }

  public void setGender(char gender) {
    Gender = gender;
  }

  public Emp(byte id, int balance, String bank, char gender) {
    Id = id;
    this.balance = balance;
    Bank = bank;
    Gender = gender;
  }

  public Emp() {
  }

  @Override
  public String toString() {
    return "Emp [id=" + Id + ", balance=" + balance + ", Bank=" + Bank + ", Gender=" + Gender + "]";
  }

// Take 4 Variables of Emp Data With an Access Modifier Private
  // Prepare toString()
  
}
