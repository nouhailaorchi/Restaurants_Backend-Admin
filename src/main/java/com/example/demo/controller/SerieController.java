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

import com.example.demo.model.Serie;
import com.example.demo.model.Specialite;
import com.example.demo.repository.SerieRepository;
import com.example.demo.model.DropdownData;



@RestController
@RequestMapping("series")
@CrossOrigin
public class SerieController {
	@Autowired
	private SerieRepository serieRepository;
	@PostMapping("/save")
	public void save(@RequestBody Serie serie){
	serieRepository.save(serie);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable (required = true) String id){
	Serie s = serieRepository.findById(Integer.parseInt(id));
	serieRepository.delete(s);
	}
	@GetMapping("/data/all")
	public List<DropdownData> findAllData(){
		List<Serie> series = serieRepository.findAll();
		List<DropdownData> data = new ArrayList<DropdownData>();
		if(series.size() > 0){
			for(Serie serie : series){
				data.add(new DropdownData(serie.getNom(), serie.getNom()));
			}
		}
		return data;
	}
	
	@GetMapping("/all")
	public List<Serie> findAll(){
	return serieRepository.findAll();
	}
	
	@GetMapping(value = "/count")
	public long countSerie() {
	return serieRepository.count();
	}
	/*@GetMapping(value = "/byYear")
	public Collection<?> findByYear() {
	return SerieRepository.findNbrSerieByYear();
	}*/

}
