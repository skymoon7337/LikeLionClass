package com.skymoon7337.recipe_platform.controller;

import com.skymoon7337.recipe_platform.dto.IngredientDto;
import com.skymoon7337.recipe_platform.dto.IngredientResponseDto;
import com.skymoon7337.recipe_platform.model.Ingredient;
import com.skymoon7337.recipe_platform.service.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/ingredients")
@RequiredArgsConstructor
public class IngredientController {
    private final IngredientService ingredientService;

    @GetMapping
    public Page<IngredientResponseDto> list (
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("name").ascending());

        return ingredientService.list(pageable);
    }

    @GetMapping("/{id}")
    public IngredientResponseDto get(@PathVariable Long id) {
        return ingredientService.get(id);
    }

    @PostMapping
    public IngredientResponseDto create(@Validated @RequestBody IngredientDto dto) {
        return ingredientService.create(dto);
    }

    @PutMapping("/{id}")
    public IngredientResponseDto update(@PathVariable Long id, @Validated @RequestBody IngredientDto dto) {
        return ingredientService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        ingredientService.delete(id);

        return ResponseEntity.noContent().build();
    }
}