package homework.lesson2.blinov3;

public class Book {

    public static int nextId = 0;

    private int id = nextId++;
    private String title;
    private String authorName;
    private String publisher;
    private int year;
    private int numPage;
    private double price;
    private String bindingType;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumPage() {
        return numPage;
    }

    public void setNumPage(int numPage) {
        this.numPage = numPage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "\nBook{" +
                "\nid=" + id +
                "\n, title='" + title + '\'' +
                "\n, authorName='" + authorName + '\'' +
                "\n, publisher='" + publisher + '\'' +
                "\n, year=" + year +
                "\n, numPage=" + numPage +
                "\n, price=" + price +
                "\n, bindingType='" + bindingType + '\'' +
                '}';
    }
}
