    public static int removeDuplicates(int[] A) {
        int index = 2;
        for (int i = 2; i < A.length; i++) {
            if (A[i] != A[index - 2])
                A[index++] = A[i];
        }
        return index;
    }
