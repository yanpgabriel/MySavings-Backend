package com.hybridnetwork.service;

import com.hybridnetwork.dao.ContaDAO;
import com.hybridnetwork.model.Conta;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class ContaService {
    
    @Inject
    ContaDAO dao;
    
    public List<Conta> list() {
        return dao.list(Conta.class);
    }
    
}
