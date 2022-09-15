package mapoperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsMapOperation {
    public static void main(String[] args) {

        /**
         * Stream map(Function mapper)
         * Map operation takes a mapper function, which is basically a function with abstract method 'R apply(T t);'
         *
         * Map function takes each stream element and map it to some other value returned by the mapper function
         *
         * Important: you should not try to change the state of an object using map() function,
         * it carries the risk of running into concurrent modification exception during runtime
         * Also you should try to avoid changing object state in functional programming
         */

        List<Integer> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .map(integer -> integer * 25)
                .collect(Collectors.toList());
        collect.forEach(integer -> System.out.println(integer));

        List<Book> books = new ArrayList<>();
        books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.5));
        books.add(new Book("The Notebook", "Nicholas Sparks ", "Romance", 4.10));
        books.add(new Book("It", "Stephen King", "Horror", 4.74));
        books.add(new Book("Clean Code", "Robert Martin", "Science", 4.99));
        books.add(new Book("Data Structures and Algo", "Michael Goodrich", "Horror", 4.17));

        books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
                .filter(book -> book.getRating() > 3)
                .map(book -> book.getName())
                .forEach(System.out::println);

        String str = "Testing";
        String abc = Stream.of(str)
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.toList()).get(0);

        System.out.println(abc);

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());


        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(p -> System.out.println(p));

//        Stream<Integer> streamArray = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
//        streamArray.forEach(System.out::println);


        Stream<Integer> randomNumbers = Stream
                .generate(() -> (new Random()).nextInt(100));

//        randomNumbers.limit(20).forEach(System.out::println);
        randomNumbers.limit(20).sorted().forEach(p -> System.out.println("this is random " + p));

        IntStream streamChars = "12345_abcdefg".chars();
        System.out.println("stream chars " + streamChars.toString());
        streamChars.forEach(p -> System.out.println("=====" + p));


        Stream<Character> characterStream = "12345_abcdefg".chars()
                .mapToObj(c -> (char) c);
        System.out.println(characterStream);
//        characterStream.forEach(p -> System.out.println(p));

//OR

//        Stream<String> streamChar = Stream.of("A$B$C".split("\\$"));
//        streamChar.forEach(p -> System.out.println(p));

    }


}
