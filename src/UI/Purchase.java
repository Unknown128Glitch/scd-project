package UI;
public class Purchase extends OperationOnProduct implements Runnable{

    private String vendorName;
    private double totalAmount;

    public synchronized String getVendorName() {
        return vendorName;
    }
    public synchronized void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    public synchronized double getTotalAmount() {
        return totalAmount;
    }
    public synchronized void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public void run(){
    	Purchase p1 = new Purchase();
        p1.getVendorName();
        p1.setVendorName(vendorName);
    }
    public void run1(){
    	Purchase p2 = new Purchase();
    	p2.getTotalAmount();
    	p2.setTotalAmount(totalAmount);
	}
}

//class pThread1 extends Thread{
//    Purchase p1 = new Purchase();
//    
//    public void run(){
//            p1.getVendorName();
//	}
//}

//class pThread2 extends Thread{
//    Purchase p2 = new Purchase();
//    
//    public void run(){
//            p2.getTotalAmount();
//	}
//}