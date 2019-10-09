public abstract class Bird extends AnimalWithFeathers {
    public Bird(String feathersColor) {
        super(feathersColor);
    }

    public Bird() {
        this("Black");
    }
}
