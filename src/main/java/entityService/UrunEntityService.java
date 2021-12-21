package entityService;

import dao.UrunDao;
import dto.ProductWithReviewDto;
import entity.Urun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrunEntityService {

    @Autowired
    private UrunDao urunDao;

    @Autowired
    private ProductReviewEntityService productReviewEntityService;

    public List<Urun> findAll() {
        return urunDao.findAll();
    }

    public List<ProductWithReviewDto> findReviewListByProductId(Long productId) {
        return productReviewEntityService.findReviewListByProductId(productId);

    }
    public Urun findProductById(Long id){
        return urunDao.findProductById(id);
    }
}
