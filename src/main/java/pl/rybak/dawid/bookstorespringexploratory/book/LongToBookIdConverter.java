package pl.rybak.dawid.bookstorespringexploratory.book;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class LongToBookIdConverter implements Converter<String, BookId> {

    @Override
    public BookId convert(String from) {
        return new BookId(Long.parseLong(from));
    }
}
