package converter;

import dto.NewReviewDto;
import dto.ProductWithReviewDto;
import dto.ReviewDto;
import entity.ProductReview;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.WARN)
public interface ProductReviewConverter {
    ProductReviewConverter INSTANCE = Mappers.getMapper(ProductReviewConverter.class);



    List<ReviewDto> convertProductReviewListToReviewDtoList(List<ProductReview> productReviewList);

    @AfterMapping
    default void setNulls(@MappingTarget final ReviewDto reviewDto, ProductReview productReview) {
        if (reviewDto.getUsername() == null) {
            reviewDto.setUsername(productReview.getUser().getUsername());
        }
    }


    List<ProductWithReviewDto> convertProductReviewListToProductWithReviewDto(List<ProductReview> productReviewList);

    @AfterMapping
    default void setProductName(@MappingTarget final ProductWithReviewDto productWithReviewDto, ProductReview productReview) {
        if (productWithReviewDto.getProductName() == null) {

            productWithReviewDto.setProductReview(productReview.getReview());
            productWithReviewDto.setProductName(productReview.getUrun().getName());
        }
    }

    @Mapping(target = "product.id", source = "productId")
    @Mapping(target = "user.id", source = "userId")
    @Mapping(target = "reviewDate", expression = "java(new java.util.Date())")
    ProductReview convertNewReviewDtoToProductReview(NewReviewDto newReviewDto);

}
