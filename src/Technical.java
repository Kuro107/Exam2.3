import java.util.Arrays;

public class Technical extends  Book{

    private boolean haveComputer = false;
    private static int techBooks = 1;

    public Technical(String identify, int date, String nameOfBook,String author) {
        super(identify, date, nameOfBook, author);
    }

    public boolean isHaveComputer() {
        return haveComputer;
    }

    public void setHaveComputer(boolean haveComputer) {
        this.haveComputer = haveComputer;
    }


    public static int getTechBooks() {
        return techBooks;
    }

    protected void addBookTech(String name, String aut,String identify, int date){
        techBooks++;
    }
    @Override
    public String toString(){
        String category = "Technical";
        return "Name: " + nameOfBook + "\nPages: " + numOfPages + "\nAuthor:" + author +
                "\nCategory: "+ category + "\nHow many books of this category: " + techBooks;
    }
    public String allFromCategory(){
        return techBooks + "books"+ "\nBooks: ";
    }
}
