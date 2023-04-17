package io.github.ValterGabriell.shoppingms.infra.repository;

import io.github.ValterGabriell.shoppingms.domain.ProductsBuyed;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductBuyedRepository extends JpaRepository<ProductsBuyed, String> {

}
