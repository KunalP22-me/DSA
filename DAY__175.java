//Subset Sums GFG
class Solution {
	public ArrayList<Integer> subsetSums(int[] arr) {
		ArrayList<Integer> res = new ArrayList<>();
		
		fc(0, 0, arr, res);
		Collections.sort(res);
		
		return res;
	}
	
	private void fc(int p, int sum, int[] arr, ArrayList<Integer> res) {
		if (p == arr.length) {
			res.add(sum);
			return;
		}
		
		fc(p + 1, sum + arr[p], arr, res);
		fc(p + 1, sum, arr, res);
	}
}
