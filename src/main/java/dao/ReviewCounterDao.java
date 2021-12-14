package dao;

import base.BaseDao;
import dto.ReviewCounterDto;
import entity.ProductReview;
import org.hibernate.query.Query;

import java.util.List;

public class ReviewCounterDao extends BaseDao {

    public List<ReviewCounterDto> reviewCount(){
        ProductReview productReview=new ProductReview();
        String sql="select new dto.ReviewCounterDto(urun.urunId,urun.urunAdi,urun.fiyat,urun.yorumSayisi)"+
                "from Urun urun left join ProductReview productReview"+
                "on urun.urunId=productReview.urunId";

        Query query=getCurrentSession().createQuery(sql);
        return query.list();
    }
}
