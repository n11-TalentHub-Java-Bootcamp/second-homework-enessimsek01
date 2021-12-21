package dto;

public class NewReviewDto {
    private String review;
    private Long productId;
    private Long userId;

    public NewReviewDto() {
    }

    public NewReviewDto(String review, Long productId, Long userId) {
        this.review = review;
        this.productId = productId;
        this.userId = userId;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
