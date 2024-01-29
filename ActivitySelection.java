
// Java program for activity selection problem
// It is assumed that the activities are already sorted according to their finish time

public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] finish = { 2, 4, 6, 7, 9, 9 };
        int n = start.length;
        printMaxActivities(start, finish, n);
    }

    public static void printMaxActivities(int s[], int f[], int n) {

        int i, j;

        i = 0;
        System.out.print(i + " ");

        for (j = 1; j < n; j++) {

            if (s[j] >= f[i]) {
                System.out.print(j + " ");
                i = j;
            }
        }
    }
    /*
      * Sort the activities according to their finishing time

      * Select the first activity from the sorted array and print it

      * Do the following for the remaining activities in the sorted array
            If the start time of this activity is greater than or equal to the finish time of the previously    selected activity then select this activity and print it

     */
}
