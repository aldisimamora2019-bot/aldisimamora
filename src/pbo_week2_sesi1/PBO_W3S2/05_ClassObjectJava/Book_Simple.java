public class Book_Simple implements Cloneable {
    private String t;
    public Book_Simple(String t) {
        this.t = t;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getTitle() {
        return t;
    }

    public static void main(String[] args) {
        try {
            Book_Simple b1 = new Book_Simple("Java Basics");
            Book_Simple b2 = (Book_Simple) b1.clone();

            System.out.println("Judul buku b1: " + b1.getTitle());
            System.out.println("Judul buku b2: " + b2.getTitle());
            System.out.println("Apakah b1 dan b2 objek yang sama? " + (b1 == b2));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
