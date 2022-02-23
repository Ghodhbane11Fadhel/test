package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ingredients {
    Long id ;
    String title;
    String image;
    String imageType;
    int usedIngredientCount,missedIngredientCount;
    List<MissedIngredients> MissedIngredients=new ArrayList<>();
    List<MissedIngredients> usedIngredients=new ArrayList<>();
    List<MissedIngredients> unusedIngredients=new ArrayList<>();
    int likes;






}
