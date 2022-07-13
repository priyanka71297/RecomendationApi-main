package com.recommendation.RecomendationApi.service;


import com.recommendation.RecomendationApi.model.Author;

public interface AuthorService {

	Author addAuthor(Author author);

	Author getAuthorById(int authorid);



}
