class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int length = chalk.length;
        int i = 0;
        
        long total = 0;
        for (int c : chalk) total += c;

        k = (int)(k % total);
        if(chalk.length == 1 ) return 0;

        while (k > 0) {
            if (k >= chalk[i]) {
                k -= chalk[i];
            } else {
                break;
            }
            i = (i+1) % length;
        }

        return i;
    }
}