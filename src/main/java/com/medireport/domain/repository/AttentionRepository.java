package com.medireport.domain.repository;

import com.medireport.domain.Attention;

import java.util.List;
import java.util.Optional;

public interface AttentionRepository {

    List<Attention> getAll();

    Optional<Attention> getAttention(int atencionId);

    Optional<List<Attention>> getByAdviser(String adviserId);

    Attention newAttention(Attention attention);
}
