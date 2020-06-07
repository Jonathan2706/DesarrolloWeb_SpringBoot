package com.bytecode.core.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bytecode.core.model.Post;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/home")
public class ControllerBasic {
	
	public List<Post> getPosts(){
		ArrayList<Post> post = new ArrayList<>();
		
		post.add(new Post(1, "Desarrollo web es un término que define la creación de sitios web para Internet o una intranet.","http://localhost/img/post.jpg", new Date(0) ,"Desarollo web"));
		post.add(new Post(2, "Desarrollo web es un término que define la creación de sitios web para Internet o una intranet.","http://localhost/img/post.jpg", new Date(0) ,"Desarollo web Front-end"));
		post.add(new Post(3, "Desarrollo web es un término que define la creación de sitios web para Internet o una intranet.","http://localhost/img/post.jpg", new Date(0) ,"Desarollo web Back-end"));
		post.add(new Post(4, "Desarrollo web es un término que define la creación de sitios web para Internet o una intranet.","http://localhost/img/post.jpg", new Date(0) ,"Desarollo web UX/IX"));
		return post;
	}

	@GetMapping(path = {"/post","/"})
	public String saludar(Model model) {
		model.addAttribute("posts",this.getPosts());
		return "index";
	}
		 	
}
