package BrowserHistoryUpgrade;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String currentUrl = "";

        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        ArrayDeque<String> forward  =new ArrayDeque<>();

        while(!command.equals("Home")){
            if (command.equals("back")){
                if(browserHistory.size() > 1){
                    String forwardBrowser = browserHistory.pop();
                    forward.push(forwardBrowser);
                    currentUrl = browserHistory.peek();
                    System.out.println(currentUrl);
                }else{
                    System.out.println("no previous URLs");
                }
            } else if (command.equals("forward")) {
                    browserHistory.push(forward.pop());
                System.out.println(browserHistory.peek());
            } else {
                browserHistory.push(command);
                currentUrl = browserHistory.peek();
                System.out.println(currentUrl);
            }



            command = scanner.nextLine();
        }
    }
}
