package com.sda.patterns.builder;

public class MyCar {
    private String name;
    private String description;

    private MyCar() {

    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String name;
        private String description;

        private Builder() {}

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }


        public MyCar build() {
            if(name.isEmpty()){
                throw new IllegalStateException("Name cannot be empty");
            }

            MyCar myCar = new MyCar();
            myCar.name = this.name;
            myCar.description = this.description;
            return myCar;
        }
    }

    @Override
    public String toString() {
        return "MyCar{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
