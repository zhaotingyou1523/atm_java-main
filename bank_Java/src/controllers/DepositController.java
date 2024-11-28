package controllers;

import model.AccountDao;
import model.AccountInfoDto;

import java.util.ArrayList;

public class DepositController {

    public ArrayList<AccountInfoDto> accountDao = AccountDao.getInstance().accountInfoDtos;
    public void deposit( int accountNumber, int accountpassword ,int depositMoney ){
        for(int i = 0; i < accountDao.size(); i ++) {
            if(accountDao.get(i).getAccountNumber() == accountNumber && accountDao.get(i).getAcountPassword() == accountpassword ) {
                int newBalance = accountDao.get(i).getBalance() + depositMoney;
                accountDao.get(i).setBalance(newBalance);
                return;
            }
        }
        System.out.println("아이디/비밀번호가 틀렸습니다");
    }

}
