package Betriebssystem;

import java.util.Arrays;

public class BS {
	
	private String name;
	private int version;
	private int patch;
	private int anzahlProzesse;
	private Prozess [] prozess;
	private HDD [] hdd;
	
	

	public BS(String n, int v, int p, Prozess pro, String h, double k) {
		this.name = n;
		this.version = v;
		this.patch = p;
		
		prozess = new Prozess [15];
		for (int i = 0; i < prozess.length; i++) {
			prozess[i]= null;
		}
		hdd = new HDD [20];
		for (int i = 0; i < hdd.length; i++) {
			hdd[i]= null;
		}
	}	
	
	public int hinzufuegen (Prozess p){
		if (sucheleerstelle() == -1) {
			return 0;
			
		} else {
			prozess[sucheleerstelle()] = p;
			return 1;
		}
	}
	public int entfernen (){
		
	}
	public boolean hinzufuegen (HDD hdd){
		
	}
	public boolean entferneHDD (char p){
		
	}
	public boolean tauscheHDD (char partition, HDD hdd){
		
	}
	public double berechneGesamtkapazitaet(){
		
	}
	public string toStringHDDs (){
		
	}
	public string toStringProzesse (){
		
	}

	@Override
	public String toString() {
		return "BS [name=" + name + ", version=" + version + ", patch=" + patch + ", anzahlProzesse=" + anzahlProzesse
				+ ", prozess=" + Arrays.toString(prozess) + ", hdd=" + Arrays.toString(hdd) + "]";
	}
	private int sucheleerstelle(){
		for (int i = 0; i < prozess.length; i++) {
			if (prozess[i]==null) {
				return i;
						
			}
		}
		return -1;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getPatch() {
		return patch;
	}

	public void setPatch(int patch) {
		this.patch = patch;
	}

	public int getAnzahlProzesse() {
		return anzahlProzesse;
	}

	public void setAnzahlProzesse(int anzahlProzesse) {
		this.anzahlProzesse = anzahlProzesse;
	}

	public Prozess[] getProzess() {
		return prozess;
	}

	public void setProzess(Prozess[] prozess) {
		this.prozess = prozess;
	}

	public HDD[] getHdd() {
		return hdd;
	}

	public void setHdd(HDD[] hdd) {
		this.hdd = hdd;
	}
}
