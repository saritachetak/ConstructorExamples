package academy.learningProgramin;

public class Myclass {
    int i;
    String s;
    public static void main(String[] args) {
        Myclass c1=new Myclass();
        Test t1=new Test();
        Test t2=new Test(10,20);
        System.out.println(c1.i+" "+c1.s);
    }

}
