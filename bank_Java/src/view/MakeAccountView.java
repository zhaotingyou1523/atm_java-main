package view;

import controllers.MakeAccountController;
import model.AccountDao;
import model.AccountInfoDto;

public class MakeAccountView {
    public void makeAccountView(){
        try {

            System.out.println("이름을 적어주세요");
            String ownerName = Router.sc.next();
            System.out.println("생성할 계좌번호를 적어주세요");
            int accountNumber = Router.sc.nextInt();
            System.out.println("생성할 계좌의 비밀번호를 적어주세요");
            int accountPassword =
                    Router.sc.nextInt();
            boolean result = MakeAccountController.getInstance().makeAccount(ownerName, accountNumber, accountPassword);
            if (result) {
                System.out.println("계좌 생성 성공");
            } else {
                System.out.println("계좌 생성 실패");
            }
        } catch (NullPointerException e ) {
            System.out.println("입력란을 다 채워주세요");
        }
    }
}
