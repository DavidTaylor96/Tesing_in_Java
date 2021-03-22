public class Bottle {
    private int volume = 50;

    public Bottle() {
        this.volume = volume;
    }

    public void drink(){
        this.volume -= 10;
    }

    public int getVolume() {
        return volume;
    }

    public void emptyDrink(){
        this.volume = 0;
    }

    public void fillDrink(){
        this.volume = 100;
    }

}
