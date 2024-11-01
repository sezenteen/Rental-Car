package com.example.rentalcar.controller.api;

import com.example.rentalcar.model.entity.ClientSupport;
import com.example.rentalcar.service.ClientSupportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClientSupportControllerApi {
    ClientSupportService clientSupportService;

    public ClientSupportControllerApi(ClientSupportService clientSupportService) {
        this.clientSupportService = clientSupportService;
    }

    @GetMapping("/api/clientsupports")
    public List<ClientSupport> getClientSupports() {
        return clientSupportService.getAllClientSupport();
    }

    @GetMapping("/api/clientsupport/{id}")
    public Optional<ClientSupport> getClientSupport(@PathVariable Long id) {
        return clientSupportService.getClientSupportById(id);
    }

    @PostMapping("/api/clientsupport")
    public ClientSupport addClientSupport(@RequestBody ClientSupport clientSupport) {
        return clientSupportService.createClientSupport(clientSupport);
    }

    @PostMapping("/api/clientsupports")
    public List<ClientSupport> addClientSupports(@RequestBody List<ClientSupport> clientSupport) {
        return clientSupportService.createClientSupports(clientSupport);
    }

    @PutMapping("/api/clientsupport")
    public ClientSupport editClientSupport(@RequestBody ClientSupport clientSupport) {
        return clientSupportService.updateClientSupport(clientSupport);
    }

    @DeleteMapping("/api/clientsupport/{id}")
    public String deleteClientSupport(@PathVariable Long id) {
        return clientSupportService.deleteClientSupport(id);
    }

    @DeleteMapping("/api/clientsupports")
    public List<ClientSupport> deleteClientSupports(@RequestBody List<ClientSupport> clientSupports) {
        return clientSupportService.deleteClientSupports(clientSupports);
    }
}
