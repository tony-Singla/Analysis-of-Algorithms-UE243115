import java.util.*;

public class ratio {

    static class Item {
        int weight, profit;
        double ratio;

        Item(int weight, int profit) {
            this.weight = weight;
            this.profit = profit;
            this.ratio = (double) profit / weight;
        }
    }

    public static void main(String[] args) {

        int[] weight = {10, 20, 30};
        int[] profit = {60, 100, 120};
        int capacity = 50;

        Item[] items = new Item[weight.length];

        for (int i = 0; i < weight.length; i++) {
            items[i] = new Item(weight[i], profit[i]);
        }

        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double totalProfit = 0.0;

        for (int i = 0; i < items.length; i++) {

            if (capacity >= items[i].weight) {
                capacity -= items[i].weight;
                totalProfit += items[i].profit;
            } else {
                totalProfit += items[i].ratio * capacity;
                break;
            }
        }

        System.out.println("profit :  " + totalProfit);
    }
}