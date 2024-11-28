package controllers;

import model.AccountDao;
import model.AccountInfoDto;

import java.util.ArrayList;

public class MakeAccountController {
    private static MakeAccountController makeAccountController = new MakeAccountController();
    private MakeAccountController (){}
    public static MakeAccountController getInstance() {
        return makeAccountController;
    }


    public boolean makeAccount( String ownerName, int accountNumber, int accountPassword){return AccountDao.getInstance().makeAccount(ownerName,accountNumber,accountPassword);
    }

    public ArrayList<AccountInfoDto> bringAcountInfoDto() {
        return AccountDao.getInstance().accountInfoDtos;
    }
}
