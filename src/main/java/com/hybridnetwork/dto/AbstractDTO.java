package com.hybridnetwork.dto;

public abstract class AbstractDTO {
    
    private Integer id;

    public AbstractDTO() {
    }

    public AbstractDTO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
