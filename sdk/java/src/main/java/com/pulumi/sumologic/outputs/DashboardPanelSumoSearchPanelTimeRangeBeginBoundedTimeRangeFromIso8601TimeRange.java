// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange {
    private final String iso8601Time;

    @CustomType.Constructor
    private DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange(@CustomType.Parameter("iso8601Time") String iso8601Time) {
        this.iso8601Time = iso8601Time;
    }

    public String iso8601Time() {
        return this.iso8601Time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String iso8601Time;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iso8601Time = defaults.iso8601Time;
        }

        public Builder iso8601Time(String iso8601Time) {
            this.iso8601Time = Objects.requireNonNull(iso8601Time);
            return this;
        }        public DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange build() {
            return new DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange(iso8601Time);
        }
    }
}