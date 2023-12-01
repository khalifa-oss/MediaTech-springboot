package com.sk.mediatechspringboot.controller;

import com.sk.mediatechspringboot.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
@AllArgsConstructor
public class ClientController {
    @Qualifier ("impl1")
    private ClientService clientService;

}
