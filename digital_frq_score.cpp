/*You are given an integer n.

The score of n is defined as the sum of d * freq(d) over all distinct digits d, where freq(d) denotes the number of times the digit d appears in n.

Return an integer denoting the score of n.

 

Example 1:

Input: n = 122

Output: 5

Explanation:

The digit 1 appears 1 time, contributing 1 * 1 = 1.
The digit 2 appears 2 times, contributing 2 * 2 = 4.
Thus, the score of n is 1 + 4 = 5*/

#include <iostream>
#include <vector>

using namespace std;

int digitFrequencyScore(int n) {
    vector<int> arr(10, 0);

    if (n == 0) {
        arr[0] = 1;
    } else {
        while (n != 0) {
            arr[n % 10]++;
            n /= 10;
        }
    }

    int sum = 0;
    for (int i = 0; i < 10; i++) {
        sum += i * arr[i];
    }

    return sum;
}

int main() {
    int n;
    if (cin >> n) {
        cout << digitFrequencyScore(n) << endl;
    }
    return 0;
}