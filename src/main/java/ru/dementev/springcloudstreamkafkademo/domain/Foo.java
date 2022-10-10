package ru.dementev.springcloudstreamkafkademo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;


public class Foo {
    public Foo(String bar) {
        this.bar = bar;
    }

    public String getBar() {
        return bar;
    }

    private String bar;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Foo foo = (Foo) o;
        return Objects.equals(bar, foo.bar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bar);
    }
}
