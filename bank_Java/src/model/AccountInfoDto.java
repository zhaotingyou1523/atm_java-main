package model;

public class AccountInfoDto {
    private String ownerName;
    private int balance = 0;
    private int accountNumber;
    private int accountPassword;

    public AccountInfoDto() {
    }

    public AccountInfoDto(String ownerName, int accountNumber, int accountPassword) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.accountPassword = accountPassword;
    }

    public AccountInfoDto( int accountNumber, int accountPassword) {
        this.accountNumber = accountNumber;
        this.accountPassword = accountPassword;
    }




    public AccountInfoDto(String ownerName, int balance, int accountNumber, int accountPassword) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountPassword = accountPassword;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int acountNumber) {
        this.accountNumber = acountNumber;
    }

    public int getAcountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(int accountPassword) {
        this.accountPassword = accountPassword;
    }

    @Override
    public String toString() {
        return ownerName + "님의 계좌생성" +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", accountPassword=" + accountPassword +
                '}';
    }
}
