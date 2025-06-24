public class MaximumPopulationyear1854 {
    public static void main(String[] args) {
        int[][] logs ={{1993,1999},{2000,2010}};
        int maxYear = 1950;
        int maxPeople = 0;

        for (int year = 1950; year <= 2050; year++) {
            int count = 0;

            for (int[] log : logs) {
                int birth = log[0];
                int death = log[1];

                if (year >= birth && year < death) {
                    count++;
                }
            }

            if (count > maxPeople) {
                maxPeople = count;
                maxYear = year;
            }
        }

        System.out.println(maxYear);

    }
}
