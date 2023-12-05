package com.sk.mediatechspringboot.service;

import com.sk.mediatechspringboot.dto.ClientDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClientService {
    Page<ClientDto> getAllClient(Pageable pageable);
    ClientDto findClientById(Long id);
    ClientDto findClientByName(String name);
    ClientDto saveClient(ClientDto clientDto);
     void deleteClient(Long id);
     ClientDto updateClient(ClientDto clientDto);

}
