package pl.smartcases.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.smartcases.entity.Application;
import pl.smartcases.entity.Package;
import pl.smartcases.entity.Parameter;
import pl.smartcases.entity.Role;
import pl.smartcases.entity.User;
import pl.smartcases.repository.ApplicationRepository;
import pl.smartcases.repository.PackageRepository;
import pl.smartcases.repository.ParameterRepository;
import pl.smartcases.repository.RoleRepository;
import pl.smartcases.repository.UserRepository;

@Transactional
@Service
public class InitDbService {

	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired   
	private UserRepository userRepository;
	
	@Autowired
	private ApplicationRepository applicationRepository;
	
	@Autowired
	private PackageRepository packageRepository;
	
	@Autowired
	private ParameterRepository parameterRepository;
	
	@PostConstruct
	public void init() {
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);
		
		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);
		
		User userAdmin = new User();
		userAdmin.setName("admin");
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleAdmin);
		roles.add(roleUser);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);
		
		Package package1 = new Package();
		package1.setPackageNumber(1234);
		// package1.setPackageDate('2015-01-01');
		packageRepository.save(package1);
		
		Application application1 = new Application();
		application1.setName("pl.asseco.promak.pmplus.pok.app");
		application1.setVersion("9.0.44");
		application1.setEnvironment("TST");
		application1.setPackage1(package1);
		applicationRepository.save(application1);
		
		Parameter parameter1 = new Parameter();
		parameter1.setParameterName("Parametr1");
		parameter1.setApplication(application1);
		parameterRepository.save(parameter1);
		
		Parameter parameter2 = new Parameter();
		parameter2.setParameterName("Parametr2");
		parameter2.setApplication(application1);
		parameterRepository.save(parameter2);
		
		
		
	}
	
}
