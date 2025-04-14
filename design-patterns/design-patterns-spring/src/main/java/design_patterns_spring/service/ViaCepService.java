package design_patterns_spring.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import design_patterns_spring.model.Endereco;

@FeignClient(name = "viacep", url = "http://viacep.com.br/ws")
public interface ViaCepService {
    
    @GetMapping("/{cep}/json")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
