class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < tickets.length; i++) {
            queue.offer(i);
        }

        int time = 0;

        while (!queue.isEmpty()) {
            int ind = queue.poll();

            tickets[ind]--;
            time++;

            if (ind == k && tickets[ind] == 0) {
                break;
            }

            if (tickets[ind] > 0) {
                queue.offer(ind);
            }
        }

        return time;
    }
}