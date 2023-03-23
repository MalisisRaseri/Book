package Book;

//класс для хранения данных о книге

public class Book {
    private String name; // имя книги
    private Publisher publisher; // издатель
    private int year; // год выпуска

    private String[] authors; // автор


    public Book(String name, Publisher publisher, int year, String authors) {
        this.name = name;
        this.publisher = publisher;
        this.year = year;

        if(authors.equals(null) && authors.equals(""))
            this.authors = null;
        else
            this.authors = authors.split(",");
    }

    public Book(String name, Publisher publisher, int year) {
        this.name = name;
        this.publisher = publisher;
        this.year = year;
    }
    public Book(String authors, String name, Publisher publisher, int year) {
        if(authors.equals(null) && authors.equals(""))
           this.authors = null;
        else
           this.authors = authors.split(",");

        this.name = name;
        this.publisher = publisher;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException {
        if(name == null)
            throw new IllegalArgumentException();
        else
            this.name = name;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher() throws IllegalArgumentException {
        if(publisher == null)
            throw new IllegalArgumentException();
        else
            this.publisher = publisher;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) throws IllegalArgumentException {
        if (year <= 0)
            throw new IllegalArgumentException();
        else
            this.year = year;
    }
   public String getAuthors() throws Exception{
        String authors = "";
        if(this.authors != null) {
            int arrLen = this.authors.length;
            for(int i = 0; i < arrLen; i++)
                if(arrLen > 1 && i < arrLen - 1)
                    authors += this.authors[i] + ",";
                else
                    authors += this.authors[i];
        }
        return authors;
    }

    public void setAuthors(String authors) throws  IllegalArgumentException {
        if(authors == null)
            throw new IllegalArgumentException();
        else
            this.authors = authors.split(",");
    }

    //get-метод, возвращающий количество авторов книги
    public int numberAuthors(){
        return this.authors.length;
    }

    //метод print, печатающий данные о книге: название, авторы (если есть), издательство, год издания;
    public void print() throws Exception {
        String result = "";

        String name = getName();
        if(name != null && name != "")
            result += name + "; ";

        String authors = getAuthors();
        if(authors != null && authors != "")
            result += authors + "; ";

        String publisher = getPublisher().getNamePublisher();
        if(publisher != null && publisher != "")
            result +=  publisher + ", ";

        String city = getPublisher().getCityName();
        if(city != null && city != "")
            result += city + " ";

        result +=  getYear() + ".";
        System.out.println(result);
    }

    //статический метод printAll, печатающий данные обо всех книгах заданного массива.
    static void printAll(Book[] books) throws Exception {
        for(Book b : books){
            b.print();
        }
    }
}




