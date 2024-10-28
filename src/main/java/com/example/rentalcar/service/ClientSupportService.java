package com.example.rentalcar.service;

import com.example.rentalcar.model.entity.ClientSupport;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ClientSupportService {
    List<ClientSupport> getAllClientSupport();

    public ClientSupport createClientSupport(ClientSupport clientSupport);

    List<ClientSupport> createClientSupports(List<ClientSupport> clientSupports);

    public Optional<ClientSupport> getClientSupportById(Long id);

    public ClientSupport updateClientSupport(ClientSupport clientSupport);

    public String deleteClientSupport(Long id);

    List<ClientSupport> deleteClientSupports(List<ClientSupport> clientSupports);

}
