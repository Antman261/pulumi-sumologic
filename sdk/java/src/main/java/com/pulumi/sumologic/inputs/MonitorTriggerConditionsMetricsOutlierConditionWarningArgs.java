// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitorTriggerConditionsMetricsOutlierConditionWarningArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorTriggerConditionsMetricsOutlierConditionWarningArgs Empty = new MonitorTriggerConditionsMetricsOutlierConditionWarningArgs();

    @Import(name="baselineWindow")
    private @Nullable Output<String> baselineWindow;

    public Optional<Output<String>> baselineWindow() {
        return Optional.ofNullable(this.baselineWindow);
    }

    @Import(name="threshold")
    private @Nullable Output<Double> threshold;

    public Optional<Output<Double>> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    private MonitorTriggerConditionsMetricsOutlierConditionWarningArgs() {}

    private MonitorTriggerConditionsMetricsOutlierConditionWarningArgs(MonitorTriggerConditionsMetricsOutlierConditionWarningArgs $) {
        this.baselineWindow = $.baselineWindow;
        this.threshold = $.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorTriggerConditionsMetricsOutlierConditionWarningArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorTriggerConditionsMetricsOutlierConditionWarningArgs $;

        public Builder() {
            $ = new MonitorTriggerConditionsMetricsOutlierConditionWarningArgs();
        }

        public Builder(MonitorTriggerConditionsMetricsOutlierConditionWarningArgs defaults) {
            $ = new MonitorTriggerConditionsMetricsOutlierConditionWarningArgs(Objects.requireNonNull(defaults));
        }

        public Builder baselineWindow(@Nullable Output<String> baselineWindow) {
            $.baselineWindow = baselineWindow;
            return this;
        }

        public Builder baselineWindow(String baselineWindow) {
            return baselineWindow(Output.of(baselineWindow));
        }

        public Builder threshold(@Nullable Output<Double> threshold) {
            $.threshold = threshold;
            return this;
        }

        public Builder threshold(Double threshold) {
            return threshold(Output.of(threshold));
        }

        public MonitorTriggerConditionsMetricsOutlierConditionWarningArgs build() {
            return $;
        }
    }

}