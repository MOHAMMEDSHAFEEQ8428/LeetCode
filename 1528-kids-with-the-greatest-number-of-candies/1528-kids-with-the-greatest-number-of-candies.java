class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(max<candies[i])max=candies[i];
        }
        for(int i=0;i<candies.length;i++){
            candies[i]=candies[i]+extraCandies;
            if(candies[i]>=max)result.add(true);
            else{
                result.add(false);
            }
        }
        return result;

    }
}