import Dao.Impl.TalentDao;
import Entity.Talent;
import org.junit.Test;

public class TalentDaoTest {
    TalentDao td=new TalentDao();
    @Test
    public void createTal(){
        Talent t1=new Talent();
        t1.setTlt_id(1L);
        t1.setTlt_name("灵犀指");
        td.save(t1);
    }
}
