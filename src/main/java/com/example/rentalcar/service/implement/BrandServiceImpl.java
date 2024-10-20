package com.example.rentalcar.service.implement;

import com.example.rentalcar.model.entity.Brand;
import com.example.rentalcar.repository.BrandRepository;
import com.example.rentalcar.service.BrandService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService {
    private BrandRepository brandRepository;

    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

    @Override
    public Brand createBrand(Brand brand) {
        return brandRepository.save(brand);
    }

    @Override
    public List<Brand> createBrands(List<Brand> brands) {
        return brandRepository.saveAll(brands);
    }

    @Override
    public Optional<Brand> getBrandById(Long id) {
        return brandRepository.findById(id);
    }

    @Override
    public Brand updateBrand(Brand brand) {
        Brand brandToUpdate = brandRepository.findById(brand.getId()).orElse(null);

        brandToUpdate.setBrandName(brand.getBrandName());
        brandToUpdate.setDateAdded(brand.getDateAdded());
        return brandRepository.save(brandToUpdate);
    }

    @Override
    public String deleteBrand(Long id) {
        brandRepository.deleteById(id);
        return id + "Deleted";
    }

    @Override
    public List<Brand> deleteBrands(List<Brand> brands) {
        return List.of();
    }
}
