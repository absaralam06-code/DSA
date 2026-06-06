/*Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:*/

#include <iostream>
#include <vector>

using namespace std;

vector<int> generateRow(int Row) {
    long long ans = 1;
    vector<int> ansRow;
    ansRow.push_back(1);
    for (int col = 1; col < Row; col++) {
        ans = ans * (Row - col);
        ans = ans / col;
        ansRow.push_back(ans);
    }
    return ansRow;
}

vector<vector<int>> generate(int numRows) {
    vector<vector<int>> ans;
    for (int i = 1; i <= numRows; i++) {
        ans.push_back(generateRow(i));
    }
    return ans;
}

int main() {
    int numRows;
    if (cin >> numRows) {
        vector<vector<int>> pascalTriangle = generate(numRows);
        
        for (const auto& row : pascalTriangle) {
            for (int val : row) {
                cout << val << " ";
            }
            cout << endl;
        }
    }
    return 0;
}