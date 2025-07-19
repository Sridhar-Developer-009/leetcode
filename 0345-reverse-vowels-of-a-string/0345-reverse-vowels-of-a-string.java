class Solution {
    public String reverseVowels(String s) {
        String input1=s;
        String vowels ="AaEeIiOoUu";
        StringBuilder input = new StringBuilder(input1);
    int l=0;
    int r=input.length()-1;

    char temp='a';
    while(l<r){
        char chl=input.charAt(l);
        char chr=input.charAt(r);
        boolean a = vowels.contains(String.valueOf(chl));
        boolean b = vowels.contains(String.valueOf(chr));

        if(a && b){
            //swap
            temp=chl;

            input.setCharAt(l,chr);
            input.setCharAt(r,temp);
            l++;
            r--;
        }
        else if(a){
            r--;
        }else if(b){
            l++;
        }
        else {
            l++;
            r--;
        }

    }
       input1=  input.toString();
        return input1;
    }
}