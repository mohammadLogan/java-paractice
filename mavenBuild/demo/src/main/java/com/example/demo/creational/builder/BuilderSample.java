package com.example.demo.creational.builder;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BuilderSample {

    private String name;
    private String family;
    private Address address;

    private BuilderSample(BuilderSampleBuilder builder) {
        this.name = builder.name;
        this.family = builder.family;
    }

    public static class BuilderSampleBuilder {
        private String name;
        private String family;

        public BuilderSampleBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public BuilderSampleBuilder setFamily(String family) {
            this.family = family;
            return this;
        }

        public BuilderSampleBuilder() {
        }

        public BuilderSample build() {
            return new BuilderSample(this);
        }
    }
}
