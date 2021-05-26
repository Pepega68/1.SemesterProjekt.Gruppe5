package model;

public class Product {
    private String productInfo;
    private int barcode;
    private int productID;
    private String productCatagory;

    public Product(String productInfo, int barcode, int productID, String productCatagory){
        this.productInfo = productInfo;
        this.barcode = barcode;
        this.productID = productID;
        this.productCatagory = productCatagory;
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

    public String getProductCatagory()
    {
        return productCatagory;
    }
}

