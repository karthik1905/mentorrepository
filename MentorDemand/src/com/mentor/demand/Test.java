package com.mentor.demand;

import java.text.ParseException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String args[]) throws ParseException {
		TechnologyDtls td1 = new TechnologyDtls((long) 1, "karthik", "Java FSD", "Java");
		MentorCalendar mc1 = new MentorCalendar((long)101,"dec","dec");
		PaymentDtls pd = new PaymentDtls((long)2000,(long)98712,123);
		TrainingDtls trd = new TrainingDtls((long)203,"inprogress","20-10-2019","25-10-2019",2000f,5000f);
		MentorDtls md = new MentorDtls((long)101,"dmsandy","password","harish","vijayan",(long)12345,"javafsd","linkedin/karthik",
						2.4f,true,true,false);
		MentorDtls md1 = new MentorDtls((long)102,"dmkarth","password","maddy","krishna",(long)12345,"javafsd","linkedin/karthik",
				2.4f,true,true,false);
		UserDtls ud1 = new UserDtls((long) 105, "dmkarth", "pass@word1", "karthik", "D", (long) 123456, true, false);
		trd.setPaymentobj(pd);
		Collection<MentorDtls> mentorMapObj = new HashSet<MentorDtls>();
		mentorMapObj.add(md);
		mentorMapObj.add(md1);
		td1.setMentorDtlsObj(mentorMapObj);
//		Set<TechnologyDtls> accountsOfFirstEmployee = new HashSet<TechnologyDtls>();
//        accountsOfFirstEmployee.add(sd1);
//        accountsOfFirstEmployee.add(sd2);
//        Set<TechnologyDtls> accountsOfEmployee = new HashSet<TechnologyDtls>();
//        accountsOfEmployee.add(sd1);
//        accountsOfEmployee.add(sd2);
        
//        ud1.setTechnologymap(accountsOfFirstEmployee);
//        ud1.setTechnologymap(accountsOfEmployee);
//        ud2.setTechnologymap(accountsOfEmployee);
		
        Configuration cfg = new Configuration();
		cfg.configure("first.config.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.getTransaction();
		t.begin();
		s.save(td1);
		s.save(mc1);
		s.save(pd);
		s.save(trd);
		s.save(md);
		s.save(ud1);
		s.save(mentorMapObj);
		t.commit();
		s.close();
		System.out.println("code executed successfully");
	}
}