class ChocolateDistribution {

    public static int minDifference(int[] packets, int m) {
        if (m == 0 || packets.length == 0)
            return 0;
        
        if (m > packets.length)
            return -1; // Not enough packets to distribute
        
        Arrays.sort(packets); // Sort the packets in ascending order
        
        int minDifference = Integer.MAX_VALUE;
        int n = packets.length;

        for (int i = 0; i + m - 1 < n; i++) {
            int diff = packets[i + m - 1] - packets[i];
            if (diff < minDifference) {
                minDifference = diff;
            }
        }
        
        return minDifference;
    }
