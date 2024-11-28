package view;

import controllers.PaymentController;

public class PaymentView {
    public void paymentView() {
        try {
            System.out.println("입금하시는 분의 계좌번호를 입력해주세요.");
            int depositorAccountNumber = Router.sc.nextInt();
            System.out.println("입금하시는 분의 계좌 비밀번호를 입력해주세요.");
            int depositorAccountPassword = Router.sc.nextInt();
            System.out.println("입금 받으시는 분의 계좌번호를 입력해주세요.");
            int payeeAccountNumber = Router.sc.nextInt();
            System.out.println("입금하실 금액을 입력해주세요");
            int amount = Router.sc.nextInt();
            PaymentController paymentController = new PaymentController();
            paymentController.paymentController(depositorAccountNumber,depositorAccountPassword,payeeAccountNumber,amount);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
