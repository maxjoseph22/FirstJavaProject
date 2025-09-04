public class Crowd {
    public int size;
    public boolean rowdy;

    public Crowd (int size, boolean rowdy) {
        this.size = size;
        this.rowdy = rowdy;
    }

    public void reaction() {
        if (rowdy) {
            System.out.println("The crowd shout oiiiiiiii!");
    } else {
            System.out.println("The crowd shout get on with it!");
        }
}}

