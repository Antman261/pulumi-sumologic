// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sumologic.outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromEpochTimeRange;
import com.pulumi.sumologic.outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange;
import com.pulumi.sumologic.outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange;
import com.pulumi.sumologic.outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFrom {
    private @Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromEpochTimeRange epochTimeRange;
    private @Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange iso8601TimeRange;
    private @Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange literalTimeRange;
    private @Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange relativeTimeRange;

    private DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFrom() {}
    public Optional<DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromEpochTimeRange> epochTimeRange() {
        return Optional.ofNullable(this.epochTimeRange);
    }
    public Optional<DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange> iso8601TimeRange() {
        return Optional.ofNullable(this.iso8601TimeRange);
    }
    public Optional<DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange> literalTimeRange() {
        return Optional.ofNullable(this.literalTimeRange);
    }
    public Optional<DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange> relativeTimeRange() {
        return Optional.ofNullable(this.relativeTimeRange);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFrom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromEpochTimeRange epochTimeRange;
        private @Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange iso8601TimeRange;
        private @Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange literalTimeRange;
        private @Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange relativeTimeRange;
        public Builder() {}
        public Builder(DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFrom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.epochTimeRange = defaults.epochTimeRange;
    	      this.iso8601TimeRange = defaults.iso8601TimeRange;
    	      this.literalTimeRange = defaults.literalTimeRange;
    	      this.relativeTimeRange = defaults.relativeTimeRange;
        }

        @CustomType.Setter
        public Builder epochTimeRange(@Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromEpochTimeRange epochTimeRange) {
            this.epochTimeRange = epochTimeRange;
            return this;
        }
        @CustomType.Setter
        public Builder iso8601TimeRange(@Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange iso8601TimeRange) {
            this.iso8601TimeRange = iso8601TimeRange;
            return this;
        }
        @CustomType.Setter
        public Builder literalTimeRange(@Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange literalTimeRange) {
            this.literalTimeRange = literalTimeRange;
            return this;
        }
        @CustomType.Setter
        public Builder relativeTimeRange(@Nullable DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange relativeTimeRange) {
            this.relativeTimeRange = relativeTimeRange;
            return this;
        }
        public DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFrom build() {
            final var o = new DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFrom();
            o.epochTimeRange = epochTimeRange;
            o.iso8601TimeRange = iso8601TimeRange;
            o.literalTimeRange = literalTimeRange;
            o.relativeTimeRange = relativeTimeRange;
            return o;
        }
    }
}
