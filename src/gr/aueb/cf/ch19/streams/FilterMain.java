package gr.aueb.cf.ch19.streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterMain {

    public static void main(String[] args) {
        List<String> cities = List.of("Athens", "London", "Toronto", "Tunis", "Athens");

        var tCities = cities.stream()
                .filter(city -> city.startsWith("T"))
                .collect(Collectors.toList()); // return mutable list


        var tCities2 = cities.stream()
                .filter(city -> city.length() > 6)
                .toList(); // returns immutable list

        cities.forEach(System.out::println);
        System.out.println();
        tCities.forEach(System.out::println);
        System.out.println();
        tCities2.forEach(System.out::println);
        System.out.println();

        Set<String> uniqueCityNames = cities.stream().collect(Collectors.toSet());
//        Set<String> uniqueCityNames = new HashSet<>(cities);
        uniqueCityNames.forEach(System.out::println);
        System.out.println();


        var strCities = cities.stream()
                .collect(Collectors.joining(", "));
//        var strCities = String.join(", ", cities);
        System.out.println(strCities);






    }
}
