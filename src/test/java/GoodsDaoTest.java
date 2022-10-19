import Dao.Impl.GoodsDao;
import Entity.Goods;
import org.junit.Test;

public class GoodsDaoTest {
    GoodsDao gd=new GoodsDao();
    @Test
    public void createGoo(){
        Goods g1=new Goods();
        g1.setGds_id(1L);
        g1.setGds_name("灵犀指秘籍");
        g1.setGds_weight(1);
        gd.save(g1);
    }
}
