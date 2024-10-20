package com.example.rentalcar.service;

import com.example.rentalcar.model.entity.Brand;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BrandService {

    List<Brand> getAllBrands();

    // 1 brandiin medeelel vvsgeh
    public Brand createBrand(Brand brand);

    // Olon brandiin medeelel vvsgeh
    List<Brand> createBrands(List<Brand> brands);

    // 1 brandiin medeelel harah
    public Optional<Brand> getBrandById(Long id);

    // 1 brandiin medeelel zasvarlah
    public Brand updateBrand(Brand brand);

    // 1 brandiin medeelel ustgah
    public String deleteBrand(Long id);

    // bvh brandiin medeelliig ustgah
    List<Brand> deleteBrands(List<Brand> brands);
}
