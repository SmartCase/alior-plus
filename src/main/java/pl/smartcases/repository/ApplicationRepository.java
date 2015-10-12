package pl.smartcases.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pl.smartcases.entity.Application;
import pl.smartcases.entity.Package;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {

	@Query("select a from Application a where a.environment = ?1 and a.version in (select max(b.version) from Application b where a.name=b.name and a.environment=b.environment)")
		  List<Application> findByEnvironment(String environment);

	List<Application> findByPackage1(Package package1);
	
}
