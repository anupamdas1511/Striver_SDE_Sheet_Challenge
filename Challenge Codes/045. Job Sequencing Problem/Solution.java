import java.util.* ;
import java.io.*; 
public class Solution
{
    static class Job {
        int id, profit, deadline;
        Job(int x, int y, int z){
            this.id = x;
            this.deadline = y;
            this.profit = z; 
        }
    }
    public static int jobScheduling(int[][] jobs)
    {
        // Write your code here
        Job[] arr = new Job[jobs.length];
        for (int i=0;i<jobs.length;i++) {
            arr[i] = new Job(i, jobs[i][0], jobs[i][1]);
        }
        int profit = 0, n = arr.length;
        
        Arrays.sort(arr, Comparator.comparingInt(a -> a.deadline));
        PriorityQueue<Job> pq = new PriorityQueue<>(Comparator.comparingInt(a -> -a.profit));
        
        for (int i=n-1;i>=0;i--) {
            int slots;
            if (i == 0)
                slots = arr[i].deadline;
            else
                slots = arr[i].deadline - arr[i-1].deadline;
            
            pq.add(arr[i]);
            while (slots > 0 && !pq.isEmpty()) {
                Job job = pq.poll();
                slots--;
                profit += job.profit;
            }
        }
        return profit;
    }
}
