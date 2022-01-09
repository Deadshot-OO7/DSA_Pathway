'''
Method
void counter(int n){
   for(int i = 0 ; i < n ; i++){
      for(int j = 1 ; j<n ; j += i ){
         cout<<i<<” ”<<j;
      }
      cout<<endl;
   }
}
The above method will run n/I times for all values of i. i.e. n times for the first iteration and 1 time for the last iteration.

According to this, the total time complexity is

(n/1 + n/2 + n/3 + …. + n/n)
= n (1/1 + ½ + ⅓ + …. 1/n)
Now the value of (1/1 + ½ + ⅓ + …. 1/n) is equal to O(log n).

The time complexity of this code is O(nlogn).

Method
void counter(n){
   int i , j ;
   for(int i = 1 ; i <= n ; i++){
      for(j = 1; j <= log(i) ; j++){
         cout<<i<<” ”<<j;
      }
   }
}
The total complexity of the function is O(log 1) + O(log 2) + O(log 3) + …. + O(log n) 
which is O(log n!).
'''