// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sumologic.inputs.DashboardTimeRangeBeginBoundedTimeRangeFromArgs;
import com.pulumi.sumologic.inputs.DashboardTimeRangeBeginBoundedTimeRangeToArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardTimeRangeBeginBoundedTimeRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardTimeRangeBeginBoundedTimeRangeArgs Empty = new DashboardTimeRangeBeginBoundedTimeRangeArgs();

    @Import(name="from", required=true)
    private Output<DashboardTimeRangeBeginBoundedTimeRangeFromArgs> from;

    public Output<DashboardTimeRangeBeginBoundedTimeRangeFromArgs> from() {
        return this.from;
    }

    @Import(name="to")
    private @Nullable Output<DashboardTimeRangeBeginBoundedTimeRangeToArgs> to;

    public Optional<Output<DashboardTimeRangeBeginBoundedTimeRangeToArgs>> to() {
        return Optional.ofNullable(this.to);
    }

    private DashboardTimeRangeBeginBoundedTimeRangeArgs() {}

    private DashboardTimeRangeBeginBoundedTimeRangeArgs(DashboardTimeRangeBeginBoundedTimeRangeArgs $) {
        this.from = $.from;
        this.to = $.to;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardTimeRangeBeginBoundedTimeRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardTimeRangeBeginBoundedTimeRangeArgs $;

        public Builder() {
            $ = new DashboardTimeRangeBeginBoundedTimeRangeArgs();
        }

        public Builder(DashboardTimeRangeBeginBoundedTimeRangeArgs defaults) {
            $ = new DashboardTimeRangeBeginBoundedTimeRangeArgs(Objects.requireNonNull(defaults));
        }

        public Builder from(Output<DashboardTimeRangeBeginBoundedTimeRangeFromArgs> from) {
            $.from = from;
            return this;
        }

        public Builder from(DashboardTimeRangeBeginBoundedTimeRangeFromArgs from) {
            return from(Output.of(from));
        }

        public Builder to(@Nullable Output<DashboardTimeRangeBeginBoundedTimeRangeToArgs> to) {
            $.to = to;
            return this;
        }

        public Builder to(DashboardTimeRangeBeginBoundedTimeRangeToArgs to) {
            return to(Output.of(to));
        }

        public DashboardTimeRangeBeginBoundedTimeRangeArgs build() {
            $.from = Objects.requireNonNull($.from, "expected parameter 'from' to be non-null");
            return $;
        }
    }

}