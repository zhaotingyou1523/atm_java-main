package view;

import controllers.*;

public class MainView {

    public void mainPage() {
        while (true) {
            System.out.println("1. 계좌생성 2. 입금 3. 출금 4. 이체 5.계좌조회 *.시스템종료  ");
            int ch = Router.sc.nextInt();

            switch (ch) {
                case 1 :
                    MakeAccountView makeAccountView = new MakeAccountView();
                    makeAccountView.makeAccountView();
                    break;
                case 2 :
                    DepositView depositView = new DepositView();
                    depositView.depositView();
                    break;
                case 3 :
                    PayOutController payOutController = new PayOutController();
                    break;
                case 4 :
                    PaymentView paymentView = new PaymentView();
                    paymentView.paymentView();
                    break;
                case 5 :
                    CheckAccountView checkAccountView = new CheckAccountView();
                    checkAccountView.checkAccountView();
                    break;
                default:
                    return;
            }
        }
    }
}
