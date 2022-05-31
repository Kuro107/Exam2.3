import java.util.Arrays;

public class Fiction extends Book{

        private static int fictionBooks = 1;

        public Fiction(String identify, int date, String nameOfBook,String author) {
                super(identify, date, nameOfBook, author);
        }

        public static int getFictionBooks() {
                return fictionBooks;
        }


        protected void addBookFiction(String name, String aut,String identify, int date){
                fictionBooks++;
        }
        @Override
        public String toString(){
                String category = "Fiction";
                return "Name: " + nameOfBook + "\nPages: " + numOfPages + "\nAuthor:" + author +
                        "\nCategory: "+ category + "\nHow many books of this category: " + fictionBooks;
        }
        public String allFromCategory(){
                return fictionBooks + "books"+ "\nBooks: ";
        }
}
