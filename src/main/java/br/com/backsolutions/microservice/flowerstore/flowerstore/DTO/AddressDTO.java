package br.com.backsolutions.microservice.flowerstore.flowerstore.DTO;

public class AddressDTO {

    private String road;
    private int number;
    private String state;

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
