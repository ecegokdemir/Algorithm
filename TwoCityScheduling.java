import java.util.Arrays;

public class TwoCityScheduling {

    public static void main(String[] args) {
         int[][] costs = { { 259, 770 }, { 448, 54 }, { 926, 667 }, { 184, 139 }, { 840, 118 }, { 577, 469 } };

        System.out.println(twoCitySchedCost(costs));

    }

    public static int twoCitySchedCost(int[][] costs) {
        
        Arrays.sort(costs,(a, b) -> (a[0] - a[1]) - (b[0] - b[1]));

        int result = 0;

        for (int i = 0; i < costs.length; i++) {
            if (i < costs.length / 2) {
                result += costs[i][0];
            } else {
                result += costs[i][1];
            }
        }

        return result;
    }
}
