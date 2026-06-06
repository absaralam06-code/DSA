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

class Solution {
public:
    int digitFrequencyScore(int n) {
        vector<int> freq(10, 0);

        if (n == 0) {
            return 0;
        }

        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }

        int score = 0;
        for (int digit = 0; digit < 10; digit++) {
            score += digit * freq[digit];
        }

        return score;
    }
};

int main() {
    Solution solver;
    int testNumber = 122;
    cout << solver.digitFrequencyScore(testNumber) << endl;
    return 0;
}