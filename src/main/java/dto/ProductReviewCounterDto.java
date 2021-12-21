package dto;

import java.math.BigDecimal;

public class ProductReviewCounterDto {
    private Long id;
    private String name;
    private BigDecimal price;
    private Long countOfReview;

    public ProductReviewCounterDto() {
    }

    public ProductReviewCounterDto(Long id, String name, BigDecimal price, Long countOfReview) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.countOfReview = countOfReview;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getCountOfReview() {
        return countOfReview;
    }

    public void setCountOfReview(Long countOfReview) {
        this.countOfReview = countOfReview;
    }
}

