package com.app.dto.study.practice.practice06;

public class Prac06RequestForm {
	
	public String name;
	public double height;
	public double weight;
	
	public Prac06RequestForm(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
	
	public Prac06RequestForm() {
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Prac06RequestForm [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
//	public class PersonBmi {
//
//		String name;
//		String height;
//		String weight;
//		double bmi;
//		
//		public String getName() {
//			return name;
//		}
//		public void setName(String name) {
//			this.name = name;
//		}
//		public String getHeight() {
//			return height;
//		}
//		public void setHeight(String height) {
//			this.height = height;
//		}
//		public String getWeight() {
//			return weight;
//		}
//		public void setWeight(String weight) {
//			this.weight = weight;
//		}
//		public double getBmi() {
//			return bmi;
//		}
//		public void setBmi(double bmi) {
//			this.bmi = bmi;
//		}
//		
//		
//	}

}
