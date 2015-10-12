package pl.smartcases.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import pl.smartcases.entity.Application;
import pl.smartcases.entity.Parameter;

public interface ParameterRepository extends JpaRepository<Parameter, Integer>{

	List<Parameter> findByApplication(Application application, Pageable pageable);
}
