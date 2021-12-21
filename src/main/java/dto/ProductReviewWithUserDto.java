package dto;

import java.math.BigDecimal;
import java.util.Date;

public class ProductReviewWithUserDto {
    private String productName;
    private String categoryName;
    private BigDecimal price;
    private String userFirstName;
    private String userLastName;
    private String userEmail;
    private String userCellPhone;
    private String review;
    private Date reviewDate;

    public ProductReviewWithUserDto() {
    }

    public ProductReviewWithUserDto(String productName, String categoryName, BigDecimal price, String userFirstName, String userLastName, String userEmail, String userCellPhone, String review, Date reviewDate) {
        this.productName = productName;
        this.categoryName = categoryName;
        this.price = price;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.userCellPhone = userCellPhone;
        this.review = review;
        this.reviewDate = reviewDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserCellPhone() {
        return userCellPhone;
    }

    public void setUserCellPhone(String userCellPhone) {
        this.userCellPhone = userCellPhone;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }
}



