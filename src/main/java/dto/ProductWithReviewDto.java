package dto;

import java.util.Date;

public class ProductWithReviewDto {
    private String productName;
    private String productReview;
    private Date reviewDate;

    public ProductWithReviewDto() {
    }

    public ProductWithReviewDto(String productName, String productReview, Date reviewDate) {
        this.productName = productName;
        this.productReview = productReview;
        this.reviewDate = reviewDate;
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

    public void setReviewDate(Date commentDate) {
        this.reviewDate = reviewDate;
    }

}

