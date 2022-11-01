package com.kampanya.favorite.repository;

import com.kampanya.favorite.entity.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavoriteRepository extends JpaRepository<Favorite,Integer> {

    List<Favorite> findByName(String name);
}
