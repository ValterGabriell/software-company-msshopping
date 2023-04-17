package io.github.ValterGabriell.shoppingms.domain;

import io.github.ValterGabriell.shoppingms.domain.dto.CommonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
@RequiredArgsConstructor
public class ShopController {

    private final ShopService shopService;
    @GetMapping(params = {"protocol"})
    public ResponseEntity<CommonResponse<ProductsBuyed>> getProductByProductId(@RequestParam String protocol) {
        CommonResponse<ProductsBuyed> accountCardByClientCpf = shopService.getProductBuyedByProtocol(protocol);
        return new ResponseEntity<>(accountCardByClientCpf, HttpStatus.OK);
    }

}
