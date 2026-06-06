#include <iostream>
#include <vector>
#include <unordered_map>

class Solution {
public:
    auto twoSum(std::vector<int>& nums, int target) {
        std::unordered_map<int, int> map;

        for (int i = 0; i < nums.size(); i++) {
            int need = target - nums[i];

            if (map.find(need) != map.end()) {
                return std::vector<int>{map[need], i};
            }
            map[nums[i]] = i;
        }
        
        return std::vector<int>{-1, -1};
    }
};

int main() {
    int size;
    std::cout << "Enter the number of elements in the array: ";
    std::cin >> size;

    std::vector<int> nums(size);
    std::cout << "Enter " << size << " numbers: ";
    for (int i = 0; i < size; i++) {
        std::cin >> nums[i];
    }

    int target;
    std::cout << "Enter the target sum: ";
    std::cin >> target;

    Solution solution;
    auto result = solution.twoSum(nums, target);

    std::cout << "Indices: [" << result[0] << ", " << result[1] << "]" << std::endl;

    return 0;
}