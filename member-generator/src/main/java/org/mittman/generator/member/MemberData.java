package org.mittman.generator.member;

import java.time.LocalDate;
import java.util.Random;

import lombok.AccessLevel;
import lombok.Setter;

public class MemberData {
	@Setter(AccessLevel.PACKAGE)
	private Random random;
	
	private String []firstNames = {
			"James",
			"Aaron",
			"Melinda",
			"Xio Mi",
			"Hector",
			"Geraldine"
	};
	
	private String []middleNames = {
			null,
			"H",
			"B",
			"T",
			"A",
			"L"
	};
	
	private String []lastNames = {
			"Addison",
			"Smith",
			"Kling",
			"Labowski",
			"Li",
			"Rodriguez"
	};

	public MemberData() {
		random = new Random();
	}

	public String nextFirstName() {
		return firstNames[random.nextInt(firstNames.length)];
	}
	
	public String nextMiddleName() {
		return middleNames[random.nextInt(middleNames.length)];
	}
	
	public String nextLastName() {
		return lastNames[random.nextInt(lastNames.length)];
	}

	public String nextSsn() {
		StringBuilder sb = new StringBuilder(11);

		while(sb.length()==0 || "000-00-0000".equals(sb.toString())) {
			sb.setLength(0);
			
			for(int i=0; i<3; ++i) {
				sb.append(random.nextInt(10));
			}
			sb.append("-");
			for(int i=0; i<2; ++i) {
				sb.append(random.nextInt(10));
			}
			sb.append("-");
			for(int i=0; i<4; ++i) {
				sb.append(random.nextInt(10));
			}
		}

		return sb.toString();
	}
	
	public LocalDate nextDateOfBirth() {
		final int START = 1930;
		
		int offset = LocalDate.now().getYear() - START;
		
		int yr = random.nextInt(offset) + START;
		int dayOfYear = random.nextInt(365);
		
		return LocalDate.ofYearDay(yr, dayOfYear);
	}
	
	private Gender []genders;
	public Gender nextGender() {
		if (genders==null) {
			genders = Gender.values();
		}
		
		int idx = random.nextInt(genders.length);
		
		return genders[idx];
	}
	
}
