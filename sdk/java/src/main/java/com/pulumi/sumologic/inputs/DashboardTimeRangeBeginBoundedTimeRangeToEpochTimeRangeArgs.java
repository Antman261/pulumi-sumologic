// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class DashboardTimeRangeBeginBoundedTimeRangeToEpochTimeRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardTimeRangeBeginBoundedTimeRangeToEpochTimeRangeArgs Empty = new DashboardTimeRangeBeginBoundedTimeRangeToEpochTimeRangeArgs();

    @Import(name="epochMillis", required=true)
    private Output<Integer> epochMillis;

    public Output<Integer> epochMillis() {
        return this.epochMillis;
    }

    private DashboardTimeRangeBeginBoundedTimeRangeToEpochTimeRangeArgs() {}

    private DashboardTimeRangeBeginBoundedTimeRangeToEpochTimeRangeArgs(DashboardTimeRangeBeginBoundedTimeRangeToEpochTimeRangeArgs $) {
        this.epochMillis = $.epochMillis;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardTimeRangeBeginBoundedTimeRangeToEpochTimeRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardTimeRangeBeginBoundedTimeRangeToEpochTimeRangeArgs $;

        public Builder() {
            $ = new DashboardTimeRangeBeginBoundedTimeRangeToEpochTimeRangeArgs();
        }

        public Builder(DashboardTimeRangeBeginBoundedTimeRangeToEpochTimeRangeArgs defaults) {
            $ = new DashboardTimeRangeBeginBoundedTimeRangeToEpochTimeRangeArgs(Objects.requireNonNull(defaults));
        }

        public Builder epochMillis(Output<Integer> epochMillis) {
            $.epochMillis = epochMillis;
            return this;
        }

        public Builder epochMillis(Integer epochMillis) {
            return epochMillis(Output.of(epochMillis));
        }

        public DashboardTimeRangeBeginBoundedTimeRangeToEpochTimeRangeArgs build() {
            $.epochMillis = Objects.requireNonNull($.epochMillis, "expected parameter 'epochMillis' to be non-null");
            return $;
        }
    }

}
