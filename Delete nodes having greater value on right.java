class Solution
{
    Node compute(Node head)
    {
        // your code here
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.data<temp.next.data)
            {
              temp.data=temp.next.data;
              temp.next=temp.next.next;
              temp=head;
              
            }
            else  temp=temp.next;
        }
        return head;
    }
}
  
