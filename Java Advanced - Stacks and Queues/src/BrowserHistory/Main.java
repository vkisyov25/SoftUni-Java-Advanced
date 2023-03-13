package BrowserHistory;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String currentUrl = "";

        ArrayDeque<String> browserHistory = new ArrayDeque<>();

        while(!command.equals("Home")){
            if (command.equals("back")){
                if(browserHistory.size() > 1){
                    browserHistory.pop();
                    currentUrl = browserHistory.peek();
                    System.out.println(currentUrl);
                }else{
                    System.out.println("no previous URLs");
                }
            }else {
                browserHistory.push(command);
                currentUrl = browserHistory.peek();
                System.out.println(currentUrl);
            }



            command = scanner.nextLine();
        }
    }
}
