package Adapter;


/**
 * @author Administrator
 *目标接口,需要通过适配器扩展其功能,并将source的方法添加进来
 */
public interface TargetInterface {
     
    public String toUpper(String input);//方法名要与source中的方法同名才能添加进来
    public void soutStr(String str);
}
