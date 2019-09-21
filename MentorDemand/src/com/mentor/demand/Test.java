package com.mentor.demand;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String args[]) throws ParseException {
		SkillDtls sd1 = new SkillDtls((long) 1, "karthik", "Java FSD", "Java");
		SkillDtls sd2 = new SkillDtls((long) 2, "sandy", "C basic", "CPP");
		
		PaymentDtls pd1 = new PaymentDtls((long) 201, "credit", 3999.0f, "can do better", (long) 12345, "Ramesh",
				(long) 201001, "java fsd", 4999f);

		PaymentDtls pd2 = new PaymentDtls((long) 202, "credit", 3999.0f, "can do better", (long) 12345, "Ramesh",
				(long) 201001, "java fsd", 4999f);
		
		UserDtls ud1 = new UserDtls((long) 101, "dmkarth", "pass@word1", "karthik", "D", (long) 123456, "3511239",
				"marana coder", "linkedin/karthik.com", 2.0f, true, true, false);
		UserDtls ud2 = new UserDtls((long) 201, "karthdm", "pass@word1", "sandy", "s", (long) 123456, "3511240",
				"verithanam coder", "linkedin/sandy.com", 2.0f, true, true, false);
		
		sd1.setPaymentobj(pd1);
		sd2.setPaymentobj(pd2);
		
//		List<SkillDtls> firstEmployee = new ArrayList<SkillDtls>();
//		firstEmployee.add(sd);
//		ud.setSkillmap(firstEmployee);

		Set<SkillDtls> accountsOfFirstEmployee = new HashSet<SkillDtls>();
        accountsOfFirstEmployee.add(sd1);
        accountsOfFirstEmployee.add(sd2);
        Set<SkillDtls> accountsOfEmployee = new HashSet<SkillDtls>();
        accountsOfEmployee.add(sd1);
        accountsOfEmployee.add(sd2);
        
        ud1.setSkillmap(accountsOfFirstEmployee);
        ud1.setSkillmap(accountsOfEmployee);
        ud2.setSkillmap(accountsOfEmployee);
		
        Configuration cfg = new Configuration();
		cfg.configure("first.config.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.getTransaction();
		t.begin();
		s.save(sd1);
		s.save(sd2);
		s.save(ud1);
		s.save(ud2);
		s.save(pd1);
		s.save(pd2);
		t.commit();
		s.close();
		System.out.println("code executed successfully");
	}
}