package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Zone;
import com.example.demo.repository.ZoneRepository;
import com.example.demo.model.DropdownData;
import com.example.demo.model.Ville;



@RestController
@RequestMapping("zones")
@CrossOrigin
public class ZoneController {
	@Autowired
	private ZoneRepository zoneRepository;
	@PostMapping("/save")
	public void save(@RequestBody Zone zone){
	zoneRepository.save(zone);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable (required = true) String id){
	Zone s = zoneRepository.findById(Integer.parseInt(id));
	zoneRepository.delete(s);
	}
	@GetMapping("/data/all")
	public List<DropdownData> findAllData(){
		List<Zone> zones = zoneRepository.findAll();
		List<DropdownData> data = new ArrayList<DropdownData>();
		if(zones.size() > 0){
			for(Zone zone : zones){
	            data.add(new DropdownData(zone.getNom(), zone.getNom()));
			}
		}
		return data;
	}
	@GetMapping("/all")
	public List<Zone> findAll(){
	return zoneRepository.findAll();
	}
	
	@GetMapping(value = "/count")
	public long countZone() {
	return zoneRepository.count();
	}
	/*@GetMapping(value = "/byYear")
	public Collection<?> findByYear() {
	return ZoneRepository.findNbrZoneByYear();
	}*/

}

