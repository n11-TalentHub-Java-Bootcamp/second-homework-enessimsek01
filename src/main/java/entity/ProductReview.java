package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PRODUCT_REVIEW")
public class ProductReview {
    @SequenceGenerator(name = "product_review_generator", sequenceName = "PRODUCT_REVIEW_ID_SEQ", allocationSize = 1)
    @Id
    @GeneratedValue(generator = "product_review_generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "REVIEW", length = 500)
    private String review;

    @Column(name = "REVIEW_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reviewDate;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID",foreignKey = @ForeignKey(name = "FK_PRODUCT_REVIEW_PRODUCT_ID"))
    private Urun urun;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="USER_ID",foreignKey = @ForeignKey(name="FK_PRODUCT_REVIEW_USER_ID"))
    private User user;

    // Constructors
    public ProductReview() {
    }

    public ProductReview(Long id, String review, Date reviewDate, Urun urun, User user) {
        this.id = id;
        this.review = review;
        this.reviewDate = reviewDate;
        this.urun = urun;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return id == null ? "" : id.toString();
    }
}
