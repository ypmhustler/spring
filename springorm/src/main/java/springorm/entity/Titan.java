package springorm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Titan")
public class Titan {
	
	@Override
	public String toString() {
		return "Titan [id=" + id + ", titanName=" + titanName + ", power=" + power + "]";
	}
	@Id
	private int id;
	private String titanName;
	@Column(name="TitanPower")
	private String power;
	public Titan() {
		
	}
	public Titan(int id, String titanName, String power) {
		super();
		this.id = id;
		this.titanName = titanName;
		this.power = power;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitanName() {
		return titanName;
	}
	public void setTitanName(String titanName) {
		this.titanName = titanName;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	
	

}
