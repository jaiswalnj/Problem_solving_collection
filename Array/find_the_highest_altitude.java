package Array;
class Solution {
    public int largestAltitude(int[] gain) {
        int cur=0,highest=0;
        for(int i=0;i<gain.length;i++){
            cur=cur+gain[i];
            if(cur>highest) highest=cur;
        }
        return highest;
    }
}