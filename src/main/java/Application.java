import dao.UserDao;

public class Application {
    public static void main(String[] args) {


        UserDao userDao=new UserDao();
        userDao.findAll();
    }
}
