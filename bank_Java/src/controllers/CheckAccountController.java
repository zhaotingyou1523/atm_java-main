package controllers;

import model.AccountDao;
import model.AccountInfoDto;

import java.util.ArrayList;

public class CheckAccountController {
    public ArrayList<AccountInfoDto> getAccountInfoDtos = AccountDao.getInstance().accountInfoDtos;

    public void checkAccount (int accountNumber , int password) {
        for(int i = 0; i < getAccountInfoDtos.size(); i ++ ) {
            if(accountNumber == getAccountInfoDtos.get(i).getAccountNumber() && password == getAccountInfoDtos.get(i).getAcountPassword() ) {
                String accountOwner = getAccountInfoDtos.get(i).getOwnerName();
                int balance = getAccountInfoDtos.get(i).getBalance();
                System.out.printf("%s님의 잔고는 %d 원입니다.%n", accountOwner, balance);
                return;
            }
        }
        System.out.println("계좌번호 혹은 계좌 비밀번호가 틀렸습니다.");
    }
}
