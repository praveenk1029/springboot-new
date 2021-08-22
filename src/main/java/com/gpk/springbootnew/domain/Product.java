package com.gpk.springbootnew.domain;

import java.util.Objects;

public class Product {
    private long productId;
    private String productName;
    private double price;
    private String productType;

    public Product() {
    }

    public Product(long productId, String productName, double price, String productType) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.productType = productType;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", productType='" + productType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && Double.compare(product.price, price) == 0 && productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, price);
    }
}
