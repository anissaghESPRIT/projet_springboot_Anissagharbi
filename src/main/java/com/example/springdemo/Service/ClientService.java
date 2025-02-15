package com.example.springdemo.Service;

import com.example.springdemo.entities.Client;
import com.example.springdemo.repositories.ClientRepository;

import java.util.List;

public class ClientService implements IClientService {
    ClientRepository clientRepository;

    @Override
    public List<Client> retrieveAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client addClient(Client e) {
        return clientRepository.save(e);
    }

    @Override
    public Client updateClient(Client e) {
        return clientRepository.save(e);
    }

    @Override
    public Client retrieveClient(Long idClient) {
        return clientRepository.findById(idClient).get();
    }

    @Override
    public void removeClient(Long idClient) {
        clientRepository.deleteById(idClient);

    }

    @Override
    public List<Client> addClients(List<Client> clients) {
        return clientRepository.saveAll(clients);
    }
}
