package monprojet.dao;

import monprojet.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import monprojet.entity.Country;

public interface CityRepository extends JpaRepository<City, Integer> {

}
