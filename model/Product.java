package model;

public class Product {
    private String productInfo;
    private int barcode;
    private int productID;
    private String productCategory;

    public Product(String productInfo, int barcode, int productID, String productCategory){
        this.productInfo = productInfo;
        this.barcode = barcode;
        this.productID = productID;
        this.productCategory = productCategory;
    }

    public void setProductID(int productID)
    {
        this.productID = productID;
    }
    
    public int getProductID()
    {
        return productID;
    }

    public String getProductInfo()
    {
        return productInfo;
    }

    public int getBarcode()
    {
        return barcode;
    }

    public String getProductCategory()
    {
        return productCategory;
    }
}

