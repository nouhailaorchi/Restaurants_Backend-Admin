package com.example.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Restaurant {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String adresse;
	private double lat;
	private double longs;
	private int rank;
	@Temporal(TemporalType.TIME)
	@JsonFormat(pattern="HH:mm")
	private Date heure_op;
	@Temporal(TemporalType.TIME)
	@JsonFormat(pattern="HH:mm")
	private Date heure_cl;
	private boolean week;
	private String url;
	@ManyToOne
	private Serie serie;
	@ManyToOne
	private Zone zone;
	@ManyToMany
     private List<Specialite> specialite;
	
	
	
	
	public Restaurant(int id, String nom, String adresse, double lat, double longs, int rank, Date heure_op,
			Date heure_cl, boolean week, String url, Serie serie, Zone zone) {
		super();
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.lat = lat;
		this.longs = longs;
		this.rank = rank;
		this.heure_op = heure_op;
		this.heure_cl = heure_cl;
		this.week = week;
		this.url = url;
		this.serie = serie;
		this.zone = zone;
	}
	public Restaurant() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLongs() {
		return longs;
	}
	public void setLongs(double longs) {
		this.longs = longs;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public Date getHeure_op() {
		return heure_op;
	}
	public void setHeure_op(Date heure_op) {
		this.heure_op = heure_op;
	}
	public Date getHeure_cl() {
		return heure_cl;
	}
	public void setHeure_cl(Date heure_cl) {
		this.heure_cl = heure_cl;
	}
	public boolean isWeek() {
		return week;
	}
	public void setWeek(boolean week) {
		this.week = week;
	}
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	public Zone getZone() {
		return zone;
	}
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	
	public List<Specialite> getSpecialite() {
		return specialite;
	}
	public void setSpecialite(List<Specialite> specialite) {
		this.specialite = specialite;
	}
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", lat=" + lat + ", longs=" + longs
				+ ", rank=" + rank + ", heure_op=" + heure_op + ", heure_cl=" + heure_cl + ", week=" + week + ", serie="
				+ serie + ", zone=" + zone + "]";
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	

}
