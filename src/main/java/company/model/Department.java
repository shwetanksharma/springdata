package company.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "DEPARTMENT")
@XmlRootElement
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEPARTMENT_ID")
	private Long id;
	@Column(name = "DEPARTMENT_NAME")
	private String name;
	// @OneToMany(mappedBy = "department")
//	private Collection<Employee> employeeCollection;

	public Department() {
	}

	public Department(Long id) {
		this.id = id;
	}

	public Department(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*@XmlTransient
	public Collection<Employee> getEmployeeCollection() {
		return employeeCollection;
	}

	public void setEmployeeCollection(Collection<Employee> employeeCollection) {
		this.employeeCollection = employeeCollection;
	}*/

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Department)) {
			return false;
		}
		Department other = (Department) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

}