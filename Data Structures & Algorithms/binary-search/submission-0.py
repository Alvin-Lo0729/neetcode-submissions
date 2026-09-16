class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left=0
        right=len(nums)-1
        index=-1
        while left<=right:
            mid=(left+right)//2
            if (list_v := nums[mid]) == target:
                index=mid
                break
            elif list_v>target:
                right=mid-1
            else:
                left=mid+1
        return index