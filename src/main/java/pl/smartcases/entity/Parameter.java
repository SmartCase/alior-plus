package pl.smartcases.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Parameter {

	@Id
	@GeneratedValue
	private Integer Id;
	
	private String parameterName;
	
	
	@ManyToOne
	@JoinColumn(name="application_id") // jak nazywac bedzie sie foreignkey w tej tablicy
	private Application application;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getParameterName() {
		return parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}
	
	
	
}
