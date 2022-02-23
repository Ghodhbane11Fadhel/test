package com.example.demo.api;

import com.example.demo.models.Ingredients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class ApiService {
    private final RestTemplate restTemplate;
    @Autowired
    public ApiService(RestTemplate restTemplate)
    {
        this.restTemplate=restTemplate;

    }
    public void getmekla(){

        var data =restTemplate.getForObject("https://api.spoonacular.com/recipes/findByIngredients?apiKey=8a7d17fa9581449e9600bd8457c07f9a&ingredients=apples,+flour,+sugar&number=10", Ingredients.class);
        System.out.println(data);
    }

}
