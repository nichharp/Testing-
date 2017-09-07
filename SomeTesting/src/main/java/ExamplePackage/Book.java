package ExamplePackage;

public class Book {
    public String name;
    public String author;
    public String genre;
    public int pub;

    public Book(String nameHolder, String authorHolder, String genreHolder, int pubHolder){
        this.name = nameHolder;
        this.author = authorHolder;
        this.genre = genreHolder;
        this.pub = pubHolder;
    }



    public String TestMe() {

        return "TestMe";
    }
}
