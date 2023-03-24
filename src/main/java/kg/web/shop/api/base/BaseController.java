package kg.web.shop.api.base;

import kg.web.shop.entitiy.BaseEntity;
import kg.web.shop.service.base.BaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class BaseController<ENTITY extends BaseEntity, SERVICE extends BaseService<ENTITY>> {
    final private SERVICE baseService;

    protected BaseController(SERVICE baseService) {
        this.baseService = baseService;
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<ENTITY>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(baseService.findById(id));
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<ENTITY>>findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(baseService.findByAll());
    }

    @PostMapping("/save")
    public ResponseEntity<ENTITY> save(@RequestBody ENTITY model){
        return ResponseEntity.status(HttpStatus.CREATED).body(baseService.create(model));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ENTITY> update(@RequestBody ENTITY model, @PathVariable Long id){
        model.setId(id);
        return ResponseEntity.status(HttpStatus.OK).body(baseService.update(model));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        baseService.deleteById(id);
    }
}
