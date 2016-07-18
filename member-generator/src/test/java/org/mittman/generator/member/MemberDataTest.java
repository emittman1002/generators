package org.mittman.generator.member;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class MemberDataTest {
	private MemberData memberData;
	

	@Before
	public void setUp() throws Exception {
		// Initialize the data with a
		// specific seed and generate
		// expected values
		memberData = new MemberData();
		memberData.setRandom(new Random(1));
	}

	
	@Test
	public void nextFirstNameVariesTheGeneratedValue() {
		String s1 = memberData.nextFirstName();
		
		assertNotEquals(s1, memberData.nextFirstName());
	}
	
	@Test
	public void nextMiddleNameVariesTheGeneratedValue() {
		String s1 = memberData.nextMiddleName();
		String s2 = memberData.nextMiddleName();
		
		assertFalse((s1==null && s2==null) || s1.equals(s2));
	}
	
	@Test
	public void nextLastNameVariesTheGeneratedValue() {
		String s1 = memberData.nextLastName();
		
		assertNotEquals(s1, memberData.nextLastName());
	}
	
	@Test
	public void nextSsnVariesTheGeneratedValue() {
		String s1 = memberData.nextSsn();
		
		assertNotEquals(s1, memberData.nextSsn());
	}
	
	@Test
	public void nextDateOfBirthVariesTheGeneratedValue() {
		LocalDate dt1 = memberData.nextDateOfBirth();
		
		assertNotEquals(dt1, memberData.nextDateOfBirth());
	}
	
	@Test
	public void nextGenderVariesTheGeneratedValue() {
		Gender gender = memberData.nextGender();
		
		// Since there are only two genders we
		// give the system a few more tries at variation
		boolean varied = false;
		for(int i=0; !varied && i<15; ++i) {
			if (gender.equals(memberData.nextGender())) {
				varied = true;
			}
		}
		
		assertTrue(varied);
	}

}
