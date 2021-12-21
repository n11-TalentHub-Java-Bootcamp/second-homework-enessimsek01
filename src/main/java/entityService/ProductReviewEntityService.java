package entityService;

import dao.ProductReviewDao;
import dto.NewReviewDto;
import dto.ProductWithReviewDto;
import dto.ReviewDto;
import entity.ProductReview;
import exception.NoReviewException;
import exception.ProductNotFoundException;
import exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductReviewEntityService {

    @Autowired
    private ProductReviewDao productReviewDao;


    public List<ReviewDto> findAllReviewByUserId(Long userId) {
        List<ProductReview> productReviewList = productReviewDao.findProductReviewByUserId(userId);

        if (productReviewList.size() < 1) {
            List<Object> usernameByUserid = productReviewDao.findUsernameByUserid(userId);
            if (usernameByUserid.size() != 1)
                throw new UserNotFoundException("No user.");
            String username = String.valueOf(usernameByUserid.get(0));
            throw new NoReviewException(username + " has no review.");
        }
        List<ReviewDto> reviewDtoList = INSTANCE.convertProductReviewListToReviewDtoList(productReviewList);
        return reviewDtoList;
    }

    public List<ProductWithReviewDto> findReviewListByProductId(Long productId) {
        List<ProductReview> productReviewList = productReviewDao.findProductReviewByProductId(productId);
        if (productReviewList.size() < 1) {
            List<Object> productNameByProductId = productReviewDao.findProductNameByProductId(productId);
            if (productNameByProductId.size() != 1)
                throw new ProductNotFoundException("No product.");
            String productName = String.valueOf(productNameByProductId.get(0));
            throw new NoReviewException(productName + " has no review.");
        }
        List<ProductWithReviewDto> productWithReviewDto = INSTANCE.convertProductReviewListToProductWithReviewDto(productReviewList);
        return productWithReviewDto;
    }

    public void saveReview(NewReviewDto newReviewDto) {
        ProductReview productReview = INSTANCE.convertNewReviewDtoToProductReview(newReviewDto);
        ProductReview save = productReviewDao.save(productReview);

    }

    public void deleteReviewByReviewId(Long reviewId) {
        productReviewDao.deleteById(reviewId);
    }

    public List<ReviewDto> findAllReviewList() {
        List<ProductReview> reviewList = productReviewDao.findAll();
        List<ReviewDto> reviewDtoList = INSTANCE.convertProductReviewListToReviewDtoList(reviewList);
        return reviewDtoList;
    }
}
