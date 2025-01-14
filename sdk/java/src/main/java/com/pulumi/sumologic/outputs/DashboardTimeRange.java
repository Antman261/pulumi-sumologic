// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sumologic.outputs.DashboardTimeRangeBeginBoundedTimeRange;
import com.pulumi.sumologic.outputs.DashboardTimeRangeCompleteLiteralTimeRange;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardTimeRange {
    private @Nullable DashboardTimeRangeBeginBoundedTimeRange beginBoundedTimeRange;
    private @Nullable DashboardTimeRangeCompleteLiteralTimeRange completeLiteralTimeRange;

    private DashboardTimeRange() {}
    public Optional<DashboardTimeRangeBeginBoundedTimeRange> beginBoundedTimeRange() {
        return Optional.ofNullable(this.beginBoundedTimeRange);
    }
    public Optional<DashboardTimeRangeCompleteLiteralTimeRange> completeLiteralTimeRange() {
        return Optional.ofNullable(this.completeLiteralTimeRange);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardTimeRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardTimeRangeBeginBoundedTimeRange beginBoundedTimeRange;
        private @Nullable DashboardTimeRangeCompleteLiteralTimeRange completeLiteralTimeRange;
        public Builder() {}
        public Builder(DashboardTimeRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.beginBoundedTimeRange = defaults.beginBoundedTimeRange;
    	      this.completeLiteralTimeRange = defaults.completeLiteralTimeRange;
        }

        @CustomType.Setter
        public Builder beginBoundedTimeRange(@Nullable DashboardTimeRangeBeginBoundedTimeRange beginBoundedTimeRange) {
            this.beginBoundedTimeRange = beginBoundedTimeRange;
            return this;
        }
        @CustomType.Setter
        public Builder completeLiteralTimeRange(@Nullable DashboardTimeRangeCompleteLiteralTimeRange completeLiteralTimeRange) {
            this.completeLiteralTimeRange = completeLiteralTimeRange;
            return this;
        }
        public DashboardTimeRange build() {
            final var o = new DashboardTimeRange();
            o.beginBoundedTimeRange = beginBoundedTimeRange;
            o.completeLiteralTimeRange = completeLiteralTimeRange;
            return o;
        }
    }
}
