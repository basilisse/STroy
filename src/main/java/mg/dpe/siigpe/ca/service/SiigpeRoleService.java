
package mg.dpe.siigpe.ca.service;

import java.util.List;
import java.util.Optional;
import mg.dpe.siigpe.ca.model.SiigpeRole;

public interface SiigpeRoleService {
    
    Optional<SiigpeRole> findById(short id);
    
    SiigpeRole findByRole(String roleLib);
    
    List<SiigpeRole> findAll();
    
}
