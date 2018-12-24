package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */

        System.out.println("Lowest difference between two array is "+FindLowestDifference.lowestDifference());

    }
    public static int lowestDifference() {
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};

        int low1 = Integer.MAX_VALUE;

        for (int i = 0; i < array1.length; i++) {
            if (low1 > array1[i]) {
                low1 = array1[i];
            }
        }

        int low2 = Integer.MAX_VALUE;

        for (int j = 0; j < array2.length; j++) {
            if (low2 > array2[j]) {
                low2 = array2[j];
            }
        }
        int difference;
        if (low1 > low2) {
            difference = low1 - low2;

        } else {
            difference = low2 - low1;

        }
        return difference;
    }
}




    }

}
