package Builder;

public class Builder {
    private String name;
    private int id;

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setId(int id) {
        this.id = id;
        return this;
    }

    public Student getObject(){
        return new Student(this.name, this.id);
    }
}
