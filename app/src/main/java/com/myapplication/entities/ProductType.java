
package com.myapplication.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProductType implements Serializable {

    @SerializedName("image")
    @Expose
    private Image_ image;
    @SerializedName("sizes")
    @Expose
    private List<Size> sizes = new ArrayList<Size>();

    /**
     * 
     * @return
     *     The image
     */
    public Image_ getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    public void setImage(Image_ image) {
        this.image = image;
    }

    /**
     * 
     * @return
     *     The sizes
     */
    public List<Size> getSizes() {
        return sizes;
    }

    /**
     * 
     * @param sizes
     *     The sizes
     */
    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }

}
