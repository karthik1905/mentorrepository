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
		TechnologyDtls td1 = new TechnologyDtls((long) 1, "karthik", "Java FSD", "Java");
		MentorCalendar mc1 = new MentorCalendar((long)101,"dec","dec");
		PaymentDtls pd = new PaymentDtls((long)2000,(long)98712,123);
		TrainingDtls trd = new TrainingDtls((long)203,"inprogress","20-10-2019","25-10-2019",2000f,5000f);
		TrainingDtls trd1 = new TrainingDtls((long)207,"inprogress","20-10-2019","25-10-2019",2000f,5000f);
		TrainingDtls trainingObj = new TrainingDtls((long)391,"inprogress","9-9-2011","12-3-2012",2000f,4000f);
		MentorDtls md = new MentorDtls((long)101,"dmsandy","password","harish","vijayan",(long)12345,"javafsd","linkedin/karthik",
						2.4f,true,true,false);
		MentorDtls md1 = new MentorDtls((long)102,"dmkarth","password","maddy","krishna",(long)12345,"javafsd","linkedin/karthik",
				2.4f,true,true,false);
		UserDtls ud1 = new UserDtls((long) 105, "dmkarth", "pass@word1", "karthik", "D", (long) 123456, true, false);
		UserDtls ud2 = new UserDtls((long) 106, "dmkarth", "pass@word1", "santhosh", "s", (long) 123456, true, false);
		UserDtls ud3 = new UserDtls((long) 107, "dmkarth", "pass@word1", "haha", "PD", (long) 123456, true, false);
		//oneToOne
		trd.setPaymentobj(pd);
		//oneToMany
		Set<MentorDtls> mentorMapObj = new HashSet<MentorDtls>();
		mentorMapObj.add(md);
		mentorMapObj.add(md1);
		td1.setMentorDtlsObj(mentorMapObj);
		//OneToMany
		mc1.setMentorCalObj(mentorMapObj);
		//ManyTomany
		Set<UserDtls> userObj = new HashSet<UserDtls>();
		userObj.add(ud1);
		userObj.add(ud2);
		trainingObj.setUserObj(userObj);
		Set<TrainingDtls> trainingObjMtm =new HashSet<TrainingDtls>();
		trainingObjMtm.add(trd);
		trainingObjMtm.add(trd1);
		ud3.setTrainingObj(trainingObjMtm);
		
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
		s.save(ud1);
		s.save(ud2);
		s.save(trainingObj);
		s.save(ud3);
		t.commit();
		s.close();
		System.out.println("code executed successfully");
	}
}