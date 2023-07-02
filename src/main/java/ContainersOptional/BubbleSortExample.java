package ContainersOptional;

public class Main {
    public static void main(String[] args) {
        SalesRepresentative[] representatives = {
                new SalesRepresentative("Sales Guy 1", 10, 500),
                new SalesRepresentative("Sales Guy 2", 7, 800),
                new SalesRepresentative("Sales Guy 3", 5, 1000),
                new SalesRepresentative("Sales Guy 4", 8, 700)
        };

        BubbleSortExample sorter = new BubbleSortExample();
        SalesRepresentative[] sortedRepresentatives = sorter.sort(representatives);

        // Printing the sorted representatives
        for (SalesRepresentative rep : sortedRepresentatives) {
            System.out.println(rep);
        }
    }

    public SalesRepresentative[] sort(SalesRepresentative[] representatives) {
        int n = representatives.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare the revenue generated for two SalesRepresentatives
                if (representatives[j].getRevenue() < representatives[j + 1].getRevenue()) {
                    // Swap the SalesRepresentatives if the revenue is in descending order
                    SalesRepresentative temp = representatives[j];
                    representatives[j] = representatives[j + 1];
                    representatives[j + 1] = temp;
                }
            }
        }

        return representatives;
    }
}

