'''

Example 1
Find the time complexity of the following code snippets

for(i= 0 ; i < n; i++){
   cout<< i << " " ;
   i++;
}
The loop has maximum value n but the i will be incremented twice in the for loop which will make the time take half. So the time complexity is O(n/2) which is equivalent to O(n).
------------------------------------------------------------------------------------------------
Example 2
Find the time complexity of the following code snippets

for(i= 0 ; i < n; i++){
   for(j = 0; j<n ;j++){
      cout<< i << " ";
   }
}
The inner loop and the outer loop both are executing n times. So for single value of i, j is looping n times, for n values of i, j will loop total n*n = n 2 times. So the time complexity is O(n 2 ).
------------------------------------------------------------------------------------------------
Example 3
Find the time complexity of the following code snippets

int i = n;
while(i){
   cout << i << " ";
   i = i/2;
}
In this case, after each iteration the value of i is turned into half of its previous value. So the series will be like: . So the time complexity is O(log n).
------------------------------------------------------------------------------------------------
Example 4
Find the time complexity of the following code snippets

if(i > j ){
   j>23 ? cout<<j : cout<<i;
}
There are two conditional statements in the code. Each conditional statement has time complexity = O(1), for two of them it is O(2) which is equivalent to O(1) which is constant.
------------------------------------------------------------------------------------------------
Example 5
Find the time complexity of the following code snippets

for(i= 0; i < n; i++){
   for(j = 1; j < n; j = j*2){
      cout << i << " ";
   }
}
The inner loop is executing (log n) times where the outer is executing n times. So for single value of i, j is executing (log n) times, for n values of i, j will loop total n*(log n) = (n log n) times. So the time complexity is O(n log n).

'''