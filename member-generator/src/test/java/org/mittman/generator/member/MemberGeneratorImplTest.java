package org.mittman.generator.member;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class MemberGeneratorImplTest {
	private MemberData memberData;
	private MemberGeneratorImpl generator;
	

	@Before
	public void setUp() throws Exception {
		// Specify the seed value so we can
		// predict the values
		memberData = new MemberData();
		memberData.setRandom(new Random(1));
		
		generator = new MemberGeneratorImpl();
		generator.setData(memberData);
	}


	@Test
	public void testGenerateFirstName() {
		assertNotNull(generator.generateFirstName());
	}

	@Test
	public void testGenerateMiddleName() {
		String s1 = generator.generateMiddleName();
		
		assertNotEquals("", s1);
	}

	@Test
	public void testGenerateLastName() {
		assertNotNull(generator.generateLastName());
	}

	@Test
	public void testGenerateGender() {
		assertNotNull(generator.generateGender());
	}

	@Test
	public void testGenerateDateOfBirth() {
		assertNotNull(generator.generateDateOfBirth());
	}

	@Test
	public void testGenerateSsn() {
		assertNotNull(generator.generateSsn());
	}

	@Test
	public void testGenerateMember() {
		Member m = generator.generateMember();
		
		assertNotNull(m.getFirstName());
		assertNotEquals("", m.getMiddleName());
		assertNotNull(m.getLastName());
		assertNotNull(m.getSsn());
		assertNotNull(m.getDateOfBirth());
		assertNotNull(m.getGender());
	}

}
