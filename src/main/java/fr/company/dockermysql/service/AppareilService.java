package fr.company.dockermysql.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.company.dockermysql.Dao.AppareilDao;
import fr.company.dockermysql.entities.Appareil;

import java.util.List;

@Service
public class AppareilService {

    @Autowired
    private AppareilDao appareilDao;

    public Appareil save(Appareil appareil) {
        return appareilDao.save(appareil);
    }

    public Appareil findById(Long aLong) {
        return appareilDao.findById(aLong).get();
    }

    public void deleteById(Long aLong) {
        appareilDao.deleteById(aLong);
    }

    public List<Appareil> findAll() {
        return appareilDao.findAll();
    }


    public Appareil update(long id, Appareil appareil) {
        Appareil appareil1=new Appareil();
        appareil1=this.findById(id);
        appareil1.setName(appareil.getName());
        appareil1.setStatus(appareil.getStatus());
        this.save(appareil1);
        return appareil1;
    }
}
