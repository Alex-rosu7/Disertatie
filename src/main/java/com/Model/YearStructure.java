package com.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.util.Pair;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class YearStructure {

    private LocalDate startDate;
    private LocalDate endDate;
    private List<Pair<LocalDate, LocalDate>> hollydayList = new ArrayList<>();
}
