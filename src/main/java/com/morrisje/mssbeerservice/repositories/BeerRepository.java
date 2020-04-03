package com.morrisje.mssbeerservice.repositories;

import com.morrisje.mssbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * John Morris - 4/3/20
 * mss-beer-service
 **/
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
