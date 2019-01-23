package Proxy.JdkProxy;

import java.util.concurrent.TimeUnit;

/*目标对象类*/
public class UserDaoTarget implements  IUserDao   {
    @Override
    public void save() {

        System.out.println("---------开始进行数据保存----------");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
