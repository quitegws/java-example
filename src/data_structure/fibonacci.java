package data_structure;
 
public class fibonacci{
	public static void main(String args[]){
		for(int i=0; i<10; i++){
			System.out.println("第"+ i + "个斐波那契数是：" + fun(i) );
		}
	}
	
	public static long fun(long num){
		long result = 0;
		
		if(num == 0 || num == 1){
			result = num;
		}else{
			result = fun(num - 1) + fun(num - 2);
		}
		
		return result;
	}
}