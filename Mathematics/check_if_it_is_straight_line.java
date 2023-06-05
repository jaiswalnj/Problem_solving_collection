package Mathematics;

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates!= null && coordinates.length <3) return true;
        int dif1= coordinates[0][0]-coordinates[1][0];
        int dif2= coordinates[0][1]-coordinates[1][1];
        for(int i=1;i<coordinates.length;i++){
            if(dif2*(coordinates[i][0]-coordinates[0][0]) != dif1*(coordinates[i][1]-coordinates[0][1])) return false;
        }
        return true;
    }
}