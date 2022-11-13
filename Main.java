import java.util.*;
public class Main {
    //Fill with random values
    static int[][] items = {{5, 7},
                    {4, 2},
                    {6, 10},
                    {10, 13},
                    {9, 9}};
    static int[][] items2 = new int[15][2];
    static int N = 5;
    final static int maxW = 20;
    public static void main(String[] args){
        for (int i = 0; i < items2.length; i++){
            items2[i][0] = (int) (Math.random()*99+1);
            items2[i][1] = (int) (Math.random()*19+1);
        }
        ArrayList<Item> itemList1 = new ArrayList<>();
        ArrayList<Item> itemList2 = new ArrayList<>();
        for (int i =0 ; i<items.length; i++){
            itemList1.add(new Item(i,items[i][0],items[i][1]));
        }
        for (int i = 0; i < items2.length; i++){
            itemList2.add(new Item(i,items2[i][0],items2[i][1]));
        }
        GreedyAlgorithmForKP test1 = new GreedyAlgorithmForKP(itemList1, maxW);
        GreedyAlgorithmForKP test2 = new GreedyAlgorithmForKP(itemList2, maxW);

        ArrayList<Item> list1=test1.greedyAlgorithm();
        System.out.println("____________________________________________________________");
        System.out.println(list1.size() > 0 ? list1 : "All of the items' weights are bigger than backpack's capacity");
        System.out.println("____________________________________________________________");
        System.out.println("____________________________________________________________");
        ArrayList<Item> list2=test2.greedyAlgorithm();
        System.out.println("____________________________________________________________");
        System.out.println(list2.size() > 0 ? list2 : "All of the items' weights are bigger than backpack's capacity");
    }
}

