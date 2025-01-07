class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curr_gas = 0, start = 0,tot_gas=0,tot_cost=0;

        for (int i = 0; i < gas.length; i++) {
            curr_gas += gas[i] - cost[i];
            tot_gas+=gas[i];
            tot_cost+=cost[i];
            if (curr_gas < 0) {
                start = i + 1;
                curr_gas = 0;
            }
        }
        if (tot_gas >= tot_cost)
            return start;
        else
            return -1;

    }
}