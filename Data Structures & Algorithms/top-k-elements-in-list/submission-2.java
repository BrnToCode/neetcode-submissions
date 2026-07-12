class Pair{
    int value;
    int freq;

    Pair(int value,int freq){
        this.value=value;
        this.freq=freq;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> pq=new PriorityQueue<>(
            (a,b)->a.freq-b.freq
        );

        HashMap<Integer,Integer> freq=new HashMap<>();

        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        for(var i:freq.entrySet()){
            pq.add(new Pair(i.getKey(),i.getValue()));

            if(pq.size()>k){
                pq.poll();
            }
        }

        int[] res=new int[pq.size()];
        int i=0;
        while(!pq.isEmpty()){
            res[i++]=pq.poll().value;
        }
        return res;
    }
}
