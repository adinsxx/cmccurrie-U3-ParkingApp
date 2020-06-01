package connor.mccurrie.singleton;

import java.util.Scanner;

public class CheckIn {
    Scanner keyboard = new Scanner(System.in);
    private static CheckIn instance = new CheckIn();

    private CheckIn(){}

    public static CheckIn getFirstInstance(){
        return instance;
    }

    public void showMessage(){
    }
}
