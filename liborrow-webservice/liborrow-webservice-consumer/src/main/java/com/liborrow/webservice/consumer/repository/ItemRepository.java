package com.liborrow.webservice.consumer.repository;

import java.util.List;

import org.liborrow.webservice.model.entities.Item;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ItemRepository extends ItemBaseRepository<Item> {
	@Override
    List<Item> findAll();
}
