package com.kampanya.favorite.business;

import com.kampanya.favorite.entity.Favorite;
import com.kampanya.favorite.repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteService {

    private final FavoriteRepository favoriteRepository;

    @Autowired
    public FavoriteService(FavoriteRepository favoriteRepository) {

        this.favoriteRepository = favoriteRepository;
    }

    public List<Favorite> findAllFavorite(){
        return favoriteRepository.findAll();
    }

    public Favorite addFavorite(Favorite favorite){
        return favoriteRepository.save(favorite);
    }

    public void deleteFavoriteById(Integer favoriteId){
        favoriteRepository.deleteById(favoriteId);
    }

    public Favorite findFavoriteById(Integer favoriteId){
        return favoriteRepository.findById(favoriteId).get();
    }

    public List<Favorite> findFavoriteByName(String name){
        return favoriteRepository.findByName(name);
    }
}
