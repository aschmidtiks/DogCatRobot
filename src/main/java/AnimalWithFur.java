public abstract class AnimalWithFur extends Animal {

    private String furColor = "black";
    public AnimalWithFur(String furColor){
        this.furColor = furColor;
    }
    public AnimalWithFur() {

    }

    public String getFurColor(){
        return this.furColor;
    }
    public void setFurColor(String color)
    {
        this.furColor = color;
    }
}
