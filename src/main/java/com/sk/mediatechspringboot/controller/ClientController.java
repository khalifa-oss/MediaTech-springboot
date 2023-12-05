package com.sk.mediatechspringboot.controller;

import com.sk.mediatechspringboot.dto.ClientDto;
import com.sk.mediatechspringboot.service.ClientService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
@AllArgsConstructor
public class ClientController {
    @Autowired
    @Qualifier ("impl1")
    private ClientService clientService;
    @PostMapping("")
    public ClientDto saveClient( @RequestBody ClientDto clientDto){
        return  clientService.saveClient( clientDto );
    }


}
