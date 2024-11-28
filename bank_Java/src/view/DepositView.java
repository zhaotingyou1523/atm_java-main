package view;

import controllers.DepositController;

public class DepositView {
    public void depositView(){

        try{
            System.out.println("입금 할 계좌를 입력해 주세요");
            int accountNumber = Router.sc.nextInt();
            System.out.println("입금 할 계좌의 비밀번호를 입력해주세요");
            int accountPassword = Router.sc.nextInt();
            System.out.println("입금 할 금액을 입력해주세요.");
            int depositMoney = Router.sc.nextInt();
            DepositController depositController = new DepositController();
            depositController.deposit(accountNumber,accountPassword,depositMoney);
        } catch (NullPointerException e ) {
            System.out.println(e.getMessage());
        }
    }
}
