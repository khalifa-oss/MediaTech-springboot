package com.sk.mediatechspringboot.serviceImplementation;

import com.sk.mediatechspringboot.dto.ClientDto;
import com.sk.mediatechspringboot.model.Client;
import com.sk.mediatechspringboot.repository.ClientRepository;
import com.sk.mediatechspringboot.service.ClientService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service("impl1")
@AllArgsConstructor
public class ClientServiceImplementation1 implements ClientService {
    private ModelMapper modelMapper;
    private ClientRepository clientRepository;
    @Override
    public Page<ClientDto> getAllClient(Pageable pageable) {
        pageable = PageRequest.of( 5,5 );
        Page<Client> page = clientRepository.findAll(pageable);

         List<ClientDto> clientDtoList= page.getContent().stream().
                  map( client->modelMapper.map( client,ClientDto.class ) ).collect( Collectors.toList() );
         return new PageImpl<>( clientDtoList,page.getPageable(),page.getTotalElements() );
    }

    @Override
    public ClientDto findClientById(Long id) {
        Client client = clientRepository.findById( id ).
                orElseThrow(()->new RuntimeException(String.format( "this Client with id %d was not found",id )));

        return modelMapper.map( client,ClientDto.class );
    }

    @Override
    public ClientDto findClientByName(String name) {

        Client client =  clientRepository.findByNameClient( name ).
                orElseThrow(()->new RuntimeException(String.format( "this Client with id %s was not found",name )));

        return modelMapper.map( client,ClientDto.class );
    }

    @Override
    public ClientDto saveClient(ClientDto clientDto) {
        Client client =modelMapper.map( clientDto,Client.class );
        return modelMapper.map(  clientRepository.save( client ),ClientDto.class);
    }

    @Override
    public void deleteClient(Long id) {
       Optional< Client > clientOptional = clientRepository.findById( id );
       if( clientOptional.isPresent()){
           clientRepository.delete( clientOptional.get() );
       }else {
           throw new RuntimeException(String.format( "this Client with id %d was not found",id ));
       }




    }
}
