import java.util.ArrayList;

public class Item implements Comparable {
        private final int number;
        private final int weight;
        private final int quality;
        Item(int number, int quality, int weight){
            this.number = number;
            this.quality = quality;
            this.weight = weight;
        }
        int getNumber(){
            return this.number;
        }
        int getWeight(){
            return this.weight;
        }
        int getQuality(){
            return this.quality;
        }

    @Override
    public int compareTo(Object item) {
        return Integer.compare(this.quality, ((Item) item).getQuality());
    }
    @Override
    public String toString(){

            return "Item's number " + number + " weight "+weight+" quality "+ quality;
    }

}
