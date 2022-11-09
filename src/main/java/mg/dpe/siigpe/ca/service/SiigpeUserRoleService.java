package mg.dpe.siigpe.ca.service;

import java.util.List;
import java.util.Optional;
import mg.dpe.siigpe.ca.model.SiigpeRole;
import mg.dpe.siigpe.ca.model.SiigpeUser;

public interface SiigpeUserRoleService 
{
    Optional<SiigpeRole> findById(short id);
    
    SiigpeRole findByRole(String roleLib);
    
    List<SiigpeRole> findAll();
}
