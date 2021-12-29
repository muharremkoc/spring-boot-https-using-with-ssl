package com.example.springbootopenapiwithhttpsserver.service;

import com.example.springbootopenapiwithhttpsserver.dto.TelephoneDTO;
import com.example.springbootopenapiwithhttpsserver.model.Telephone;

public interface TelephoneService {

    Telephone save(TelephoneDTO telephoneDTO);
    Telephone getTelephone(int id);

}
