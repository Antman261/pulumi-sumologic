// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRoleResult {
    private List<String> capabilities;
    private String description;
    private String filterPredicate;
    private String id;
    private String name;

    private GetRoleResult() {}
    public List<String> capabilities() {
        return this.capabilities;
    }
    public String description() {
        return this.description;
    }
    public String filterPredicate() {
        return this.filterPredicate;
    }
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> capabilities;
        private String description;
        private String filterPredicate;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetRoleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilities = defaults.capabilities;
    	      this.description = defaults.description;
    	      this.filterPredicate = defaults.filterPredicate;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder capabilities(List<String> capabilities) {
            this.capabilities = Objects.requireNonNull(capabilities);
            return this;
        }
        public Builder capabilities(String... capabilities) {
            return capabilities(List.of(capabilities));
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder filterPredicate(String filterPredicate) {
            this.filterPredicate = Objects.requireNonNull(filterPredicate);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetRoleResult build() {
            final var o = new GetRoleResult();
            o.capabilities = capabilities;
            o.description = description;
            o.filterPredicate = filterPredicate;
            o.id = id;
            o.name = name;
            return o;
        }
    }
}
