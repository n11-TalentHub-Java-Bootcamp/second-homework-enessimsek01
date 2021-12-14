package dao;

import base.BaseDao;
import entity.Users;
import org.hibernate.query.Query;

import java.util.List;

public class UserDao extends BaseDao {

    public List<Users> findAll(){

        Query query=getCurrentSession().createQuery("select users from Users users");
        return query.list();
    }
}
