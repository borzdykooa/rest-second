package com.borzdykooa.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Класс, соответствующий сущности Trainer в первом приложении
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Mentor {

    private String name;
    private String language;
    private Integer experience;
}
