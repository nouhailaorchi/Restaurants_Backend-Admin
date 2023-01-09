package com.example.demo.controller;

import com.example.demo.model.Restaurant;
import com.example.demo.model.Serie;
import com.example.demo.model.Ville;
import com.example.demo.model.Zone;
import com.example.demo.repository.RestaurantRepository;
import com.example.demo.repository.SerieRepository;
import com.example.demo.repository.VilleRepository;
import com.example.demo.repository.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/search")
@CrossOrigin
public class SearchController {

    @Autowired
    private ZoneRepository zoneRepository;

    @Autowired
    private VilleRepository villeRepository;

    @Autowired
    private SerieRepository serieRepository;

    @Autowired
    private RestaurantRepository restaurantRepository;

    @GetMapping("/zones/{name}")
    public List<Restaurant> searchByZone(@PathVariable String name) {
        Zone zoneByNom = zoneRepository.findByNom(name);
        System.out.println(zoneByNom);
        List<Restaurant> restaurantsByZoneId = restaurantRepository.findRestaurantsByZoneId(zoneByNom.getId());
        return restaurantsByZoneId;
    }

    @GetMapping("/series/{name}")
    public List<Restaurant> searchBySerie(@PathVariable String name) {
        Serie serieillieByName = serieRepository.findByNom(name);
        System.out.println(serieillieByName);
        List<Restaurant> restaurantsBySerieId = restaurantRepository.findRestaurantsBySeriesId(serieillieByName.getId());
        return restaurantsBySerieId;
    }

    @GetMapping("/villies/{name}")
    public List<Restaurant> searchByVillie(@PathVariable String name) {
        List<Restaurant> restaurantsByVilliesId = new ArrayList<>();
        List<Restaurant> all = restaurantRepository.findAll();
        for(Restaurant restaurant: all) {
            if(restaurant.getAdresse().contains(name)) {
                restaurantsByVilliesId.add(restaurant);
            }
        }
        return restaurantsByVilliesId;
    }

}