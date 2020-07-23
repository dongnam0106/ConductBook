public class FictionBook extends Book{
    private String category;

    public FictionBook(int bookCode, int price, String name, String author, String category) {
        super(bookCode, price, name, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return super.toString()
                + "";
    }
}
