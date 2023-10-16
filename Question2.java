//Q2: How to Swap two numbers without using a third variable in Java?


//User function Template for Java

class Solution{
    static List<Integer> get(int a,int b)
    {
        a = a+b;
        b = a-b;
        a = a-b;
        List<Integer> list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        return list;
        
    }
}
