import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Fiction fiction = new Fiction("gigi", 200, "gege", "Lermontov");
        System.out.println(fiction);

        fiction.addBookFiction("22", "22", "2233", 1992);
        System.out.println(fiction);



        Technical technical = new Technical("Areas", 1998, "Galaxy", "Lomonosov");
        System.out.println(technical);

        technical.addBookTech("Sono","Serega","bele",2022);
        System.out.println(technical);


        Law law = new Law("1122",1998,"Parlament","Scriptonyte");
        System.out.println(law);

        law.addBookLaw("Militia","Saakashwilly","Georgia",2010);
        System.out.println(law);


    }
}

//    В библиотеке имеются отделы (художественной, юридической, технической литературы).
//        В каждом отделе имеются книги.
//        У отделов должны быть следующие методы:
//        1. Добавление книг
//        2. Вывод на консоль всех книг отдела
//        3. Вывод на консоль всей информации отдела (включая все книги)
//        4. Поиск по автору книги в отделе
//        5. Метод для получения количества книг в любом из отделов
//        6. Каждый отдел выводит свое название и количество книг при вызове toString()
//        7. У отдела технической литературы должно быть свойство "наличие компьютера"
//        Книга имеет идентификатор, автора, наименование, год выпуска.