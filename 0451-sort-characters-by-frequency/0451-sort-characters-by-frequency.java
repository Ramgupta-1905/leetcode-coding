class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else
                map.put(s.charAt(i),1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );
        for(char ch : map.keySet()) {
            pq.offer(ch);
        }
    StringBuilder sb = new StringBuilder();
    while(!pq.isEmpty()){
        char ch = pq.poll();
        sb.append(String.valueOf(ch).repeat(map.get(ch)));
    }
    return sb.toString();
    }
}