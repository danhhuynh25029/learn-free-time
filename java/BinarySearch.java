class BinarySearch{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		boolean r = find(arr,3);
		System.out.println(r);
	}
	public static boolean find(int[] arr,int k){
		int l = 0;
		int r = arr.length;
		while(l < r){
			int m = (l+r)/2;
			if(arr[m] == k) return true;
			if(arr[m] > k) r = m - 1;
			else l = m + 1;

		}
		return false;
	}
}
