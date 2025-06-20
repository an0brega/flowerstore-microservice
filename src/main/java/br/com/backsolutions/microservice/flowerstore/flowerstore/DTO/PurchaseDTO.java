package br.com.backsolutions.microservice.flowerstore.flowerstore.DTO;

import java.util.List;

public class PurchaseDTO {
    private List<PurchaseItemDTO> items;
    private AddressDTO address;

    public List<PurchaseItemDTO> getItems() {
        return items;
    }

    public void setItems(List<PurchaseItemDTO> items) {
        this.items = items;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }
}
