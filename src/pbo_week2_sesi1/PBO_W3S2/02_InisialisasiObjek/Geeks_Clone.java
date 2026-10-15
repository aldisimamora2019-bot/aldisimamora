// 3. Menggunakan clone() method
// Metode clone() membuat dan mengembalikan salinan objek.

class Geeks implements Cloneable {
    @Override //method 1
    protected Object clone()
        throws CloneNotSupportedException
    {
        return super.clone(); // Super() mengacu ke parent class
    }
    String name = "GeeksForGeeks";

    public static void main(String[] args) // Method 2
    {
        Geeks o1 = new Geeks();

        try {
            Geeks o2 = (Geeks) o1.clone();
            System.out.println(o2.name);
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

/*
Output:
run:
GeeksForGeeks
*/
