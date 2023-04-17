package io.github.ValterGabriell.shoppingms.infra.repository;

import io.github.ValterGabriell.shoppingms.application.domain.ProductsBuyed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductBuyedRepository extends JpaRepository<ProductsBuyed, String> {

}
