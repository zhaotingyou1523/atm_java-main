package model;

import java.util.ArrayList;

public class AccountDao {
    private static AccountDao accountDao = new AccountDao();
    private AccountDao(){}
    public static AccountDao getInstance(){ return accountDao;};
     public ArrayList<AccountInfoDto> accountInfoDtos = new ArrayList<>();

    public boolean makeAccount(String ownerName, int accountNumber , int accountPassword ){
        AccountInfoDto accountInfoDto = new AccountInfoDto(ownerName,accountNumber,accountPassword);
        accountInfoDtos.add(accountInfoDto);
        return true;
    }



}
