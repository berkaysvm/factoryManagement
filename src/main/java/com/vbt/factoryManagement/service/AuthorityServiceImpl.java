package com.vbt.factoryManagement.service;

import com.vbt.factoryManagement.dto.AuthorityListDTO;
import com.vbt.factoryManagement.mapper.AuthorityMapper;
import com.vbt.factoryManagement.repository.AuthorityRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorityServiceImpl implements AuthorityService {

    private AuthorityMapper authorityMapper;
    private AuthorityRepository authorityRepository;

    private AuthorityServiceImpl(AuthorityRepository authorityRepository, AuthorityMapper authorityMapper)
    {
        this.authorityMapper = authorityMapper;
        this.authorityRepository = authorityRepository;

    }

    @Override
    public AuthorityListDTO getAuthority(int id) {
        return authorityMapper.map(authorityRepository.getReferenceById(id));
    }

    @Override
    public String save(AuthorityListDTO authorityName) {
        authorityRepository.save(authorityMapper.convertEntitiy(authorityName));
        return "kayıt başarılı";
    }
}
