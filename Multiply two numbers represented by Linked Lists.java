

/*Node is defined as
class Node
{
    int data; 
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}*/

class GfG{
  /*You are required to complete this method */
   public long multiplyTwoLists(Node l1,Node l2){
          //add code here.
          long a=0,b=0;
          while(l1!=null)
          {
              a=((a*10) % 1000000007)+l1.data;
              l1=l1.next;
          }
          while(l2!=null)
          {
              b=((b*10) % 1000000007)+l2.data;
              l2=l2.next;
          }
          return ((a % 1000000007)*(b % 1000000007)) % 1000000007;
   }
}
