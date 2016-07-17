package org.mittman.generator.member;

import java.time.LocalDate;

public interface MemberGenerator {
	String generateFirstName();
	String generateMiddleName();
	String generateLastName();
	Gender generateGender();
	LocalDate generateDateOfBirth();
	
	String generateSsn();
	
	Member generateMember();
}
