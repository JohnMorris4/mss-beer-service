package com.morrisje.mssbeerservice.bootstrap;

import com.morrisje.mssbeerservice.domain.Beer;
import com.morrisje.mssbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * John Morris - 4/3/20
 * mss-beer-service
 **/
@Component
public class BeerLoader implements CommandLineRunner {
    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0){
            beerRepository.save(Beer.builder()
                    .beerName("Bud Light")
                    .beerStyle("American Light Lager")
                    .quantityToBrew(1000)
                    .minOnHand(50)
                    .upc(18200007699L)
                    .price(new BigDecimal("12.25"))
                    .build());
            beerRepository.save(Beer.builder()
                    .beerName("Coors Light")
                    .beerStyle("American Light Lager")
                    .quantityToBrew(400)
                    .minOnHand(25)
                    .upc(18200005399L)
                    .price(new BigDecimal("12.65"))
                    .build());
            beerRepository.save(Beer.builder()
                    .beerName("Budweiser")
                    .beerStyle("American Lager")
                    .quantityToBrew(800)
                    .minOnHand(100)
                    .upc(18200007399L)
                    .price(new BigDecimal("14.00"))
                    .build());
        }
    }
}
