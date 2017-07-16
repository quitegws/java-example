package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.HashMap;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class c1 = Class.forName("java.lang.Integer");
		Class c2 = Integer.class;
		Class c3 = new Integer(0).getClass();
		
		System.out.println(c1 == c2);
		System.out.println(c2 == c3);
		Class c4 = Hero.class;
		Class c5 = HashMap.class;
		Constructor[] cs = c4.getConstructors();
		Class classes = c5.getSuperclass();
		System.out.println(classes.getName());
		for (Constructor c : cs) {
			int m = c.getModifiers();
			String s = c.getName();
			System.out.println(Modifier.toString(m));
			System.out.println(c);
			
		}
		ClassTest ct = new ClassTest();
		String classLoaderName = ct.getClass().getClassLoader().getClass().getName();
		System.out.println(classLoaderName);
		
		while (true) {
			TestThread tt = new TestThread();
			tt.start();
			new TestThread().start();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


static class Hero{
	private String name; 
	private int hp;
	private Hero(){
		
	}
	public Hero(String name, int hp){
		this.name = name;
		this.hp = hp;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}
	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
}



}


class TestThread extends Thread{
	static int cnt = 0;
	public void run(){
		System.out.println("thread : " + cnt++);
	}
}