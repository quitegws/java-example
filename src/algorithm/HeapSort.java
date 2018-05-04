package algorithm;

public class HeapSort {

    public static void main(String[] args) {
        int[] array = { 19, 38, 7, 36, 5, 5, 3, 2, 1, 0, 56 };

        System.out.println("排序前:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

        System.out.println();
        System.out.println("分割线---------------");

        sort(array);

        System.out.println("排序后:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    public static void heapSort(int[] array) {
        if (array == null || array.length == 1)
            return;

        buildMaxHeap(array); // 第一次排序，构建最大堆，只保证了堆顶元素是数组里最大的

        for (int i = array.length - 1; i >= 1; i--) {
            // 这个是什么意思呢？，经过上面的一些列操作，目前array[0]是当前数组里最大的元素，需要和末尾的元素交换
            // 然后，拿出最大的元素
            swap(array, 0, i);

            // 交换完后，下次遍历的时候，就应该跳过最后一个元素，也就是最大的那个值，然后开始重新构建最大堆
            // 堆的大小就减去1，然后从0的位置开始最大堆
//            maxHeap(array, i, 0);
            minHeap(array, i, 0);
        }
    }

    // 构建堆
    public static void buildMaxHeap(int[] array) {
        if (array == null || array.length == 1)
            return;

        // 堆的公式就是 int root = 2*i, int left = 2*i+1, int right = 2*i+2;
        int cursor = array.length / 2;
        for (int i = cursor; i >= 0; i--) { // 这样for循环下，就可以第一次排序完成
//            maxHeap(array, array.length, i);
            minHeap(array, array.length, i);
        }
    }

    // 最大堆
    public static void maxHeap(int[] array, int heapSieze, int index) {
        int left = index * 2 + 1; // 左子节点
        int right = index * 2 + 2; // 右子节点
        int maxValue = index; // 暂时定在Index的位置就是最大值

        // 如果左子节点的值，比当前最大的值大，就把最大值的位置换成左子节点的位置
        if (left < heapSieze && array[left] > array[maxValue]) {
            maxValue = left;
        }

        // 如果右子节点的值，比当前最大的值大，就把最大值的位置换成右子节点的位置
        if (right < heapSieze && array[right] > array[maxValue]) {
            maxValue = right;
        }

        // 如果不相等，说明啊，这个子节点的值有比自己大的，位置发生了交换了位置
        if (maxValue != index) {
            swap(array, index, maxValue); // 就要交换位置元素

            // 交换完位置后还需要判断子节点是否打破了最大堆的性质。最大堆性质：两个子节点都比父节点小。
            maxHeap(array, heapSieze, maxValue);
        }
    }

    // 最小堆
    public static void minHeap(int[] array, int heapSieze, int index) {
        int left = index * 2 + 1; // 左子节点
        int right = index * 2 + 2; // 右子节点
        int maxValue = index; // 暂时定在Index的位置就是最小值

        // 如果左子节点的值，比当前最小的值小，就把最小值的位置换成左子节点的位置
        if (left < heapSieze && array[left] < array[maxValue]) {
            maxValue = left;
        }

        //  如果右子节点的值，比当前最小的值小，就把最小值的位置换成左子节点的位置
        if (right < heapSieze && array[right] < array[maxValue]) {
            maxValue = right;
        }

        // 如果不相等，说明啊，这个子节点的值有比自己小的，位置发生了交换了位置
        if (maxValue != index) {
            swap(array, index, maxValue); // 就要交换位置元素

            // 交换完位置后还需要判断子节点是否打破了最小堆的性质。最小性质：两个子节点都比父节点大。
            minHeap(array, heapSieze, maxValue);
        }
    }

    // 数组元素交换
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }






    /////////////////////////////////////
    public static void sort(int []arr){
        //1.构建大顶堆
        for(int i=arr.length/2-1;i>=0;i--){
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(arr,i,arr.length);
        }
        //2.调整堆结构+交换堆顶元素与末尾元素
        for(int j=arr.length-1;j>0;j--){
            swap(arr,0,j);//将堆顶元素与末尾元素进行交换
            adjustHeap(arr,0,j);//重新对堆进行调整
        }

    }

    /**
     * 调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
     * @param arr
     * @param i
     * @param length
     */
    public static void adjustHeap(int []arr,int i,int length){
        int temp = arr[i];//先取出当前元素i
        for(int k=i*2+1;k<length;k=k*2+1){//从i结点的左子结点开始，也就是2i+1处开始
            if(k+1<length && arr[k]<arr[k+1]){//如果左子结点小于右子结点，k指向右子结点
                k++;
            }
            if(arr[k] >temp){//如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        arr[i] = temp;//将temp值放到最终的位置
    }
}