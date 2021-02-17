package com.assignment

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Samsung {
      //1.A mobile has a Processor(Processors we are considering are Snapdragon and Mediatek)
	@Autowired
	Processors p;
	public void config() {
		System.out.println("8gb ram, 128gb memory");
		p.process();
	}
	
}