public class Printer {
    private int paper = 100;
    private int toner = 100;

    public int getPaper(){
        return this.paper;
    }


    public void print(int numberOfPages, int copies){
        int totalNeeded = numberOfPages * copies;
        if( this.paper >= totalNeeded && this.toner >= totalNeeded){
            this.tonerUsed(totalNeeded);
            this.paper -= totalNeeded;
        }
    }

    public int getToner(){
        return this.toner;
    }

    public void tonerUsed( int totalNeeded){
        this.toner -= totalNeeded;
    }

}
