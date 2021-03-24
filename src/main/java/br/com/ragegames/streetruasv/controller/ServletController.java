package br.com.ragegames.streetruasv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ragegames.streetruasv.model.User;

@RestController
@RequestMapping("/")
public class ServletController {

	@GetMapping
	public User hello() {
		User neguin = new User("leandrin","123");
		
		return neguin;
	}
}
