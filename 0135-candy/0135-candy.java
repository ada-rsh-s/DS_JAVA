class Solution {
    public int candy(int[] ratings) {
        int length=ratings.length;
        int[] candy =new int[length];
        Arrays.fill(candy,1);

        for(int i=1;i<length;i++){
            if(ratings[i]>ratings[i-1]){
                candy[i]=candy[i-1]+1;
            }
        }
        for(int i=length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1] && candy[i]<=candy[i+1]){
                candy[i]=candy[i+1]+1;
            }
        }
      
        int total=0;
        for(int i=0;i<length;i++){
            total+=candy[i];
        }
        return total;
    }
}