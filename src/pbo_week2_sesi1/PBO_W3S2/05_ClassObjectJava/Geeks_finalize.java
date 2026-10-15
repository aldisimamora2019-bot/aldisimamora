// 4. finalize() method
// Dipanggil tepat sebelum sebuah objek dikumpulkan oleh Garbage Collector.

public class Geeks_finalize {
    public static void main(String[] args) {

        Geeks_finalize t = new Geeks_finalize();
        System.out.println(t.hashCode());

        t = null;

        System.gc();

        System.out.println("end");
    }

    @Override protected void finalize()
    {
        System.out.println("finalize method called");
    }
}
