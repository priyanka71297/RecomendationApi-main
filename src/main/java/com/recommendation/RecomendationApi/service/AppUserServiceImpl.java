package com.recommendation.RecomendationApi.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.recommendation.RecomendationApi.model.AppUser;
import com.recommendation.RecomendationApi.repository.AppUserRepository;

public interface AppUserServiceImpl {

	List<AppUser> getAllUsers();

	AppUser signUpUser(AppUser appUser);

	AppUser signInUser(AppUser appUser);

	AppUser updateUser(AppUser appUser);

}


