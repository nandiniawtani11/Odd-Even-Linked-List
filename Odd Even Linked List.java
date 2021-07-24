/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode heado=null,tailo=null;
    ListNode heade=null,taile=null;
    public int lenght(ListNode s)
    {
        if(s==null)
        {
            return 0;
        }
        int count=0;
        ListNode current=s;
        while(current!=null)
        {
            count++;
            current=current.next;
        }
        return count;
    }   
    public void inserto(int n){
        
        if(heado==null && tailo==null){
            heado=new ListNode(n);
            tailo=heado;
        }
        else{
            ListNode x=new ListNode(n);
            tailo.next=x;
            tailo=x;
        }
    }
     public void inserte(int n){
        
        if(heade==null && taile==null){
            heade=new ListNode(n);
            taile=heade;
        }
        else{
            ListNode x=new ListNode(n);
            taile.next=x;
            taile=x;
        }
    }
    
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
        {
            return null;
        }
        ListNode current=head;
        int i=1;
        int l=lenght(head);
        while(i<=l)
        {
            if(i%2!=0)
            {
                inserto(current.val);
            }
            else
            {
                inserte(current.val);
            }
            current=current.next;
            i++;
            
        }
        ListNode temp=heado;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=heade;
        return heado;             
    }
}
