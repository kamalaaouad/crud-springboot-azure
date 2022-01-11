package fr.company.dockermysql.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.company.dockermysql.entities.Appareil;



@Repository
public interface AppareilDao extends JpaRepository<Appareil, Long> {

}
