// Java program to calculate all multiples
// of integer 'k' in array[]
class Main{
	// ans is global array so that both
	// countSieve() and countMultiples()
	// can access it.
	static int ans[];

	// Function to pre-calculate all
	// multiples of array elements
	static void countSieve(int arr[], int n)
	{
		int MAX = arr[0];
		for (int i = 1; i < n; i++)
			MAX = Math.max(arr[i], MAX);

		int cnt[] = new int[MAX + 1];

		// ans is global array so that
		// query function can access it.
		ans = new int[MAX + 1];

		// Store the arr[] elements as
		// index in cnt[] array
		for (int i = 0; i < n; ++i)
			++cnt[arr[i]];

		// Iterate over all multiples as 'i'
		// and keep the count of array[]
		// (In cnt[] array) elements in ans[]
		// array
		for (int i = 1; i <= MAX; ++i)
			for (int j = i; j <= MAX; j += i)
				ans[i] += cnt[j];
		return;
	}

	static int countMultiples(int k)
	{
		// return pre-calculated result
		return ans[k];
	}

	// Driver code
	public static void main(String args[])
	{
	int arr[] =  {1,2,8,9,12,46,76,82,15,20,30};
		int n = 11;

		// pre-calculate all multiples
		countSieve(arr, n);

		int k = 1;
		System.out.println(countMultiples(k));
        k = 2;
		System.out.println(countMultiples(k));
        k = 3;
		System.out.println(countMultiples(k));
        k = 4;
		System.out.println(countMultiples(k));
        k = 5;
		System.out.println(countMultiples(k));
        k = 6;
		System.out.println(countMultiples(k));
		k = 7;
		System.out.println(countMultiples(k));
        k = 8;
		System.out.println(countMultiples(k));
		k = 9;
		System.out.println(countMultiples(k));

	}
}


