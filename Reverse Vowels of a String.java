class Solution {
    public String reverseVowels(String s) {
        Stack<Character>  s1= new Stack<Character>();
        String s2="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                s1.push(ch);
            }
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                s2=s2+s1.pop();
            }
            else
            s2=s2+ch;
        }
        return s2;
    }
}
