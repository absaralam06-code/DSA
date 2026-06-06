#include <iostream>
using namespace std;

int main() {
    int arr[100], n;
    int swapcount = 0, compcount = 0;

    cout << "Enter the size of array : ";
    cin >> n;

    cout << "Enter array elements : ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }


    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;

        while (j >= 0 && arr[j] > key) {
            compcount++;            
            arr[j + 1] = arr[j];    
            swapcount++;
            j--;
        }

        if (j >= 0)
            compcount++;

        arr[j + 1] = key;
    }

    cout << "Array after sorting : ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }

    cout << "\nSwap count : " << swapcount;
    cout << "\nComparison count : " << compcount;

    return 0;
}