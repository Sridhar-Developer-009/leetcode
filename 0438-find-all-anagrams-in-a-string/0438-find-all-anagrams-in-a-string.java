class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list=new ArrayList<>();
        int k=p.length();//window size;
        int i=0;
        int j=0;
         //what we need?
         // we need if match found then add start index to list
         HashMap<Character,Integer> map=new HashMap<>();

         for(int x=0;x<k;x++){
            char ch=p.charAt(x);
            map.put(ch,map.getOrDefault(ch,0)+1);
         }
         int count = map.size();

         while(j<s.length()){
            //j traversal addition
            char ch=s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    count--;
                }
            }
        //window cases
        if(j-i+1<k){
            j++;
        }
        else if(j-i+1 == k){
            if(count==0){
                list.add(i);
            }    char leftch=s.charAt(i);
            if(map.containsKey(leftch)){
                map.put(leftch,map.get(leftch)+1);
                if(map.get(leftch)==1){
                    count++;
                }
            }
                i++;
                j++;
        }
  

      
         }
return list;
        
    }
}