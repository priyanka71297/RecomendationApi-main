package com.recommendation.RecomendationApi.controller;

	//import java.util.List;

	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//	import org.springframework.http.HttpStatus;
//	import org.springframework.http.ResponseEntity;
	//import org.springframework.web.bind.annotation.CrossOrigin;
//	import org.springframework.web.bind.annotation.GetMapping;
//	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	// @org.springframework.beans.factory.annotation.Autowired(required=true)
	import com.recommendation.RecomendationApi.model.Author;

import com.recommendation.RecomendationApi.service.AuthorService;

	@RestController
	@RequestMapping("/author")
	//@CrossOrigin(origins = "*")

  public class AuthorController {

		@Autowired
		AuthorService authorService;

		private final Logger LOG = LoggerFactory.getLogger(this.getClass());
//
//		// http://localhost:9999/dep/get-all-deps
//		@GetMapping("/get-all-authors")
//		public ResponseEntity<List<Author>> getAllDeps() {
//			List<Department> depList = Author.getAllDepartments();
//			for (Department dep : depList)
//				LOG.info(dep.toString());
//			HttpStatus status = HttpStatus.OK;
//			ResponseEntity<List<Department>> response = new ResponseEntity<>(depList, status);
//			return response;
//		}
//
		// http://localhost:9999/dep/get-dep-by-id/{did}
		@GetMapping("/get-author-by-authorid/{authorid}")
		public ResponseEntity<ResponseEntity<Author> getAuthorById(@PathVariable(name = "authorid") int authorid) {
			LOG.info(Integer.toString(authorid));
			Author dep = authorService.getAuthorById(authorid);
			HttpStatus status = HttpStatus.OK;
			ResponseEntity<Author> response = new ResponseEntity<>(dep, status);
			return response;
		}

		// http://localhost:9999/dep/add-dep
		@PostMapping("/add-author")
		public Author addAuthor(@RequestBody Author author) {
			LOG.info(author.toString());
			return authorService.addAuthor(author);
		}

	}
