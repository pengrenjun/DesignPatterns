package Adapter;


/**
 * @author Administrator
 *
 * @param <E>
 * 选择了实现list接口的两个方法
 */
public class InterfaceAdapterImplentsClass<E> extends InterfaceAdapter<E> {

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		return super.add(e);
	}
	
	

}
