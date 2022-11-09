
package mg.dpe.siigpe.ca.service;

import java.util.List;
import java.util.Optional;
import mg.dpe.siigpe.ca.model.SiigpeRole;
import mg.dpe.siigpe.ca.repository.SiigpeRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class SiigpeRoleServiceImpl implements SiigpeRoleService {
    
    @Autowired
    SiigpeRoleRepository repository;


    @Override
    public Optional<SiigpeRole> findById(short id) {
       return repository.findById(id);
    }

    @Override
    public SiigpeRole findByRole(String roleLib) {
        return repository.findByRoleId(roleLib);
        
    }

    @Override
    public List<SiigpeRole> findAll() {
          return repository.findAll();
    }

    
}