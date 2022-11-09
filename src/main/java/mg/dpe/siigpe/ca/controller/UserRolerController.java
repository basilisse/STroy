
package mg.dpe.siigpe.ca.controller;

import java.util.List;
import mg.dpe.siigpe.ca.model.SiigpeRole;
import mg.dpe.siigpe.ca.model.SiigpeUser;
import mg.dpe.siigpe.ca.service.SiigpeRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mg.dpe.siigpe.ca.service.SiigpeUserRoleService;
import mg.dpe.siigpe.ca.service.SiigpeUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:3000"}, allowedHeaders = {"Content-type"})
public class UserRolerController {
    @Autowired
    private SiigpeRoleService service;
    private SiigpeUserService UserService;
    //prendre tout
    public ResponseEntity<List<SiigpeRole>> getAllUserRoles(){
        return ResponseEntity.ok(service.findAll());
    }
   
}
