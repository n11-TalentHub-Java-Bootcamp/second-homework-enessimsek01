package dao;

import base.BaseDao;
import entity.ProductReview;
import org.hibernate.query.Query;

import java.util.List;

public class ProductReviewDao extends BaseDao {

    public List<ProductReview> findAll(){

        Query query=getCurrentSession().createQuery("select product from Users users");
        return query.list();
    }

    public List<ProductReview> showReview(){
        String sql = "select productreview from ProductReview productreview where 1=1 ";
        Query query = getCurrentSession().createQuery(sql);
        return query.list();
    }
}
