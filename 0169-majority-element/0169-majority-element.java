class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        int a=0;
        int majority=0;
        for(int num:nums){
            hash.put(num,1+hash.getOrDefault(num,0));
            if(hash.get(num)>majority){
                a=num;majority=hash.get(num);
            }
        }
        return a;
    }
}