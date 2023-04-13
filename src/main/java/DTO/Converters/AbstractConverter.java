package DTO.Converters;

import org.springframework.core.convert.converter.Converter;

import java.util.List;
import java.util.stream.Collectors;


// S - Source type to convert
// T - Target type to convert to

public abstract class AbstractConverter <S, T> implements Converter<S, T> {

    public List<T> convert(List<S> listToConvert){

        return listToConvert.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }

}
