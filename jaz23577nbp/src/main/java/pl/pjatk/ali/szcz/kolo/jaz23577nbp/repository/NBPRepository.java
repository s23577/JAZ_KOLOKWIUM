package pl.pjatk.ali.szcz.kolo.jaz23577nbp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pjatk.ali.szcz.kolo.jaz23577nbp.model.MyCurrencyModel;

@Repository
public interface NBPRepository extends JpaRepository<MyCurrencyModel, Long> {

}
