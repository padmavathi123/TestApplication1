
package com.myapplication.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Size implements Serializable {

    @SerializedName("color")
    @Expose
    private Object color;
    @SerializedName("quantity")
    @Expose
    private long quantity;
    @SerializedName("available")
    @Expose
    private boolean available;
    @SerializedName("material")
    @Expose
    private Object material;
    @SerializedName("size")
    @Expose
    private String size;

    /**
     * 
     * @return
     *     The color
     */
    public Object getColor() {
        return color;
    }

    /**
     * 
     * @param color
     *     The color
     */
    public void setColor(Object color) {
        this.color = color;
    }

    /**
     * 
     * @return
     *     The quantity
     */
    public long getQuantity() {
        return quantity;
    }

    /**
     * 
     * @param quantity
     *     The quantity
     */
    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    /**
     * 
     * @return
     *     The available
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * 
     * @param available
     *     The available
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * 
     * @return
     *     The material
     */
    public Object getMaterial() {
        return material;
    }

    /**
     * 
     * @param material
     *     The material
     */
    public void setMaterial(Object material) {
        this.material = material;
    }

    /**
     * 
     * @return
     *     The size
     */
    public String getSize() {
        return size;
    }

    /**
     * 
     * @param size
     *     The size
     */
    public void setSize(String size) {
        this.size = size;
    }

}
