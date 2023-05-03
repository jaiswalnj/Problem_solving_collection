package Array;

import java.util.*;

class Solution {
    public List<Integer> getlist(int[] nums1,int[] nums2){
        HashSet n1= new HashSet<>();
        HashSet n2= new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            n1.add(nums2[i]);
        }
        for(int num: nums1){
            if(!n1.contains(num)){
                n2.add(num);
            }
        }
        return new ArrayList<>(n2);
    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getlist(nums1,nums2),getlist(nums2,nums1));
    }
}