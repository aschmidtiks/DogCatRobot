public abstract class AnimalWithFeathers extends Animal {
    protected String feathersColor;
    public AnimalWithFeathers(String feathersColor){
        this.feathersColor = feathersColor;
    }

    public String getFeatherColor(){
        return this.feathersColor;
    }
    public void setFeatherColor(String feathersColor)
    {
        this.feathersColor = feathersColor;
    }
}
