package UI;

public class Sale extends OperationOnProduct implements Runnable{

    private double totalAmount;

    public synchronized double getTotalAmount() {
        return totalAmount;
    }

    public synchronized void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void run(){
    	Sale s1 = new Sale();
    	s1.getTotalAmount();
    	s1.setTotalAmount(totalAmount);
	}
}
//class sThread extends Thread{
//    
//}
