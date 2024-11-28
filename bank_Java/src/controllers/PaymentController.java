package controllers;

import model.AccountDao;
import model.AccountInfoDto;

import java.util.ArrayList;

public class PaymentController {
    public ArrayList<AccountInfoDto> accountInfoDtos = AccountDao.getInstance().accountInfoDtos;
    public void paymentController(int depositorAccountNumber , int depositorAccountPassword , int payeeAccountNumber, int amount ){
        for (AccountInfoDto accountInfoDto : accountInfoDtos) {
            if (accountInfoDto.getAccountNumber() == depositorAccountNumber && accountInfoDto.getAcountPassword() == depositorAccountPassword) {
                accountInfoDto.setBalance(accountInfoDto.getBalance() - amount);
                System.out.println(accountInfoDto.getOwnerName() + ":" + accountInfoDto.getBalance());
            }
        }
        for (AccountInfoDto accountInfoDto : accountInfoDtos) {
            if (accountInfoDto.getAccountNumber() == payeeAccountNumber) {
                accountInfoDto.setBalance(accountInfoDto.getBalance() + amount);
                System.out.println(accountInfoDto.getOwnerName() + ":" + accountInfoDto.getBalance());
            }
        }
    }
}
