package file;

public class FileSystem extends java.io.File{

	public FileSystem(String pathname) {
		super(pathname);
	}

	public void printName(int depth){
		for (int i = 0; i < depth; i++) {
			System.out.print("\t");
			
		}
		System.out.println(getName());
	}

	public void listAll(){
		listAll(0);
	}
	
	
	private void listAll(int depth){
		printName(depth);
		if (isDirectory()) {
			String[] entries = list();
			for (String entry : entries) {
				FileSystem child = new FileSystem(getPath()
										+ separatorChar + entry);
				child.listAll(depth + 1);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileSystem f = new FileSystem(".");
		f.listAll();
	}
	
	

}
