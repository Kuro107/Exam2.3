public class Book {
    public Book() {
        howManyBooks++;
    }

    public Book(String identify, int date, String nameOfBook, String author) {
        this.identify = identify;
        this.date = date;
        this.nameOfBook = nameOfBook;
        this.author = author;
        howManyBooks++;
    }

    protected  String identify;
    protected int date;
    protected String nameOfBook;
    protected int numOfPages;
    protected String author;
    static int howManyBooks = 0;

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
        howManyBooks++;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString(){
        return "Всего книг " + howManyBooks + "\n" +
                "Автор: " + author + "\n" +
                "Количество страниц: " + numOfPages + "\n"+
                "Название книги: " + nameOfBook + "\n";
    }
}


