package com.soaint.converter;

import com.soaint.DTO.ClientIssfaDTO;
import com.soaint.entity.AcClientsPrivate;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ClientIssfaConverter {

    public ClientIssfaDTO convertirClientIssfaDAOtoDTO(AcClientsPrivate clientsPrivate, ModelMapper modelMapper){
        ClientIssfaDTO clientISSFADTO = new ClientIssfaDTO();

        modelMapper.map(clientsPrivate, clientISSFADTO);

        return clientISSFADTO;

    }

    public AcClientsPrivate convertirClientIssfaDTOtoDAO(ClientIssfaDTO clientIssfaDTO, ModelMapper modelMapper){

        AcClientsPrivate acClientsPrivate = new AcClientsPrivate();
        modelMapper.map(clientIssfaDTO, acClientsPrivate);

        return acClientsPrivate;

    }

}
