import Dao.Impl.GoodsDao;
import Dao.Impl.PeopleDao;
import Dao.Impl.TalentDao;
import Entity.Goods;
import Entity.People;
import Entity.Talent;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PeopleDaoTest {
    PeopleDao pd=new PeopleDao();
    TalentDao td=new TalentDao();
    GoodsDao gd=new GoodsDao();

    @Test
    public void createPeo(){
        People p1=new People();
        p1.setPp_id(1L);
        p1.setPp_name("陆小凤");
        p1.setPp_password("111111");
        p1.setPp_height(180);
        p1.setPp_weight(140);
        p1.setPp_sex(true);
        pd.save(p1);


    }

    @Test
    public void CreatePeo1(){
        People p2=new People();
        p2.setPp_id(2L);
        p2.setPp_name("clone1");
        p2.setPp_password("111111");
        p2.setPp_height(180);
        p2.setPp_weight(140);
        p2.setPp_sex(true);
        pd.save(p2);

        List<Goods> gdsList=new ArrayList<>();
        Goods g1=new Goods();
        Goods g2=new Goods();
        g1.setGds_id(2L);
        g1.setGds_name("克隆人盔甲");
        g1.setGds_weight(10);
        g1.setGds_pp(p2);
        g2.setGds_id(3L);
        g2.setGds_name("克隆人的剑");
        g2.setGds_weight(10);
        g2.setGds_pp(p2);

        gdsList.add(g1);
        gdsList.add(g2);
        p2.setPp_gdsList(gdsList);

        List<Talent> tltList=new ArrayList<>();
        Talent t1=new Talent();
        Talent t2=new Talent();
        t1.setTlt_id(2L);
        t1.setTlt_name("克隆人自愈");
        t1.setTlt_pp(p2);
        t1.setTlt_id(3L);
        t1.setTlt_name("克隆人无痛");
        t1.setTlt_pp(p2);

        tltList.add(t1);
        tltList.add(t2);
        p2.setPp_tltList(tltList);
    }

    @Test
    public void Login(){
        System.out.println(pd.Login("陆小凤","111111"));
        System.out.println(pd.Login("陆小凤","222222"));
    }

    @Test
    public void findOne(){
        System.out.println(pd.getOne(1L).getPp_name());
    }

    @Test
    public void update(){
        People pone=pd.getOne(1L);
        pone.setPp_height(150);
        pd.update(pone);
    }

    @Test
    public void delete(){
        People p3=new People();
        p3.setPp_id(3L);
        p3.setPp_name("clone2");
        p3.setPp_password("111111");
        p3.setPp_height(180);
        p3.setPp_weight(140);
        p3.setPp_sex(true);
        pd.save(p3);

        System.out.println(p3.getPp_name()+" -创建用户成功");

        pd.delete(3L);
    }

    @Test
    public void findAll(){
        List<People> plist=pd.getAll();
        for(People p : plist) {
                List<Talent> tlist=td.getAll();
                List<Goods> glist=gd.getAll();
                for(Talent t:tlist) System.out.println(p.getPp_name()+":"+t.getTlt_name());
                for(Goods g:glist) System.out.println(p.getPp_name()+":"+g.getGds_name());
            }
        }
}

