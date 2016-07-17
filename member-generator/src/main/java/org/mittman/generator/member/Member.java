package org.mittman.generator.member;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

/**
 * Member information
 * 
 * @author Edward
 *
 */
@Getter@Setter
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	private String firstName;
	private String middleName;
	private String lastName;
	
	private String ssn;
	private LocalDate dateOfBirth;

	private Gender gender;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ "]";
	}
	
}
