package dao;

import entity.ProductReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductReviewDao extends JpaRepository<ProductReview, Long> {


    List<ProductReview> findProductReviewByUserId(Long userId);

    List<ProductReview> findProductReviewByProductId(Long productId);

    @Query(value = "select u.username from public.User u where u.id=:userId", nativeQuery = true)
    List<Object> findUsernameByUserid(@Param("userId") Long userId);

    @Query(value = "select p.name from Product p where p.id=:productId", nativeQuery = true)
    List<Object> findProductNameByProductId(@Param("productId") Long productId);

    @Query(value="INSERT into ProductReview set(REVIEW,REVIEW_DATE,PRODUCT_ID,USER_ID) values(:obj.review,:obj.reviewDate,:obj.product.id,:obj.user.id)",nativeQuery = true)
    void saveProductReview(@Param("obj") ProductReview productreview);


}
