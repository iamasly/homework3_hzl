package Dao.Impl;

import Dao.IPeopleDao;
import Entity.People;
import Util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class PeopleDao extends BaseDao<People> implements IPeopleDao {
    @Override
    public boolean Login(String name, String Password) {
        EntityManager manager = JPAUtil.getEntityManager();
        String hql="select p from People p where p.pp_name=:username and p.pp_password=:password";
        Query query=manager.createQuery(hql);
        query.setParameter("username",name);
        query.setParameter("password",Password);
        List list=query.getResultList();
        manager.close();
        return list.size()>=1;
    }
}
