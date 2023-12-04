package com.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.util.Pair;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.util.Objects.isNull;

@Data
@Document(collation = "YearStructure")
@NoArgsConstructor
@AllArgsConstructor
public class YearStructure implements GenericObject {

    @Id
    private String id;

    private LocalDate startDate;
    private LocalDate endDate;

    @CreatedDate
    public Date createdAt;
    @LastModifiedDate
    private Date updatedAt;

    private List<Pair<LocalDate, LocalDate>> hollydayList = new ArrayList<>();

    @Override
    public String getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return isNull(createdAt);
    }
}
