package gr.aueb.cf.ch19.streams;

import java.util.List;
import java.util.Optional;

public class FindAndMatch {

    public static void main(String[] args) throws Exception {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");


        //Optional is a class/container for wrapping nulls. Avoid null pointer exception
        Optional<String> query = names.stream()
                .filter(name -> name.equals("Alice"))
                .findFirst();


        if (query.isPresent()) {
            System.out.println("First name: " + query.get());
        }

        query.ifPresent(first -> System.out.println("First name: "+ first));

        // Handling empty values orElse and orElseThrow
        String strFirst = names.stream()
                .filter(name -> name.equals("Bob"))
                .findFirst().orElse(null);


        String strFirst2 = names.stream()
                .filter(name -> name.equals("Bob"))
                .findFirst().orElseThrow(() -> new Exception("Bob not exists"));


        //Match
        boolean isBobExist = names.stream()
                .anyMatch(name -> name.equals("Bob"));
        System.out.println(isBobExist);

        boolean allAreBob = names.stream()
                .allMatch(name -> name.equals("Bob"));
        System.out.println(allAreBob);

        boolean noneIsBob = names.stream()
                .noneMatch(name -> name.equals("Bob"));
        System.out.println(noneIsBob);
    }
}
