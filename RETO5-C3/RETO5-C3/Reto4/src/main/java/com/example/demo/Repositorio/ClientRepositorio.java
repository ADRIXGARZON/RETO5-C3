/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.CrudRepository.ClientInterface;
import com.example.demo.Entities.Client;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author adrix garzon
 */

@Repository

public class ClientRepositorio {
     @Autowired
     private ClientInterface clientCrudRepository;
     
       public List<Client> getAll(){
        return (List<Client>) clientCrudRepository.findAll();
    }
       
     public Optional<Client> getClient(int id){
        return clientCrudRepository.findById(id);
    }

    public Client save(Client client){
        return clientCrudRepository.save(client);
    }
    
     public void delete (Client client){
        clientCrudRepository.delete(client);
    }
}
