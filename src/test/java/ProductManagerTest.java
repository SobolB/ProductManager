import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    @Test
    public void testWhenFewProductsFinded(){
        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "NameBook1", 100,"AuthorBook1");
        Book book2 = new Book(2, "NameBook2", 120,"AuthorBook2");
        Book book3 = new Book(3, "Book3", 160,"AuthorBook3");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("NameBook");
        Product[] expected = {book1, book2};


        Assertions.assertArrayEquals(expected, actual);
    }

}