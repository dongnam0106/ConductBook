public class ProgrammingBook extends Book {
    private String language;
    private String framework;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public ProgrammingBook(int bookCode, int price, String name, String author, String language, String framework) {
        super(bookCode, price, name, author);
        this.language = language;
        this.framework = framework;
    }

    @Override
    public String toString() {
        return  super.toString()
                + "\n Framework: " + getFramework();
    }
}
