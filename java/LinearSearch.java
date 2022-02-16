class LinearSearch{
	public static void main(String[] args){
		int[] arr = {2,3,1,9,10};
		for(int i = 0 ; i < arr.length ; i++){
			for(int j  = i + 1 ; j < arr.length ; j++){
				if(arr[j] < arr[i]){
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
