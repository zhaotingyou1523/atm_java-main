package view;

import java.util.Scanner;

public class Router {
    public static Scanner sc = new Scanner(System.in);
   public void start(){
       MainView mainView = new MainView();
       mainView.mainPage();
   }

}
