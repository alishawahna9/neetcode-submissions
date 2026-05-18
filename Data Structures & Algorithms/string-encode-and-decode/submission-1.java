class Solution {

    public String encode(List<String> strs) {
        StringBuilder str= new StringBuilder();
        for(int i=0;i<strs.size();i++){
            str.append(strs.get(i).length());
            str.append("#");
            str.append(strs.get(i));
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> list=new ArrayList<>();
        int i=0;

        while(i<str.length()){
            StringBuilder strnew= new StringBuilder();
            int length=0;
            while(str.charAt(i)!='#'){
                length=length*10+(str.charAt(i)-'0');
                i++;
            }
            i++;
            int count=0;
            while(count<length){
                strnew.append(str.charAt(i));
                i++;
                count++;
            }
            list.add(strnew.toString());
        }

        return list;
    }
}
