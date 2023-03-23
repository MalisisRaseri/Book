package Book;

public class Main {
    public static void main(String[] args) throws Exception {
        //объекты для издательств
        Publisher publisher1 = new Publisher("Проспект", "Москва");
        Publisher publisher2 = new Publisher("Питер", "Санкт-Петербург");
        Publisher publisher3 = new Publisher("БХВ", "Санкт-Петебург");
        Publisher publisher4 = new Publisher("Диалектика", "Киев");

        //массив из книг
        Book book0 = new Book("Седжвик Роберт, Уэйн Кевин", "Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных", publisher2, 2018);
        Book book1 = new Book("Вигерс Карл", "Разработка требований к программному обеспечению. 3-е издание, до полненное", publisher3, 2019);
        Book book2 = new Book("Шилдт Герберт", "Java. Полное руководство, 10-е издание", publisher4, 2018);
        Book book3 = new Book("Полубенцева М.И.", "C/C++.Процедурное программирование", publisher3, 2017);
        Book book4 = new Book("Конституция РФ", publisher1, 2020);

        Book[] books = {book0, book1, book2, book3, book4};

        Book.printAll(books);
        // Получить количество авторов
        System.out.println("Number of authors: " + book0.numberAuthors());

        // Исправляет ошибку в названии города издательства «БХВ»
        if(publisher3.getCityName().equals("Санкт-Петебург")){
            publisher3.setCityName("Санкт-Петербург");
            System.out.println("Исправлена опечатка в слове 'Санкт-Петебург'");
        }

        Book.printAll(books);
    }
}
