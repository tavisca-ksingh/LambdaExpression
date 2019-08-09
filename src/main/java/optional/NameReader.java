package optional;


import java.io.*;
import java.util.Optional;

public class NameReader {



    public void print(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        NameReader reader = new NameReader();
        Optional<String> mayBeName = reader.getName(1);
        mayBeName.ifPresent(reader::print);
        mayBeName.ifPresent(name->System.out.println(name));
    }

    public Optional<String> getName(int id)
    {
        if(id ==1)
            return Optional.of("hello world");

        return Optional.empty();
    }
}
