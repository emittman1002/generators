package org.mittman.generator.member;

import java.time.LocalDate;

public class MemberGeneratorImpl implements MemberGenerator {

	@Override
	public String generateFirstName() {
		return "Fred";
	}

	@Override
	public String generateMiddleName() {
		return null;
	}

	@Override
	public String generateLastName() {
		return "Smith";
	}

	@Override
	public Gender generateGender() {
		return Gender.MALE;
	}

	@Override
	public LocalDate generateDateOfBirth() {
		return LocalDate.of(1988, 1, 1);
	}

	@Override
	public String generateSsn() {
		return "888-00-3456";
	}

	@Override
	public Member generateMember() {
		Member m = new Member();
		
		m.setFirstName(generateFirstName());
		m.setMiddleName(generateMiddleName());
		m.setLastName(generateLastName());
		
		m.setDateOfBirth(generateDateOfBirth());
		m.setGender(generateGender());
		m.setSsn(generateSsn());

		return m;
	}

}
