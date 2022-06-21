package UI;

//import UI.Damage;
import java.util.ArrayList;
//import com.toedter.calendar.JDateChooser;
import java.util.List;

public class Shop {

    private List<Product> productList;
    private List<Purchase> purchaseList;
    private List<Sale> salesList;
    private List<Damage> damageList;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Purchase> getPurchaseList() {
        return purchaseList;
    }

    public void setPurchaseList(List<Purchase> purchaseList) {
        this.purchaseList = purchaseList;
    }

    public List<Sale> getSalesList() {
        return salesList;
    }

    public void setSalesList(List<Sale> salesList) {
        this.salesList = salesList;
    }

    public List<Damage> getDamageList() {
        return damageList;
    }

    public void setDamageList(List<Damage> damageList) {
        this.damageList = damageList;
    }

    public Shop() {
        productList = new ArrayList<Product>();
        purchaseList = new ArrayList<Purchase>();
        salesList = new ArrayList<Sale>();
        damageList = new ArrayList<Damage>();
    }

    private static Shop aShop;

    public static Shop getShop() {
        if (aShop == null) {
            aShop = new Shop();
        }

        return aShop;
    }

    public static Shop getShop(List<Product> seedProducts) {
        Shop shop = getShop();
        shop.productList = seedProducts;
        return shop;
    }

    public String enlistProduct(Product aProduct) {
        for (Product product1 : productList) {
            if (product1.getCode() == aProduct.getCode()) {
                return "This product code is already enlisted.";
            } else if (product1.getName() == aProduct.getName()) {
                return "Product name is already enlisted.";
            }
        }

        productList.add(aProduct);
        return "Product is enlisted.";
    }

    public String addSale(Sale aSale) {
        for (Product aProduct : productList) {
            if (aProduct.getCode() == aSale.getProduct().getCode()) {
                if (aProduct.getTotalQuantity() >= aSale.getTransactionQuantity()) {
                    aProduct.setTotalQuantity(aProduct.getTotalQuantity() - aSale.getTransactionQuantity());
                } else {
                    return "Sorry, you don't have enough quantity to sell.";
                }
            }
        }
        
        salesList.add(aSale);
        return "Sale has been updated.";
    }

    public String addPurchase(Purchase aPurchase) {
        for (Product aProduct : productList) {
            if (aProduct.getCode() == aPurchase.getProduct().getCode()) {
                aProduct.setTotalQuantity(aProduct.getTotalQuantity() + aPurchase.getTransactionQuantity());
            }
        }
        
        purchaseList.add(aPurchase);
        return "Purchase has been updated.";
    }

    public String addDamage(Damage aDamage) {
        for (Product aProduct : productList) {
            if (aProduct.getCode() == aDamage.getProduct().getCode()) {
                if (aProduct.getTotalQuantity() >= aDamage.getTransactionQuantity()) {
                    aProduct.setTotalQuantity(aProduct.getTotalQuantity() - aDamage.getTransactionQuantity());
                } else {
                    return "Damage quantity can't exceed total quantity.";
                }
            }
        }
        damageList.add(aDamage);
        return "Damage has been updated.";
    }
}
