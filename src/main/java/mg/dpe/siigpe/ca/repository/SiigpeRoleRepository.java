package mg.dpe.siigpe.ca.repository;

import mg.dpe.siigpe.ca.model.SiigpeRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiigpeRoleRepository extends JpaRepository<SiigpeRole, Short>{
    
	SiigpeRole findByRoleId(String roleLib);

}