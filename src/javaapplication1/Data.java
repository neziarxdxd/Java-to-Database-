/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author MY-PC
 */
class Data {
    private int SupplierID;
    private String SupplierName, ContactName,Address, City, PostalCode,Country;

    public Data(int SupplierID, String SupplierName, String ContactName, String Address, String City, String PostalCode, String Country) {
        this.SupplierID = SupplierID;
        this.SupplierName = SupplierName;
        this.ContactName = ContactName;
        this.Address = Address;
        this.City = City;
        this.PostalCode = PostalCode;
        this.Country = Country;
    }

    public int getSupplierID() {
        return SupplierID;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public String getContactName() {
        return ContactName;
    }

    public String getAddress() {
        return Address;
    }

    public String getCity() {
        return City;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public String getCountry() {
        return Country;
    }

    
  
    
}
