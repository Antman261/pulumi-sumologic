// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DashboardTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange {
    private final String relativeTime;

    @CustomType.Constructor
    private DashboardTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange(@CustomType.Parameter("relativeTime") String relativeTime) {
        this.relativeTime = relativeTime;
    }

    public String relativeTime() {
        return this.relativeTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String relativeTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.relativeTime = defaults.relativeTime;
        }

        public Builder relativeTime(String relativeTime) {
            this.relativeTime = Objects.requireNonNull(relativeTime);
            return this;
        }        public DashboardTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange build() {
            return new DashboardTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange(relativeTime);
        }
    }
}