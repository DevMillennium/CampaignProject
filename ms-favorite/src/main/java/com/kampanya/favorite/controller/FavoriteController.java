package com.kampanya.favorite.controller;

import com.kampanya.favorite.business.FavoriteService;
import com.kampanya.favorite.entity.Favorite;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/favorite")
public class FavoriteController {

    private final FavoriteService favoriteService;

    public FavoriteController(FavoriteService favoriteService) {
        this.favoriteService = favoriteService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Favorite>> getAllCustomer(){
        List<Favorite> allFavorite = favoriteService.findAllFavorite();
        return new ResponseEntity<List<Favorite>>(allFavorite, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Favorite> addFavorite(@RequestBody Favorite favorite){
        Favorite addFavorite = favoriteService.addFavorite(favorite);
        return new ResponseEntity<Favorite>(addFavorite,HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFavorite(@PathVariable("id") Integer id){
        favoriteService.deleteFavoriteById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Favorite> getFavorite(@PathVariable("id") Integer id){
        Favorite findFavorite = favoriteService.findFavoriteById(id);
        return new ResponseEntity<>(findFavorite,HttpStatus.OK);
    }

    @GetMapping("/getByName/{name}")
    public ResponseEntity<List<Favorite>> getFavoriteName(@PathVariable("name") String name){
        List<Favorite> favorites = favoriteService.findFavoriteByName(name);
        return new ResponseEntity<List<Favorite>>(favorites,HttpStatus.OK);
    }

}
