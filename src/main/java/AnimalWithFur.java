public abstract class AnimalWithFur extends Animal {

    protected String furColor;
    public AnimalWithFur(String furColor){
        this.furColor = furColor;
    }

    public String getFurColor(){
        return this.furColor;
    }
    public void setFurColor(String color)
    {
        this.furColor = color;
    }
}
