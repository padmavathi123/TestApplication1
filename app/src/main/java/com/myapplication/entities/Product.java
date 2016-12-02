
package com.myapplication.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Product implements Serializable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("style_code")
    @Expose
    private String styleCode;
    @SerializedName("short_title")
    @Expose
    private String shortTitle;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("base_price")
    @Expose
    private long basePrice;
    @SerializedName("sale_price")
    @Expose
    private long salePrice;
    @SerializedName("offer")
    @Expose
    private String offer;
    @SerializedName("size_list")
    @Expose
    private List<String> sizeList = new ArrayList<String>();
    @SerializedName("price_info")
    @Expose
    private String priceInfo;
    @SerializedName("brand_name")
    @Expose
    private String brandName;
    @SerializedName("brand_id")
    @Expose
    private String brandId;
    @SerializedName("brand_slug")
    @Expose
    private String brandSlug;
    @SerializedName("store_id")
    @Expose
    private String storeId;
    @SerializedName("store_name")
    @Expose
    private String storeName;
    @SerializedName("store_logo")
    @Expose
    private String storeLogo;
    @SerializedName("store_slug")
    @Expose
    private String storeSlug;
    @SerializedName("logo")
    @Expose
    private Logo logo;
    @SerializedName("logo_thumb")
    @Expose
    private String logoThumb;
    @SerializedName("images")
    @Expose
    private List<Image> images = new ArrayList<Image>();
    @SerializedName("added_to_wishcart")
    @Expose
    private boolean addedToWishcart;
    @SerializedName("wishcart_item_id")
    @Expose
    private Object wishcartItemId;
    @SerializedName("buyable")
    @Expose
    private boolean buyable;
    @SerializedName("offer_available")
    @Expose
    private boolean offerAvailable;
    @SerializedName("can_deliver")
    @Expose
    private boolean canDeliver;
    @SerializedName("can_pickup")
    @Expose
    private boolean canPickup;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("product_type")
    @Expose
    private ProductType productType;
    @SerializedName("gift_wrap_amount")
    @Expose
    private long giftWrapAmount;
    @SerializedName("tags")
    @Expose
    private List<String> tags = new ArrayList<String>();
    @SerializedName("inventory_id")
    @Expose
    private String inventoryId;
    @SerializedName("stock_available")
    @Expose
    private boolean stockAvailable;
    @SerializedName("size_guide")
    @Expose
    private SizeGuide sizeGuide;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;

    public boolean isBookmark() {
        return isBookmark;
    }

    public void setBookmark(boolean bookmark) {
        isBookmark = bookmark;
    }

    private boolean isBookmark;


    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The styleCode
     */
    public String getStyleCode() {
        return styleCode;
    }

    /**
     * 
     * @param styleCode
     *     The style_code
     */
    public void setStyleCode(String styleCode) {
        this.styleCode = styleCode;
    }

    /**
     * 
     * @return
     *     The shortTitle
     */
    public String getShortTitle() {
        return shortTitle;
    }

    /**
     * 
     * @param shortTitle
     *     The short_title
     */
    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The basePrice
     */
    public long getBasePrice() {
        return basePrice;
    }

    /**
     * 
     * @param basePrice
     *     The base_price
     */
    public void setBasePrice(long basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * 
     * @return
     *     The salePrice
     */
    public long getSalePrice() {
        return salePrice;
    }

    /**
     * 
     * @param salePrice
     *     The sale_price
     */
    public void setSalePrice(long salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * 
     * @return
     *     The offer
     */
    public String getOffer() {
        return offer;
    }

    /**
     * 
     * @param offer
     *     The offer
     */
    public void setOffer(String offer) {
        this.offer = offer;
    }

    /**
     * 
     * @return
     *     The sizeList
     */
    public List<String> getSizeList() {
        return sizeList;
    }

    /**
     * 
     * @param sizeList
     *     The size_list
     */
    public void setSizeList(List<String> sizeList) {
        this.sizeList = sizeList;
    }

    /**
     * 
     * @return
     *     The priceInfo
     */
    public String getPriceInfo() {
        return priceInfo;
    }

    /**
     * 
     * @param priceInfo
     *     The price_info
     */
    public void setPriceInfo(String priceInfo) {
        this.priceInfo = priceInfo;
    }

    /**
     * 
     * @return
     *     The brandName
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 
     * @param brandName
     *     The brand_name
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * 
     * @return
     *     The brandId
     */
    public String getBrandId() {
        return brandId;
    }

    /**
     * 
     * @param brandId
     *     The brand_id
     */
    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    /**
     * 
     * @return
     *     The brandSlug
     */
    public String getBrandSlug() {
        return brandSlug;
    }

    /**
     * 
     * @param brandSlug
     *     The brand_slug
     */
    public void setBrandSlug(String brandSlug) {
        this.brandSlug = brandSlug;
    }

    /**
     * 
     * @return
     *     The storeId
     */
    public String getStoreId() {
        return storeId;
    }

    /**
     * 
     * @param storeId
     *     The store_id
     */
    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    /**
     * 
     * @return
     *     The storeName
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * 
     * @param storeName
     *     The store_name
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     * 
     * @return
     *     The storeLogo
     */
    public String getStoreLogo() {
        return storeLogo;
    }

    /**
     * 
     * @param storeLogo
     *     The store_logo
     */
    public void setStoreLogo(String storeLogo) {
        this.storeLogo = storeLogo;
    }

    /**
     * 
     * @return
     *     The storeSlug
     */
    public String getStoreSlug() {
        return storeSlug;
    }

    /**
     * 
     * @param storeSlug
     *     The store_slug
     */
    public void setStoreSlug(String storeSlug) {
        this.storeSlug = storeSlug;
    }

    /**
     * 
     * @return
     *     The logo
     */
    public Logo getLogo() {
        return logo;
    }

    /**
     * 
     * @param logo
     *     The logo
     */
    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    /**
     * 
     * @return
     *     The logoThumb
     */
    public String getLogoThumb() {
        return logoThumb;
    }

    /**
     * 
     * @param logoThumb
     *     The logo_thumb
     */
    public void setLogoThumb(String logoThumb) {
        this.logoThumb = logoThumb;
    }

    /**
     * 
     * @return
     *     The images
     */
    public List<Image> getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    public void setImages(List<Image> images) {
        this.images = images;
    }

    /**
     * 
     * @return
     *     The addedToWishcart
     */
    public boolean isAddedToWishcart() {
        return addedToWishcart;
    }

    /**
     * 
     * @param addedToWishcart
     *     The added_to_wishcart
     */
    public void setAddedToWishcart(boolean addedToWishcart) {
        this.addedToWishcart = addedToWishcart;
    }

    /**
     * 
     * @return
     *     The wishcartItemId
     */
    public Object getWishcartItemId() {
        return wishcartItemId;
    }

    /**
     * 
     * @param wishcartItemId
     *     The wishcart_item_id
     */
    public void setWishcartItemId(Object wishcartItemId) {
        this.wishcartItemId = wishcartItemId;
    }

    /**
     * 
     * @return
     *     The buyable
     */
    public boolean isBuyable() {
        return buyable;
    }

    /**
     * 
     * @param buyable
     *     The buyable
     */
    public void setBuyable(boolean buyable) {
        this.buyable = buyable;
    }

    /**
     * 
     * @return
     *     The offerAvailable
     */
    public boolean isOfferAvailable() {
        return offerAvailable;
    }

    /**
     * 
     * @param offerAvailable
     *     The offer_available
     */
    public void setOfferAvailable(boolean offerAvailable) {
        this.offerAvailable = offerAvailable;
    }

    /**
     * 
     * @return
     *     The canDeliver
     */
    public boolean isCanDeliver() {
        return canDeliver;
    }

    /**
     * 
     * @param canDeliver
     *     The can_deliver
     */
    public void setCanDeliver(boolean canDeliver) {
        this.canDeliver = canDeliver;
    }

    /**
     * 
     * @return
     *     The canPickup
     */
    public boolean isCanPickup() {
        return canPickup;
    }

    /**
     * 
     * @param canPickup
     *     The can_pickup
     */
    public void setCanPickup(boolean canPickup) {
        this.canPickup = canPickup;
    }

    /**
     * 
     * @return
     *     The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * 
     * @param slug
     *     The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * 
     * @return
     *     The productType
     */
    public ProductType getProductType() {
        return productType;
    }

    /**
     * 
     * @param productType
     *     The product_type
     */
    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    /**
     * 
     * @return
     *     The giftWrapAmount
     */
    public long getGiftWrapAmount() {
        return giftWrapAmount;
    }

    /**
     * 
     * @param giftWrapAmount
     *     The gift_wrap_amount
     */
    public void setGiftWrapAmount(long giftWrapAmount) {
        this.giftWrapAmount = giftWrapAmount;
    }

    /**
     * 
     * @return
     *     The tags
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * 
     * @return
     *     The inventoryId
     */
    public String getInventoryId() {
        return inventoryId;
    }

    /**
     * 
     * @param inventoryId
     *     The inventory_id
     */
    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    /**
     * 
     * @return
     *     The stockAvailable
     */
    public boolean isStockAvailable() {
        return stockAvailable;
    }

    /**
     * 
     * @param stockAvailable
     *     The stock_available
     */
    public void setStockAvailable(boolean stockAvailable) {
        this.stockAvailable = stockAvailable;
    }

    /**
     * 
     * @return
     *     The sizeGuide
     */
    public SizeGuide getSizeGuide() {
        return sizeGuide;
    }

    /**
     * 
     * @param sizeGuide
     *     The size_guide
     */
    public void setSizeGuide(SizeGuide sizeGuide) {
        this.sizeGuide = sizeGuide;
    }

}
