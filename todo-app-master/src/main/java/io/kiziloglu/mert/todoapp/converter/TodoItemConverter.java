package io.kiziloglu.mert.todoapp.converter;

import io.kiziloglu.mert.todoapp.dto.TodoItemDto;
import io.kiziloglu.mert.todoapp.model.TodoItem;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class TodoItemConverter implements Converter<TodoItem, TodoItemDto> {

    @Override
    public TodoItemDto convert(TodoItem item) {
        return new TodoItemDto(item.getItem(), item.isComplete());
    }
}
