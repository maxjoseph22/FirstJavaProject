public class DJ {
    public String name;
    public String genre;
    public int recordCollectionSize;
    public double fee;

    public DJ(String name, String genre, int recordCollectionSize, double fee) {
        this.name = name;
        this.genre = genre;
        this.recordCollectionSize = recordCollectionSize;
        this.fee = fee;
    }

    public void rewind(int times) {
        System.out.println("DJ " + this.name + " pulled up the track " + times + " times!");
        for (int i = 1; i <= times; i++) {
            System.out.println("Pulllllll uppppppp");
        }
    }}



