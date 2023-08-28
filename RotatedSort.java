public class RotatedSort{
    public static int Search(int array[],int target,int si,int ei){
        if(si>ei){
            return -1;
        }
        //Case Found
        int mid = si + (ei-si)/2;       //(si+ei)/2
        if(array[mid]==target){
            return mid;
        }
        //mid on L1
        if(array[si]<= array[mid]){
            //Case A : Left
            if(array[si] <= target && target <= array[mid]){
                return Search(array, target, si, mid-1);
            }else{
                return Search(array, target, mid+1, ei);
            }
        }
        //mid on L2
        else {
            if(array[mid] <= target && target <= array[ei]){
                return Search(array, target, mid+1, ei);
                }else{
                    return Search(array, target, si, mid-1);
                }
            }
    }

    public static void main(String[] args) {
        int array[] = {4,5,6,7,0,1,2};
        int target = 0;   
        int TarIdx = Search(array, target,0,array.length-1);
        System.out.println(TarIdx);
    }
}