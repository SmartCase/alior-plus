package pl.smartcases.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import pl.smartcases.entity.Application;
import pl.smartcases.entity.Package;
import pl.smartcases.entity.Parameter;
import pl.smartcases.repository.ApplicationRepository;
import pl.smartcases.repository.PackageRepository;
import pl.smartcases.repository.ParameterRepository;

@Service
@Transactional
public class PackageService {

	@Autowired
	private PackageRepository packageRepository;
	
	@Autowired
	private ApplicationRepository applicationRepository;
	
	@Autowired
	private ParameterRepository parameterRepository;
	
	
	public List<Package> findAll() {
		return packageRepository.findAll();
	}
	
	public Package findOne(int id) {
		return packageRepository.findOne(id);
	}

	@Transactional
	public Package findOneWithApp(int id) {
		// TODO Auto-generated method stub
		Package package1 = findOne(id);
		List<Application> applications = applicationRepository.findByPackage1(package1);
		for (Application application : applications) {
			List<Parameter> parameters = parameterRepository.findByApplication(application, new PageRequest(0, 20, Direction.DESC, "parameterName"));
			application.setParameters(parameters);
		}
		package1.setApplications(applications);
		return package1;
	}

	public void save(Package package1) {
		// TODO Auto-generated method stub
		packageRepository.save(package1);
	}
	
}
