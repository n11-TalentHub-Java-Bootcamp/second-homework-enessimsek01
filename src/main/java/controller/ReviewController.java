package controller;

import dto.NewReviewDto;
import dto.ReviewDto;
import entityService.ProductReviewEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class ReviewController {

    @Autowired
    private ProductReviewEntityService productReviewEntityService;

    @GetMapping()
    public List<ReviewDto> findAllReviewList(){

        return productReviewEntityService.findAllReviewList();
    }
    @GetMapping("/user/{userid}")
    public List<ReviewDto> findAllReviewByUserId(@PathVariable Long userid) {

        return productReviewEntityService.findAllReviewByUserId(userid);

    }

    @PostMapping()
    public void saveReview(@RequestBody NewReviewDto newReviewDto) {
        productReviewEntityService.saveReview(newReviewDto);
    }
    @DeleteMapping("/{reviewId}")
    public void deleteCReviewByCReviewId(@PathVariable Long reviewId){
        productReviewEntityService.deleteReviewByReviewId(reviewId);
    }


}
