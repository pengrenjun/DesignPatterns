package Proxy.JdkProxy;

import java.util.concurrent.TimeUnit;

/*Ŀ�������*/
public class UserDaoTarget implements  IUserDao   {
    @Override
    public void save() {

        System.out.println("---------��ʼ�������ݱ���----------");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
