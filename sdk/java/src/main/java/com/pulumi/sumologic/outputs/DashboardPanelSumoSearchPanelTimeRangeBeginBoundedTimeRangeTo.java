// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sumologic.outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRange;
import com.pulumi.sumologic.outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToIso8601TimeRange;
import com.pulumi.sumologic.outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToLiteralTimeRange;
import com.pulumi.sumologic.outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToRelativeTimeRange;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeTo {
    private @Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRange epochTimeRange;
    private @Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToIso8601TimeRange iso8601TimeRange;
    private @Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToLiteralTimeRange literalTimeRange;
    private @Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToRelativeTimeRange relativeTimeRange;

    private DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeTo() {}
    public Optional<DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRange> epochTimeRange() {
        return Optional.ofNullable(this.epochTimeRange);
    }
    public Optional<DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToIso8601TimeRange> iso8601TimeRange() {
        return Optional.ofNullable(this.iso8601TimeRange);
    }
    public Optional<DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToLiteralTimeRange> literalTimeRange() {
        return Optional.ofNullable(this.literalTimeRange);
    }
    public Optional<DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToRelativeTimeRange> relativeTimeRange() {
        return Optional.ofNullable(this.relativeTimeRange);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeTo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRange epochTimeRange;
        private @Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToIso8601TimeRange iso8601TimeRange;
        private @Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToLiteralTimeRange literalTimeRange;
        private @Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToRelativeTimeRange relativeTimeRange;
        public Builder() {}
        public Builder(DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeTo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.epochTimeRange = defaults.epochTimeRange;
    	      this.iso8601TimeRange = defaults.iso8601TimeRange;
    	      this.literalTimeRange = defaults.literalTimeRange;
    	      this.relativeTimeRange = defaults.relativeTimeRange;
        }

        @CustomType.Setter
        public Builder epochTimeRange(@Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRange epochTimeRange) {
            this.epochTimeRange = epochTimeRange;
            return this;
        }
        @CustomType.Setter
        public Builder iso8601TimeRange(@Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToIso8601TimeRange iso8601TimeRange) {
            this.iso8601TimeRange = iso8601TimeRange;
            return this;
        }
        @CustomType.Setter
        public Builder literalTimeRange(@Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToLiteralTimeRange literalTimeRange) {
            this.literalTimeRange = literalTimeRange;
            return this;
        }
        @CustomType.Setter
        public Builder relativeTimeRange(@Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToRelativeTimeRange relativeTimeRange) {
            this.relativeTimeRange = relativeTimeRange;
            return this;
        }
        public DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeTo build() {
            final var o = new DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeTo();
            o.epochTimeRange = epochTimeRange;
            o.iso8601TimeRange = iso8601TimeRange;
            o.literalTimeRange = literalTimeRange;
            o.relativeTimeRange = relativeTimeRange;
            return o;
        }
    }
}
