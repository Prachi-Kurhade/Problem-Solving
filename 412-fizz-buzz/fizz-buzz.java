class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> myList = new ArrayList<>(n);
        //int arr[]= new int[n];
        String a = "Fizz";
        String b = "Buzz";
        String c = "FizzBuzz" ;
        for(int i=1; i<=n; i++)
        {
            if(i%3==0 && i%5==0)
            {
              myList.add(c);
            }
            else if(i%5==0)
            {
                myList.add(b);
            }
            else if(i%3 == 0)
            {
                
                myList.add(a);
            }
            else
            {
                myList.add(Integer.toString(i));
            }

        }
        return myList;
        
    }
}