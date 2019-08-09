package optional;

import java.util.Optional;

public class NullHandler {

    public static void main(String[] args) {

        Optional<String > todayWork =  workOfTheDay("Tuesday");
        todayWork.ifPresent(System.out::println);

    }


    static Optional<String> workOfTheDay(String day)
    {
        if(day.equalsIgnoreCase("monday"))
        return Optional.of("Learn Java");

        return Optional.empty();
    }


}


