package com.example.rentalcar.controller.api;

import com.example.rentalcar.model.entity.Brand;
import com.example.rentalcar.service.BrandService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BrandController {
    BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/api/brands")
    public List<Brand> getAllBrands() {
        return brandService.getAllBrands();
    }

    @PostMapping("/api/brand")
    public Brand addBrand(@RequestBody Brand brand) {
        return brandService.createBrand(brand);
    }

    @PostMapping("/api/brands")
    public List<Brand> addBrands(@RequestBody List<Brand> brands) {
        return brandService.createBrands(brands);
    }

    @GetMapping("/api/brands/{id}")
    public Optional<Brand> getBrandById(@PathVariable Long id) {
        return brandService.getBrandById(id);
    }

    @PutMapping("/api/brand")
    public Brand editBrand(@RequestBody Brand brand) {
        return brandService.updateBrand(brand);
    }

    @DeleteMapping("/api/brand/{id}")
    public String deleteBrand(@PathVariable Long id) {
        return brandService.deleteBrand(id);
    }

    @DeleteMapping("/api/brands")
    public String deleteBrands(@RequestBody List<Brand> brands) {
        return brandService.deleteBrands(brands).toString();
    }
}
