package test;

public class N {

    public static void print(){
        System.out.println("MTDP");
    }
    public static void main(String[] args) {
        try{
            ((N)null).print();
        }catch(NullPointerException e){
            System.out.println("NullPointerException");
        }

    }
}