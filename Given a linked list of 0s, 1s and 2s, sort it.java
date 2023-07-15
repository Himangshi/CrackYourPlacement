class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        if(head == null || head.next == null) return head;
        
        int a = 0;
        int b = 0;
        int c = 0;
        
        Node temp1 = head;
        while(temp1 != null){
            if(temp1.data == 0){
                a++;
            }
            if(temp1.data == 1){
                b++;
            }
            if(temp1.data == 2){
                c++;
            }
            temp1 = temp1.next;
        }
        
        Node temp=head;
        while(a!=0)
        {
            temp.data=0;
            temp=temp.next;
            a--;
        }
        while(b!=0)
        {
            temp.data=1;
            temp=temp.next;
            b--;
        }
        while(c!=0)
        {
            temp.data=2;
            temp=temp.next;
            c--;
        }
        
        return head;
    }
}
