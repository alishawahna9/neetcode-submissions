class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();

        for(Integer num:nums){
            int temp=0;
            if(map.containsKey(num)){
                temp=map.get(num);
            }
            map.put(num,temp+1);
        }

        List<Integer>[] counter=new ArrayList[nums.length+1];
        int[] result=new int[k];
        
        for(Integer key:map.keySet()){
            if(counter[map.get(key)]==null){
                counter[map.get(key)]=new ArrayList<>();
            }
            counter[map.get(key)].add(key);
        }
        int t=0;
        int tar=0;
        for(int i=nums.length;i>0;i--){
            if(counter[i]!=null){
                if(tar>=k){
                    break;
                }
                for(Integer num:counter[i]){
                    result[t]=num;
                    tar++;
                    t++;  
                }
            }
        }
        return result;
    }
}
