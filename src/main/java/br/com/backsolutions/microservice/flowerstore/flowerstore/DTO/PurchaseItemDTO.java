package br.com.backsolutions.microservice.flowerstore.flowerstore.DTO;

public class PurchaseItemDTO {

    private long id;
    private int quantity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
