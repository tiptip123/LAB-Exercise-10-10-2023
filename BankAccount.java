
public class BankAccount {

    private String name;
    private int age;
    private int accNum;
    private double balance;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getaccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String n) {
        this.name = n;

    }

    public void setAge(int a) {
        this.age = a;

    }

    public void setAccNum(int acc) {
        this.accNum = acc;

    }

    public void setBalance(double b, double c) {
        this.balance = b + c;

    }

}

class main {

    public static void main(String[] args) {

        BankAccount j = new BankAccount();
        j.setName("Joseph Jay B Baguio");
        j.setAge(22);
        j.setAccNum(143734);
        j.setBalance(1.3, 1);

        System.out.println("CHINA BANK!" + "\n" + "Name:" + j.getName() + "\n" + "Age:" + j.getAge() + "\n" + "Account Number:" + j.getaccNum() + "\n" + "Balance:" + j.getBalance());

    }
}
