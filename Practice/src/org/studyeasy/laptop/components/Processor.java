 package org.studyeasy.laptop.components;

public class Processor {
	
	private String brand;
	private String series;
	private String geneartion;
	private String cores;
	private String threads;
	private String cacheMemory;
	private String frequency;
	private String Minfrequency;
	private String maxString;
	
	public Processor() {
	
		this.brand = "Intel";
		this.series = "7200u";
		this.geneartion = "7th";
		this.cores =  "4 cores";
		this.threads = "8 threads";
		this.cacheMemory =  "3 MB";
		this.frequency = "2.5 GHz";
		this.Minfrequency = "2.5 GHz";
		this.maxString = "5 GHz";
		
	}
	public Processor(String brand, String series, String geneartion, String cores, String threads, String cacheMemory,
			String frequency, String minfrequency, String maxString) {
		 
		this.brand = brand;
		this.series = series;
		this.geneartion = geneartion;
		this.cores = cores; 	
		this.threads = threads;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
		Minfrequency = minfrequency;
		this.maxString = maxString;
	}
	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", series=" + series + ", geneartion=" + geneartion + ", cores=" + cores
				+ ", threads=" + threads + ", cacheMemory=" + cacheMemory + ", frequency=" + frequency
				+ ", Minfrequency=" + Minfrequency + ", maxString=" + maxString + "]";
	}
	public String getBrand() {
		return brand;
	}
	public String getSeries() {
		return series;
	}
	public String getGeneartion() {
		return geneartion;
	}
	public String getCores() {
		return cores;
	}
	public String getThreads() {
		return threads;
	}
	public String getCacheMemory() {
		return cacheMemory;
	}
	public String getFrequency() {
		return frequency;
	}
	public String getMinfrequency() {
		return Minfrequency;
	}
	public String getMaxString() {
		return maxString;
	}

	
	
}
