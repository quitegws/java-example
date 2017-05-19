package algorithm;

import java.math.BigInteger;

public class HashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hashCode("abcdefghijklmnopqrstuvwxyz".toCharArray(), 2607));
	}
//	在数据结构中，哈希函数是用来将一个字符串（或任何其他类型）转化为小于哈希表大小且大于等于零的整数。
//	一个好的哈希函数可以尽可能少地产生冲突。
//	一种广泛使用的哈希函数算法是使用数值33，假设任何字符串都是基于33的一个大整数，比如：
//
//	hashcode("abcd") = (ascii(a) * 33^3 + ascii(b) * 33^2 + ascii(c) *33 + ascii(d)) % HASH_SIZE 
//
//	                              = (97* 333 + 98 * 332 + 99 * 33 +100) % HASH_SIZE
//
//	                              = 3595978 % HASH_SIZE
//
//	其中HASH_SIZE表示哈希表的大小(可以假设一个哈希表就是一个索引0 ~ HASH_SIZE-1的数组)。
//
//	给出一个字符串作为key和一个哈希表的大小，返回这个字符串的哈希值。
    public static int hashCode(char[] key,int HASH_SIZE) {
        // write your code here
    	int len = key.length;
    	BigInteger b = new BigInteger(String.valueOf(0));
    	for (int i = 0; i < len; i++) {
    		BigInteger b2 = new BigInteger(String.valueOf(1));
    		char c = key[i];
    		for (int j = len - i - 1; j > 0; j--) {
    			b2 = b2.multiply(new BigInteger(String.valueOf(33)));
    		}
    		byte bc = (byte) c;
    		b2 = b2.multiply(new BigInteger(String.valueOf(bc)));
    		b = b.add(b2);
    	}
    	b = b.mod(new BigInteger(String.valueOf(HASH_SIZE)));
    	return b.intValue();
    }

}
