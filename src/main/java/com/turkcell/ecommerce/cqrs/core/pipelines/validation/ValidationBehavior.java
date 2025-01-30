package com.turkcell.ecommerce.cqrs.core.pipelines.validation;

import an.awesome.pipelinr.Command;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class ValidationBehavior implements Command.Middleware {

    private final Validator validator;

    public ValidationBehavior(Validator validator) {
        this.validator = validator;
    }

    @Override
    public <R, C extends Command<R>> R invoke(C command, Next<R> next) {
        Set<ConstraintViolation<C>> errors = validator.validate(command);

        if (!errors.isEmpty()) {
            List<ValidationError> errorList = errors
                    .stream()
                    .map(e -> new ValidationError(e.getPropertyPath().toString(), e.getMessage()))
                    .toList();
            System.out.println(errorList);
        }

        return next.invoke();
    }
}
