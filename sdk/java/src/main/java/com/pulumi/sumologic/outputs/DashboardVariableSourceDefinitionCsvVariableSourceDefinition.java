// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DashboardVariableSourceDefinitionCsvVariableSourceDefinition {
    private final String values;

    @CustomType.Constructor
    private DashboardVariableSourceDefinitionCsvVariableSourceDefinition(@CustomType.Parameter("values") String values) {
        this.values = values;
    }

    public String values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardVariableSourceDefinitionCsvVariableSourceDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String values;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardVariableSourceDefinitionCsvVariableSourceDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        public Builder values(String values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }        public DashboardVariableSourceDefinitionCsvVariableSourceDefinition build() {
            return new DashboardVariableSourceDefinitionCsvVariableSourceDefinition(values);
        }
    }
}