package dto;

import java.util.Date;

public class ReviewDto {
    private String review;
    private Date reviewDate;
    private String username;


    public ReviewDto() {
    }

    public ReviewDto(String review, Date reviewDate,String username) {
        this.review = review;
        this.reviewDate = reviewDate;
        this.username=username;

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Date getReviewDateDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }
}
