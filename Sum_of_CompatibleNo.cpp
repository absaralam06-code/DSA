/*You are given two integers n and k.

A positive integer x is called compatible if it satisfies both of the following conditions:

abs(n - x) <= k
(n & x) == 0
Return the sum of all compatible integers x.

Note:

Here, & denotes the bitwise AND operator.
The absolute difference between integers i and j is defined as abs(i - j).

Input: n = 2, k = 3

Output: 10

Explanation:

The compatible integers are:

x = 1, since abs(2 - 1) = 1 and 2 & 1 = 0.
x = 4, since abs(2 - 4) = 2 and 2 & 4 = 0.
x = 5, since abs(2 - 5) = 3 and 2 & 5 = 0.
Thus, the answer is 1 + 4 + 5 = 10.*/

#include <iostream>
#include <vector>
using namespace std;
int sumOfGoodInteger(int n , int k){
    int sum = 0;
    for(int x = 1 ; x <= n+k ; x++){
        int num = abs(n-x);
        if(num<=k){
            if((n&x)==0){
                sum += x;
            }
        }
    }
    return sum;
}
int main(){
    int n , k;
    cout<<"Enter the value of n : ";
    cin>>n;
    cout<<"Enter the value of k : ";
    cin>>k;
    int sum = sumOfGoodInteger(n,k);
    cout<<"sum = "<<sum;
    return 0;
}