public class Main {

    public static void main(String[] args) {
        Book Book1 = new ProgrammingBook(1,40,"The Pragmatic Programmer","Andrew Hunt and David Thomas","All","SpringMVC");
        Book Book2 = new ProgrammingBook(2,24,"Clean Code: A Handbook of Agile Software Craftsmanship","Robert C. Martin","All","SpringMVC");
        Book Book3 = new ProgrammingBook(3,64,"Thinking in Java","Bruce Eckel","Java","JSF");
        Book Book4 = new ProgrammingBook(4,30,"Java Performance","Binu John","Java","Wicket");
        Book Book5 = new ProgrammingBook(5,30,"Professional JavaScript for Web Developers","Zakas","JavaScript","Ember.js");

        Book Book6 = new FictionBook(6,40,"Ánh trăng lừa dối","Huskey","Fiction");
        Book Book7 = new FictionBook(7,24,"Super man","Bull","Fiction");
        Book Book8 = new FictionBook(8,24,"Người sói","Chiwawa","Fiction");
        Book Book9 = new FictionBook(9,30,"Cậu vàng","Shiba","Fiction");
        Book Book10 = new FictionBook(10,30,"Professional JavaScript for Web Developers","Zakas","Ember.js");

        System.out.println(Book1.toString());
    }
}
