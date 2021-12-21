package dto;

import java.util.Date;

public class UserReviewDto {
    private Long userId;
    private String userFirstName;
    private String productName;
    private String productReview;
    private Date reviewDate;

    public UserReviewDto() {
    }

    public UserReviewDto(Long userId, String userFirstName, String productName, String productReview, Date reviewDate) {
        this.userId = userId;
        this.userFirstName = userFirstName;
        this.productName = productName;
        this.productReview = productReview;
        this.reviewDate = reviewDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductReview() {
        return productReview;
    }

    public void setProductReview(String productReview) {
        this.productReview = productReview;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }
}
