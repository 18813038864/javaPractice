package threadDemo;

public class MyThread extends Thread  {
    private int count = 5000;
    @Override
    public void run(){
//        System.out.println(this.currentThread().getName()+"开始计算");
        for (;count>0;){
            count--;
            System.out.println("由"+this.currentThread().getName()+"计算，count="+count);
        }
//        count--;
//        System.out.println("由"+this.currentThread().getName()+"计算，count="+count);
    }
}
