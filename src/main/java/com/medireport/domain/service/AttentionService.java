package com.medireport.domain.service;

import com.medireport.domain.Attention;
import com.medireport.domain.repository.AttentionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttentionService {

    @Autowired
    private AttentionRepository attentionRepository;

    public List<Attention> getAll() {
        return attentionRepository.getAll();
    }

    public Optional<Attention> getAttention(int attentionId) {
        return attentionRepository.getAttention(attentionId);
    }

    public Optional<List<Attention>> getByAdviser(String adviserId) {
        return attentionRepository.getByAdviser(adviserId);
    }

    public Attention save(Attention attention) {
        return attentionRepository.newAttention(attention);
    }

}
