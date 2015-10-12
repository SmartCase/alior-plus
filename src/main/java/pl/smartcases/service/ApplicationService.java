package pl.smartcases.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.smartcases.entity.Application;
import pl.smartcases.repository.ApplicationRepository;

@Service
public class ApplicationService {

	@Autowired
	private ApplicationRepository applicationRepository;

	public List<Application> findAll() {
		return applicationRepository.findAll();

	}

	public List<Application> findByEnvironment() {
		return applicationRepository.findByEnvironment("PRD");
	}

}
