package com.example.rentalcar.service.implement;

import com.example.rentalcar.model.entity.ClientSupport;
import com.example.rentalcar.service.ClientSupportService;

import java.util.List;
import java.util.Optional;

public class ClientSupportServiceImpl implements ClientSupportService {
    @Override
    public List<ClientSupport> getAllClientSupport() {
        return List.of();
    }

    @Override
    public ClientSupport createClientSupport(ClientSupport clientSupport) {
        return null;
    }

    @Override
    public List<ClientSupport> createClientSupports(List<ClientSupport> clientSupports) {
        return List.of();
    }

    @Override
    public Optional<ClientSupport> getClientSupportById(Long id) {
        return Optional.empty();
    }

    @Override
    public ClientSupport updateClientSupport(ClientSupport clientSupport) {
        return null;
    }

    @Override
    public String deleteClientSupport(Long id) {
        return "";
    }

    @Override
    public List<ClientSupport> deleteClientSupports(List<ClientSupport> clientSupports) {
        return List.of();
    }
}
