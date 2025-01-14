// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AwsInventorySourceFilter {
    private String filterType;
    private @Nullable String mask;
    private String name;
    private String regexp;

    private AwsInventorySourceFilter() {}
    public String filterType() {
        return this.filterType;
    }
    public Optional<String> mask() {
        return Optional.ofNullable(this.mask);
    }
    public String name() {
        return this.name;
    }
    public String regexp() {
        return this.regexp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsInventorySourceFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String filterType;
        private @Nullable String mask;
        private String name;
        private String regexp;
        public Builder() {}
        public Builder(AwsInventorySourceFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterType = defaults.filterType;
    	      this.mask = defaults.mask;
    	      this.name = defaults.name;
    	      this.regexp = defaults.regexp;
        }

        @CustomType.Setter
        public Builder filterType(String filterType) {
            this.filterType = Objects.requireNonNull(filterType);
            return this;
        }
        @CustomType.Setter
        public Builder mask(@Nullable String mask) {
            this.mask = mask;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder regexp(String regexp) {
            this.regexp = Objects.requireNonNull(regexp);
            return this;
        }
        public AwsInventorySourceFilter build() {
            final var o = new AwsInventorySourceFilter();
            o.filterType = filterType;
            o.mask = mask;
            o.name = name;
            o.regexp = regexp;
            return o;
        }
    }
}
