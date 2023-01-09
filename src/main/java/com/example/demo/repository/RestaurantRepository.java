package com.example.demo.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Restaurant;


public interface RestaurantRepository extends JpaRepository<Restaurant, Integer>{
	Restaurant findById(int id);

	@Query("select year(m.heure_op) as annee, count(*) as nbr from Restaurant m group by year(m.heure_op) order by year(m.heure_op)")
	static
    Collection<?> findNbrRestaurantByYear() {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Query(value = "select id, nom from Restaurant r where r.zone_id = :zoneID", nativeQuery = true)
	List<Restaurant> findRestaurantsByZoneId(Integer zoneID);

	@Query(value = "select id, nom from Restaurant r where r.serie_id = :seriesId", nativeQuery = true)
	List<Restaurant> findRestaurantsBySeriesId(Integer seriesId);
}
