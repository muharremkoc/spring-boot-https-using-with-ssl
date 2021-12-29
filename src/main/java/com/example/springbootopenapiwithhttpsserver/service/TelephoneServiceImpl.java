package com.example.springbootopenapiwithhttpsserver.service;

import com.example.springbootopenapiwithhttpsserver.dto.TelephoneDTO;
import com.example.springbootopenapiwithhttpsserver.mapper.TelephoneMapper;
import com.example.springbootopenapiwithhttpsserver.model.Telephone;
import com.example.springbootopenapiwithhttpsserver.repository.TelephoneRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class TelephoneServiceImpl implements TelephoneService{

     final TelephoneRepository telephoneRepository;
     final TelephoneMapper telephoneMapper;
    @Override
    public Telephone save(TelephoneDTO telephoneDTO) {
        Telephone telephone=telephoneMapper.telephoneDTOtoTelephone(telephoneDTO);
        return telephoneRepository.save(telephone);
    }

    @Override
    public Telephone getTelephone(int id) {

        return telephoneRepository.findById(id).orElseThrow();
    }
}
