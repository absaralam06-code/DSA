#include <iostream>
#include <climits>

using namespace std;

auto reverse(int x) -> int {
    long long temp = x;
    int rem = 0, rev = 0;
    
    if (x < 0) {
        temp = temp * -1;
    }
    
    while (temp != 0) {
        rem = temp % 10;
        
        if (rev > INT_MAX / 10 || (rev == INT_MAX / 10 && rem > 7)) {
            return 0;
        }
        
        rev = (rev * 10) + rem;
        temp = temp / 10;
    }
    
    if (x < 0) {
        return -rev;
    }
    
    return rev;
}

int main() {
    int num;
    cout << "Enter an integer to reverse: ";
    cin >> num;

    int result = reverse(num);
    cout << "Reversed integer: " << result << endl;

    return 0;
}