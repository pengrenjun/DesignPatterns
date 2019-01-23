package Proxy.JdkProxy;

public class JdkProxyTest {

    public static void main(String[] args) {

        DaoProxyFactory daoProxyFactory=new DaoProxyFactory(new UserDaoTarget());

        IUserDao iUserDao= (IUserDao) daoProxyFactory.getProxyInstance();

        iUserDao.save();

        System.out.println("==============================================================");

        IUserDao iUserDao1= (IUserDao) new DaoProxy().getProxyInstance(new UserDaoTarget());

        iUserDao1.save();
    }
}
