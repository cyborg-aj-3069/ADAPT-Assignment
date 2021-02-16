package com.assignmentQ2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Answers {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ans.xml");
	        Questions que = (Questions)context.getBean("Question1");
	        Questions que2 = (Questions)context.getBean("Question2");
	        Questions que3 = (Questions)context.getBean("Question3");
	        que.getQuesNo();
	        que.getQuestion();
	        que.getAnswer();
	        que2.getQuesNo();
	        que2.getQuestion();
	        que2.getAnswer();
	        que3.getQuesNo();
	        que3.getQuestion();
	        que3.getAnswer();
	        System.out.println("The Question And Answers Entered are :- ");
	        System.out.println(" "+ que);
	        System.out.println(" "+ que2);
	        System.out.println(" "+ que3);
	       
	        ArrayList<Questions> QAlist = new ArrayList<Questions>();
	        QAlist.add(que);
	        QAlist.add(que2);
	        QAlist.add(que3);
	        ArrayList<String> arraylist = new ArrayList();
	        for(Questions ques: QAlist) {
	        	arraylist.add(ques.getQuestion());
	        	arraylist.add(ques.getAnswer()); 
	        }
	        System.out.println("Presented as List");
	        System.out.println(arraylist);
	        
	        
	        HashSet<String> hash= new HashSet();
	        for(Questions a:QAlist) {
	        	hash.add(a.getQuestion());
	        	hash.add(a.getAnswer());
	        }
	        System.out.println("Presented as Set");
	        System.out.println(hash);
	        
	        HashMap<String,String> map = new HashMap();
	        for(Questions w: QAlist) {
	        	map.put(w.getQuestion(),w.getAnswer());
	        
	        }
	        System.out.println("Presented as Map");
	        System.out.println(map);
}
	}