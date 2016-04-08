package com.home.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.home.model.Cancha;
import com.home.service.CanchaService;

@Controller
public class CanchaController {
	@Autowired
	private CanchaService canchaService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
		Cancha cancha = new Cancha();
		map.put("cancha", cancha);
		map.put("canchaList", canchaService.getAllCancha());
		return "cancha";
	}
	@RequestMapping(value="/cancha.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Cancha cancha, BindingResult result, @RequestParam String action, Map<String, Object> map){
		Cancha canchaResult = new Cancha();
		switch(action.toLowerCase()){	
		case "insertar":
			canchaService.add(cancha);
			canchaResult = cancha;
			break;
		case "editar":
			canchaService.edit(cancha);
			canchaResult = cancha;
			break;
		case "borrar":
			canchaService.delete(cancha.getCanchaId());
			canchaResult = new Cancha();
			break;
		case "buscar":
			Cancha searchedCancha = canchaService.getCancha(cancha.getCanchaId());
			canchaResult = searchedCancha!=null ? searchedCancha : new Cancha();
			break;
		}
		map.put("cancha", canchaResult);
		map.put("canchaList", canchaService.getAllCancha());
		return "cancha";
	}
}
