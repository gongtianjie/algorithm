package learn;


/**
 *  LC 88
 * 
 * 给你两个有序整数数组[]nums1 和 nums2，请你将 nums2 合并到[]nums1[]中，使 nums1 成为一个有序数组。
 *
 * 初始化[]nums1 和 nums2 的元素数量分别为[]m 和 n 。你可以假设[]nums1 的空间大小等于[]m + n，
 * 这样它就有足够的空间保存来自 nums2 的元素。
 *
 */
public class MerGeTwoArray {
    public static void main(String[] args) {

       int[] nums1= {1,2,3,0,0,0};
        int m=3;
        int[] nums2= {2,5,6};
        int n=3;
        merge(nums1,m,nums2,n);
        for (int num:
             nums1) {
            System.out.println(num);
        }


    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int i=m-1; //nums1
        int j=n-1; //nums2
        for (int k = m+n-1; k >=0  ; k--) {
            //选取nums1中的数据
            if(j<0||(i>=0&& (nums1[i] > nums2[j]))){
                nums1[k]=nums1[i];
                i--;
            }else{
                nums1[k]=nums2[j];
                j--;
            }
        }
    }
}


