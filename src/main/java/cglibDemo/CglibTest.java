package cglibDemo;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

public class CglibTest {
//    @Test
//    public void testCglib() {
//        DaoProxy daoProxy = new DaoProxy();
//
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(Dao.class);
//        enhancer.setCallback(daoProxy);
//
//        Dao dao = (Dao)enhancer.create();
//        dao.update();
//        dao.select();
//    }
    public static void main(String[] args){
//        DaoProxy daoProxy = new DaoProxy();
//
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(Dao.class);
//        enhancer.setCallback(daoProxy);
//
//        Dao dao = (Dao)enhancer.create();
//        dao.update();
//        dao.select();

        DaoProxy daoProxy = new DaoProxy();
        DaoAnotherProxy daoAnotherProxy = new DaoAnotherProxy();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Dao.class);
        enhancer.setCallbacks(new Callback[]{daoProxy, daoAnotherProxy, NoOp.INSTANCE});
        enhancer.setCallbackFilter(new DaoFilter());
        enhancer.setInterceptDuringConstruction(false);

        Dao dao = (Dao)enhancer.create();
        dao.update();
        dao.select();
    }
}
