package com.example.IntrestCal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IntrstController {
	
	@RequestMapping("/interest")
	public ModelAndView Calculator(@RequestParam("P")int p,@RequestParam("T")int t,@RequestParam("R")int r) {
		ModelAndView mv = new ModelAndView();
		IntrstService total = new IntrstService();
		double in=total.getinterest(p, t, r);
		mv.setViewName("result.jsp");
		 mv.addObject("yourInterest",in);
		return mv;
	}

}
