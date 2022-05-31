import java.util.Arrays;

public class Law extends Book{


    private static int lawBooks = 1;

    public Law(String identify, int date, String nameOfBook,String author) {
        super(identify, date, nameOfBook, author);
    }

    public static int getLawBooks() {
        return lawBooks;
    }

    protected void addBookLaw(String name, String aut,String identify, int date){
        lawBooks++;
    }
    @Override
    public String toString(){
        String category = "Fiction";
        return "Name: " + nameOfBook + "\nPages: " + numOfPages + "\nAuthor:" + author +
                "\nCategory: "+ category + "\nHow many books of this category: " + lawBooks;
    }
    public String allFromCategory(){
        return lawBooks + "books"+ "\nBooks: ";
    }
}