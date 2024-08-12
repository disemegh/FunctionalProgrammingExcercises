package excercise4;

public class Book {
    private String name;
    private String author;
    private double score;

    public Book(String name, String author, double score) {
        this.name = name;
        this.author = author;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }
}
