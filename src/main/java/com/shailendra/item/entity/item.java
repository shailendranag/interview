package com.shailendra.item.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class item {

    @Id
    @Column
    private int itemId;

    @Column
    private int unitPrice;

    @Column
    private String description;

    public item() {
    }

    public item(int itemId, int unitPrice, String description) {
        this.itemId = itemId;
        this.unitPrice = unitPrice;
        this.description = description;
    }


    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
