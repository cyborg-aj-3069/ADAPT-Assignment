package com.assignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class SnapDragon implements Processors {
 public void process() {
	 System.out.println(" processor ");
 }
}