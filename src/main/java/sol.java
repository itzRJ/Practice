package main.java;
//1 1 2 3 2 1 1 5 1
public class sol {
    public static void main(String[] args){
        sol s = new sol();
//        LinkedList l = new LinkedList(1);
//        LinkedList a = new LinkedList(1);
//        LinkedList b = new LinkedList(2);
//        LinkedList c = new LinkedList(3);
//        LinkedList d = new LinkedList(1);
//        LinkedList e = new LinkedList(1);
//        LinkedList f = new LinkedList(5);
//        LinkedList g = new LinkedList(1);
//        l.next = a;
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = f;
//        f.next = g;
//        LinkedList cur = l;
//        while(cur != null)
//        {
//            System.out.print(cur.val + " ");
//            cur = cur.next;
//        }
//        System.out.println();
//        LinkedList head = s.solve(l, 1);
//        cur = head;
//        while(cur != null)
//        {
//            System.out.print(cur.val + " ");
//            cur = cur.next;
//        }
        int[] ar = {1,1,1,1,1};
        System.out.println(s.solve(ar));

    }
    LinkedList solve(LinkedList head, int element) {
//        while(head.val == element)
////            head = head.next;
        LinkedList dummyHead = new LinkedList(-1);
        dummyHead.next = head;
        LinkedList cur = dummyHead.next;
        LinkedList prev = dummyHead;
        while(cur != null)
        {
            if(cur.val == element)
            {
                prev.next = cur.next;
                cur = prev.next;
            }
            else
            {
                cur = cur.next;
                prev = prev.next;
            }
        }
        return dummyHead.next;
    }

    int solve(int[] ar){
        int max1 = Integer.MIN_VALUE;
        int max2 = max1;
        for(int i:ar)
        {
            if(i>max1)
                max1 = i;
        }
        for(int i:ar)
        {
            if(i>max2)
            {
                if(i<=max1)
                    max2 = i;
            }
        }
        return max2;
    }
}



