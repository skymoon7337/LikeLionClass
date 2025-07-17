package com.skymoon7337.recipe_platform.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode // 값이 같으면 같은 객체로 취급 //equals(), hashCode()를 자동 생성
public class RecipeIngredientId implements Serializable {
    private Long recipeId;
    private Long ingredientId;
}
