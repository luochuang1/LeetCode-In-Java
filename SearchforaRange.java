
public class SearchforaRange {
	public static int[] searchRange(int[] A, int target) {
		int start, end, mid;
		int[] bound = new int[2];

		// search for left bound
		start = 0;
		end = A.length - 1;
		while (start + 1 < end) {
			mid = start + (end - start) / 2;
			if (A[mid] == target) {
				end = mid;
			} else if (A[mid] < target) {
				start = mid;
			} else {
				end = mid;
			}
		}
		if (A[start] == target) {
			bound[0] = start;
		} else if (A[end] == target) {
			bound[0] = end;
		} else {
			bound[0] = bound[1] = -1;
			return bound;
		}

		// search for right bound
		start = 0;
		end = A.length - 1;
		while (start + 1 < end) {
			mid = start + (end - start) / 2;
			if (A[mid] == target) {
				end = mid;
			} else if (A[mid] < target) {
				start = mid;
			} else {
				end = mid;
			}
		}
		if (A[end] == target) {
			bound[1] = end;
		} else if (A[start] == target) {
			bound[1] = start;
		} else {
			bound[0] = bound[1] = -1;
			return bound;
		}

		return bound;
	}
}
