package OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nLines =Integer.parseInt(scanner.nextLine());

        Person person;
        List<Person> personList = new ArrayList<Person>();


        for(int i=0; i<nLines; i++){
            String[] arr = scanner.nextLine().split(" ");
            person = new Person(arr[0],Integer.parseInt(arr[1]));

            if(person.getAge() > 30){
                personList.add(person);
            }
        }


        Collections.sort(personList);
        personList.forEach(p -> System.out.printf("%s - %d%n", p.getName(), p.getAge()));

    }
}
