package org.example.Q91;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employee {

    private String name;
    private LocalDate birthday;

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    List<Employee> roster = new ArrayList<>();
    Predicate<Employee> y = (Employee e) -> e.getBirthday().isBefore(IsoChronology.INSTANCE.date(1989,1,1));
    //Set<String> s1 = roster.stream().collect(Collectors.partitioningBy(y, Collectors.mapping(Employee :: getName,Collectors.toSet())));
}
