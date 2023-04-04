class Solution {
    public int partitionString(String s) {
        int l=s.length();
        char[] arr = s.toCharArray();
        int count=0;
        List<Character> a=new ArrayList<>();
        for(int i=0;i<l;i++){
            if(a.contains(arr[i])){
                count+=1;
                a.removeAll(a);
                a.add(arr[i]);
            }
            else{
                a.add(arr[i]);
            }
        }
        count+=1;
        return count;
    }
}