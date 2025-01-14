// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRange {
    private Integer epochMillis;

    private DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRange() {}
    public Integer epochMillis() {
        return this.epochMillis;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer epochMillis;
        public Builder() {}
        public Builder(DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.epochMillis = defaults.epochMillis;
        }

        @CustomType.Setter
        public Builder epochMillis(Integer epochMillis) {
            this.epochMillis = Objects.requireNonNull(epochMillis);
            return this;
        }
        public DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRange build() {
            final var o = new DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRange();
            o.epochMillis = epochMillis;
            return o;
        }
    }
}
