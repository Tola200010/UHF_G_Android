package com.pda.uhf_g.entity;

public class ItemRequest {
    private String itemCode;
    private String quantity;

    public String getItemCode() {
        return itemCode;
    }

    public ItemRequest(String itemCode, String quantity) {
        this.itemCode = itemCode;
        this.quantity = quantity;
    }

    public ItemRequest() {
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
