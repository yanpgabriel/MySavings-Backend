package com.hybridnetwork.service;

import com.hybridnetwork.dao.ContaDAO;
import com.hybridnetwork.dto.ContaDTO;
import com.hybridnetwork.mappers.ContaMapper;
import com.hybridnetwork.model.Conta;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class ContaService {
    
    @Inject
    ContaDAO dao;
    
    private ContaMapper mapper = ContaMapper.INSTANCE;
    
    public List<Conta> list() {
        return dao.list(Conta.class);
    }

    public ContaDTO salvar(ContaDTO dto) {
        Conta entidade = mapper.toEntity(dto);
        boolean insert = dao.insert(entidade);
        return insert ? mapper.toDto(entidade) : null;
    }

    public ContaDTO atualizar(ContaDTO dto) {
        Conta entidade = mapper.toEntity(dto);
        return mapper.toDto(dao.update(entidade));
    }

    public boolean deletar(Integer idConta) {
        return dao.deleteById(Conta.class, idConta);
    }
}
