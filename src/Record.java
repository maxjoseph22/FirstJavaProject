public class Record {
    public String name;
    public double rating;
    public boolean bigBassline;
    public int condition;

    public Record(String name, double rating, boolean bigBassline, int condition) {
        this.name = name;
        this.rating = rating;
        this.bigBassline = bigBassline;
        this.condition = condition;
    }

    public void skips() {
        if (condition < 6) {
            System.out.println("The record skipped!");
        }
    }

    
}
