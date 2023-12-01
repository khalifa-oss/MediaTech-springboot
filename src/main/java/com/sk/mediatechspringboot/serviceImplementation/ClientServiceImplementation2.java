package com.sk.mediatechspringboot.serviceImplementation;

import com.sk.mediatechspringboot.dto.ClientDto;
import com.sk.mediatechspringboot.service.ClientService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service ("impl2")
public class ClientServiceImplementation2 implements ClientService {
    @Override
    public Page<ClientDto> getAllClient(Pageable pageable) {
        return null;
    }

    @Override
    public ClientDto findClientById(Long id) {
        return null;
    }

    @Override
    public ClientDto findClientByName(String name) {
        return null;
    }

    @Override
    public ClientDto saveClient(ClientDto clientDto) {
        return null;
    }

    @Override
    public void deleteClient(Long id) {

    }
}
