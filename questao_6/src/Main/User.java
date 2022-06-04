package Main;

public class User {
    private String name;
    private int hits;
    private int errors;

    public User(String name) {
        this.name = name;
    }

    public void hitQuestion(int hits) {
        this.hits += hits;
    }

    public void wrongQuestion(int errors) { this.errors += errors; }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHits() {
        return this.hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getErrors() {
        return this.errors;
    }

    public void setErrors(int errors) {
        this.errors = errors;
    }
}
