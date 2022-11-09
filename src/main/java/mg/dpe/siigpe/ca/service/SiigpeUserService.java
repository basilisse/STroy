
package mg.dpe.siigpe.ca.service;

import java.util.List;
import java.util.Optional;
import mg.dpe.siigpe.ca.model.SiigpeUser;


public interface SiigpeUserService {
    
    Optional<SiigpeUser> findById(short id);
    
    SiigpeUser findByUsername(String username);
    
    List<SiigpeUser> findAll();
    
    SiigpeUser save(SiigpeUser user);
    
}
