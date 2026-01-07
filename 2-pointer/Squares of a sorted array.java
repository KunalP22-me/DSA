//Problem 977 Leetcode

class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for(int i =0; i<nums.length; i++){
            if(nums[i]>=0){
                b.add(nums[i]);
            } else{
                a.add(nums[i]);
            }
        }

        if(a.size()==0){
            for(int i =0; i<b.size(); i++){
                b.set(i,b.get(i)*b.get(i));
            }
            return b.stream().mapToInt(Integer::intValue).toArray();
        }
        if(b.size()==0){
            for(int i =0; i<a.size(); i++){
                a.set(i,a.get(i)*a.get(i));
                }

                //use two pointer reverse method
                 int left = 0;
                 int right = a.size() - 1;
                while (left < right) {
                    int temp = a.get(left);
                    a.set(left, a.get(right));
                    a.set(right, temp);
                    left++;
                    right--;
            }
            return a.stream().mapToInt(Integer::intValue).toArray();
        }

        int n =a.size();
        int m =b.size();

        int[] res = new int[n+m];

        for(int i =0; i<a.size(); i++){
                a.set(i,a.get(i)*a.get(i));
                }

                //use two pointer reverse method
                 int left = 0;
                 int right = a.size() - 1;
                while (left < right) {
                    int temp = a.get(left);
                    a.set(left, a.get(right));
                    a.set(right, temp);
                    left++;
                    right--;
            }
        
        for(int i =0; i<b.size(); i++){
                b.set(i,b.get(i)*b.get(i));
            }

        int id=0;
        int i =0;
        int j =0;
        while(i<n && j<m){
            if(a.get(i)<=b.get(j)){
                res[id]=a.get(i);
                id++;
                i++;
            }
            else {
                res[id]=b.get(j);
                id++;
                j++;
            }
        }
        while(j<m){
            res[id]=b.get(j);
            id++;
            j++;
        }
        while(i<n){
            res[id]=a.get(i);
            id++;
            i++;
        }
        return res;
    }
}
