package org.mittman.generator.member;

import java.time.LocalDate;

import lombok.Setter;

public class MemberGeneratorImpl implements MemberGenerator {
	@Setter
	private MemberData data;
	
	
	public MemberGeneratorImpl() {
		data = new MemberData();
	}
	
	@Override
	public String generateFirstName() {
		return data.nextFirstName();
	}

	@Override
	public String generateMiddleName() {
		return data.nextMiddleName();
	}

	@Override
	public String generateLastName() {
		return data.nextLastName();
	}

	@Override
	public Gender generateGender() {
		return data.nextGender();
	}

	@Override
	public LocalDate generateDateOfBirth() {
		return data.nextDateOfBirth();
	}

	@Override
	public String generateSsn() {
		return data.nextSsn();
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
