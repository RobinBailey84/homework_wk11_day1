public class Printer {
    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper(){
        return this.paper;
    }

    public void prints(int pages, int copies) {
        if (this.paper > pages * copies) {
            this.paper -= (pages * copies);
            this.toner -= (pages * copies);
        }
    }

    public int fillPrinter(){
        this.paper = 1000;
        return this.paper;
    }

    public int getToner(){
        return this.toner;
    }

}
