// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardPanelSumoSearchPanelLinkedDashboard {
    private final String id;
    private final @Nullable Boolean includeTimeRange;
    private final @Nullable Boolean includeVariables;
    private final @Nullable String relativePath;

    @CustomType.Constructor
    private DashboardPanelSumoSearchPanelLinkedDashboard(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("includeTimeRange") @Nullable Boolean includeTimeRange,
        @CustomType.Parameter("includeVariables") @Nullable Boolean includeVariables,
        @CustomType.Parameter("relativePath") @Nullable String relativePath) {
        this.id = id;
        this.includeTimeRange = includeTimeRange;
        this.includeVariables = includeVariables;
        this.relativePath = relativePath;
    }

    public String id() {
        return this.id;
    }
    public Optional<Boolean> includeTimeRange() {
        return Optional.ofNullable(this.includeTimeRange);
    }
    public Optional<Boolean> includeVariables() {
        return Optional.ofNullable(this.includeVariables);
    }
    public Optional<String> relativePath() {
        return Optional.ofNullable(this.relativePath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardPanelSumoSearchPanelLinkedDashboard defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable Boolean includeTimeRange;
        private @Nullable Boolean includeVariables;
        private @Nullable String relativePath;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardPanelSumoSearchPanelLinkedDashboard defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.includeTimeRange = defaults.includeTimeRange;
    	      this.includeVariables = defaults.includeVariables;
    	      this.relativePath = defaults.relativePath;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder includeTimeRange(@Nullable Boolean includeTimeRange) {
            this.includeTimeRange = includeTimeRange;
            return this;
        }
        public Builder includeVariables(@Nullable Boolean includeVariables) {
            this.includeVariables = includeVariables;
            return this;
        }
        public Builder relativePath(@Nullable String relativePath) {
            this.relativePath = relativePath;
            return this;
        }        public DashboardPanelSumoSearchPanelLinkedDashboard build() {
            return new DashboardPanelSumoSearchPanelLinkedDashboard(id, includeTimeRange, includeVariables, relativePath);
        }
    }
}