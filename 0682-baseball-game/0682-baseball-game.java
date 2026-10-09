class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<operations.length;i++){
            if(operations[i].equals("C") && list.size()>0){
                list.remove(list.size()-1);
            }
            else if(operations[i].equals("D") && list.size()>0)
                list.add(2*list.get(list.size()-1));
            else if(operations[i].equals("+") && list.size()>1)
                list.add(list.get(list.size()-1)+list.get(list.size()-2));
            else
                list.add(Integer.parseInt(operations[i]));
        }
        int res =0;
        for(int x: list)
            res+=x;
        return res;
    }
}