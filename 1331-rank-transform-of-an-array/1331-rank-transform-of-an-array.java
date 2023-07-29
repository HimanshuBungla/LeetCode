class Solution {
    public  int [] arrayRankTransform( int [] arr) {
        int [] sort = arr. clone();
        Arrays. sort(sort);
        HashMap<Integer, Integer> a = new HashMap<> ();
        for ( int i =0 ;i<sort.length;i++) {
            int num = sort[i];
            a.putIfAbsent(num, a.size() + 1 );
        }
        for ( int i = 0; i < arr.length; i++ ) {
            arr[ i] =a.get(arr[i]);
        }
        return arr;
    }
}