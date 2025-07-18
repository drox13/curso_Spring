package com.andres.curso.springboot.app.springbootcrud.validation;


import com.andres.curso.springboot.app.springbootcrud.services.ProductService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IsExistDbValidator implements ConstraintValidator<IsExistDb, String> {

    @Autowired
    private ProductService productService;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(productService != null){
            return !productService.existsBySku(value);
        }
        return true;
    }
}
