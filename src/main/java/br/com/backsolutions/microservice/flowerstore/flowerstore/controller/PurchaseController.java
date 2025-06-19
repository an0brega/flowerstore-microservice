package br.com.backsolutions.microservice.flowerstore.flowerstore.controller;

import br.com.backsolutions.microservice.flowerstore.flowerstore.DTO.PurchaseDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @RequestMapping(method = RequestMethod.POST)
    public void realizePurchase(@RequestBody PurchaseDTO purchase){

    }
}
