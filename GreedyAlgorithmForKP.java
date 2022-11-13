import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class GreedyAlgorithmForKP {
    ArrayList<Item> itemArrayList;
    final int maxW;
    GreedyAlgorithmForKP(ArrayList<Item> itemArrayList, int maxW){
        this.itemArrayList = itemArrayList;
        this.maxW = maxW;
    }
    public ArrayList<Item> greedyAlgorithm(){
        int currentW = 0;
        int currentQ = 0;
        ArrayList<Item> S = new ArrayList<>();
        itemArrayList.sort(Collections.reverseOrder());
        for (int i = 0; i < itemArrayList.size(); i++) {
            System.out.println("Step number: "+ (i+1));
            System.out.println("Chosen item: "+ itemArrayList.get(i).getNumber());
            System.out.println("Item's quality: "+ itemArrayList.get(i).getQuality());
            System.out.println("Item's weight: "+ itemArrayList.get(i).getWeight());
            if (itemArrayList.get(i).getWeight() <= maxW - currentW) {
                System.out.println("Item added!!!!!");
                S.add(itemArrayList.get(i));
                currentQ += itemArrayList.get(i).getQuality();
                currentW += itemArrayList.get(i).getWeight();
            }
            else {
                System.out.println("Item hasn't been added!!!");
            }
            System.out.println("Current quality: "+ currentQ);
            System.out.println("Current weight: "+ currentW+"/"+maxW);
            if (currentW == maxW){
                System.out.println("Backpack's capacity is over. Exiting loop...");
                break;
            }
            System.out.println("_______________________________________________________");
        }
        return S;
    }
}

