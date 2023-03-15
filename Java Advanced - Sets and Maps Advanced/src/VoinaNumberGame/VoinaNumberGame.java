package VoinaNumberGame;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        Set<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split(" ")).map(e->Integer.parseInt(e)).collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split(" ")).map(e->Integer.parseInt(e)).collect(Collectors.toCollection(LinkedHashSet::new));

        for(int i=0; i<50; i++){
            if(firstPlayer.isEmpty()){
                System.out.println("Second player win!");
                return;
            } else if (secondPlayer.isEmpty()) {
                System.out.println("First player win!");
                return;
            }

            int firstPlayerCard = firstPlayer.iterator().next();
            int secondPlayerCard = secondPlayer.iterator().next();

            firstPlayer.remove(firstPlayerCard);
            secondPlayer.remove(secondPlayerCard);

            if(firstPlayerCard>secondPlayerCard){
                firstPlayer.add(firstPlayerCard);
                firstPlayer.add(secondPlayerCard);
            } else if (firstPlayerCard<secondPlayerCard) {
                secondPlayer.add(firstPlayerCard);
                secondPlayer.add(secondPlayerCard);
            }
            {
                firstPlayer.add(firstPlayerCard);
                secondPlayer.add(secondPlayerCard);
            }


        }
        if(firstPlayer.size()>secondPlayer.size()){
            System.out.println("First player win!");
        } else if (secondPlayer.size()>firstPlayer.size()) {
            System.out.println("Second player win!");
        } else if (secondPlayer.size()==firstPlayer.size()) {
            System.out.println("Draw!");
        }

    }
}
