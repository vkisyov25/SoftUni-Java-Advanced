package UniqueUsernames;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> set = new LinkedHashSet<>();

        for(int i=0; i<n; i++){
            String command = scanner.nextLine();
            set.add(command);
        }


        // creates Iterator oblect.
        Iterator itr = set.iterator();

        // check element is present or not. if not loop will
        // break.
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
