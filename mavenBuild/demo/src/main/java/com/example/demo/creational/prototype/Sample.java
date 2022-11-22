package com.example.demo.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sample implements Cloneable {

    private String name;
    private String family;
    private int age;
    private Sample2 sample2;

    private Sample(SampleBuilder builder) {
        this.name = builder.name;
        this.family = builder.family;
        this.age = builder.age;
        this.sample2 = builder.sample2;
    }

    @Override
    public Sample clone() {
        try {
            return (Sample) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public static class SampleBuilder {
        private String name;
        private String family;
        private int age;
        private Sample2 sample2;

        public SampleBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public SampleBuilder setFamily(String family) {
            this.family = family;
            return this;
        }

        public SampleBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public SampleBuilder setSample2(Sample2 sample2) {
            this.sample2 = sample2;
            return this;
        }

        public SampleBuilder() {
        }

        public Sample build() {
            return new Sample(this);
        }
    }
}
