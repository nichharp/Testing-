package Tests;

import ExamplePackage.Book;
import org.junit.*;


public class TestingRunner {
//    static Book x = new Book();


    @BeforeClass
    public static void beforeClass() {
    }

    @Before
    public void beforeTest() {

    }

    @Test
    public void numOfGenreBooks(){


        Services ex = new Services();
        ex.addBooks();
//        System.out.println(ex.howManyBooks("Fantasy"));
        Assert.assertEquals(ex.howManyBooks("Fantasy"), 3);
    }


    @Test
    public void regTest(){
        Book ec = new Book("still ran out of names", "me2", "SHOCK AND AWE", 2020);
        Assert.assertEquals(ec.TestMe(), "TestMe");

    }

    @After
    public void afterTest() {
    }

    @AfterClass
    public static void afterClass() {

    }

}

