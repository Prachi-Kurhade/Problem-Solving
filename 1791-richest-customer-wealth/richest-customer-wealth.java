class Solution {
    public int maximumWealth(int[][] accounts) {

        int results[]= new int[accounts.length];
         int maxno=0;

        for(int i=0; i < accounts.length;i++)
        {
            for(int j=0; j < accounts[i].length;j++)
            {
                 results[i] = results[i] +accounts[i][j];
            }
        }

        for(int k=0; k<accounts.length; k++)
        {
            if(results[k]>maxno)
            {
                maxno= results[k];
            }
        }
        return maxno;
    }
}