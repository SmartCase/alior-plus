package pl.smartcases.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.smartcases.entity.Package;

public interface PackageRepository extends JpaRepository<Package, Integer> {

}
