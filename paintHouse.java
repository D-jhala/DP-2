// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes


class paintHouse {
       public int minCost(int[][] costs) {
        if(costs==null || costs.length==0){
            return 0;
        }
        int n=costs.length; //n=3, rows are 0,1,2 of array, 2nd last = row 1 = n-2
        for(int i=n-2;i>=0;i--){
            costs[i][0]=costs[i][0]+Math.min(costs[i+1][1],costs[i+1][2]);
            costs[i][1]=costs[i][1]+Math.min(costs[i+1][0],costs[i+1][2]);
            costs[i][2]=costs[i][2]+Math.min(costs[i+1][0],costs[i+1][1]);
        }
        return Math.min(costs[0][0],Math.min(costs[0][1],costs[0][2]));
    }

    public static void main(String[] args) {
    paintHouse rs = new paintHouse();
    int[][] arr = {
    {17, 2, 17},
    {16, 16, 5},
    {14, 3, 19}
    };
    int[][] arr2 = {
    {7,6,2}
    };
    System.out.println(rs.minCost(arr));  // ans = 10
    System.out.println(rs.minCost(arr2));  // ans = 2
}

}