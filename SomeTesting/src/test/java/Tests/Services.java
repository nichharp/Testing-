package Tests;


import ExamplePackage.Book;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import java.util.HashMap;
import java.util.Map;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        Services.class
})


public class Services {
    int mapCount =1;
    Map<Integer, Book> bookMap = new HashMap<>();

    public void addBooks(){
        Book new1 = new Book("Eragon","Chris Paolini","Fantasy",2001);
        Book new2 = new Book("LOTR","TolKING","Fantasy",1869);
        Book new3 = new Book("Left Hand", "Popo", "Action", 2007);
        Book new4 = new Book("run out of names", "me", "Fantasy", 2017);
        addToMap(new1);addToMap(new2);addToMap(new3);addToMap(new4);
    }

    public int howManyBooks(final String genreHolder){
        int countForGenre=0;
        for(int j=1;j<bookMap.size()+1;j++){
            if (bookMap.get(j).genre.equals(genreHolder)){
                countForGenre +=1;
            }
        }
        return countForGenre;
//        return bookMap.stream().filter(eachBook -> eachBook.getGenre().equals(genreHolder)).count();  saw the code and wanted to get this working. imported java8 but didnt see the "getGenre" function
    }

    public void addToMap(Book thing){
        bookMap.put(mapCount, thing);
//        System.out.println(mapCount);

        mapCount++;
//        System.out.println("you have added " + thing.name);
    }

}

