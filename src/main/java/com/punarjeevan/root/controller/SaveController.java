package com.punarjeevan.root.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.punarjeevan.root.model.Saves;
import com.punarjeevan.root.repo.SavesRepo;

@Controller
public class SaveController {
	@Autowired
	SavesRepo sr;
	@GetMapping("/save")
	@ResponseBody
	public List<Saves> addOneSave() {
		Saves sv = new Saves();
		sv.setSaveId(1);
		Map<String, String> map = new HashMap<String, String>();
		map.put("pos","20, 40");
		map.put("isSwordEquipped","true");
		map.put("currentScene","overWorld");
		sv.setPlayerSave(map);
		sr.save(sv);
		return sr.findAll();
	}
	
	@PostMapping(path="/save", headers="Accept=application/json")
	@ResponseBody
	public Saves insertSave(@RequestBody Saves save) {
		sr.save(save);
		return save;
	}
}
