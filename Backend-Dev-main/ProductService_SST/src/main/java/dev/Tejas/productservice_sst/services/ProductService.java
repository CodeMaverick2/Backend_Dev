package dev.Tejas.productservice_sst.services;

import dev.Tejas.productservice_sst.models.Product;

import java.util.*;

public interface ProductService {
      Product getProductById(Long id);
      List<Product> getAllProducts();
}
