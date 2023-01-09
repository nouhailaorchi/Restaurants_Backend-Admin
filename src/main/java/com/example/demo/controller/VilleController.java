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

import com.example.demo.model.Ville;
import com.example.demo.repository.VilleRepository;
import com.example.demo.model.DropdownData;
import com.example.demo.model.Serie;



@RestController
@RequestMapping("villes")
@CrossOrigin
public class VilleController {
	@Autowired
	private VilleRepository villeRepository;
	@PostMapping("/save")
	public void save(@RequestBody Ville ville){
	villeRepository.save(ville);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable (required = true) String id){
	Ville s = villeRepository.findById(Integer.parseInt(id));
	villeRepository.delete(s);
	}
	@GetMapping("/data/all")
	public List<DropdownData> findAllData(){
		List<Ville> series = villeRepository.findAll();
		List<DropdownData> data = new ArrayList<DropdownData>();
		if(series.size() > 0){
			for(Ville ville : series){
				data.add(new DropdownData(ville.getNom(), ville.getNom()));
			}
		}
		return data;
	}
	
	@GetMapping("/all")
	public List<Ville> findAll(){
	return villeRepository.findAll();
	}
	
	@GetMapping(value = "/count")
	public long countVille() {
	return villeRepository.count();
	}
	/*@GetMapping(value = "/byYear")
	public Collection<?> findByYear() {
	return VilleRepository.findNbrVilleByYear();
	}*/

}
