package com.example.watchShop.repository;

import com.example.watchShop.entity.WatchEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchRepo extends CrudRepository<WatchEntity, Integer> {

}
