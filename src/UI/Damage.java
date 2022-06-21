package UI;

public class Damage  extends OperationOnProduct implements Runnable{
    
    private String cause;

    public synchronized String getCause() {
        return cause;
    }

    public synchronized void setCause(String cause) {
        this.cause = cause;
    }
    public void run(){
    	Damage d1=new Damage();
    	d1.getCause();
    	d1.setCause(cause);	
    }
}

//class dThread1 extends Thread{
//	Damage d1=new Damage(); 
//	
//        public void run(){
//            d1.getCause();
//	}
//}
