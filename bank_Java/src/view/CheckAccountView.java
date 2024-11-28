package view;

import controllers.CheckAccountController;

public class CheckAccountView {
    public void checkAccountView(){
        try {
            System.out.println("계좌번호를 입력해주세요");
            int accountNumber = Router.sc.nextInt();
            System.out.println("계좌 비밀번호를 입력해주세요");
            int accountPassword = Router.sc.nextInt();
            CheckAccountController checkAccountController = new CheckAccountController();
            checkAccountController.checkAccount(accountNumber,accountPassword);
        } catch (NullPointerException e ) {
            System.out.println(e.getMessage());
        }
    }
}
