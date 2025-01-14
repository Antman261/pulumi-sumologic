// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MonitorTriggerConditionsLogsStaticConditionCriticalResolution {
    /**
     * @return The resolution window that the recovery condition must be met in each evaluation that happens within this entire duration before the alert is recovered (resolved). If not specified, the time range of your trigger will be used.
     * 
     */
    private @Nullable String resolutionWindow;
    private @Nullable Double threshold;
    private @Nullable String thresholdType;

    private MonitorTriggerConditionsLogsStaticConditionCriticalResolution() {}
    /**
     * @return The resolution window that the recovery condition must be met in each evaluation that happens within this entire duration before the alert is recovered (resolved). If not specified, the time range of your trigger will be used.
     * 
     */
    public Optional<String> resolutionWindow() {
        return Optional.ofNullable(this.resolutionWindow);
    }
    public Optional<Double> threshold() {
        return Optional.ofNullable(this.threshold);
    }
    public Optional<String> thresholdType() {
        return Optional.ofNullable(this.thresholdType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorTriggerConditionsLogsStaticConditionCriticalResolution defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String resolutionWindow;
        private @Nullable Double threshold;
        private @Nullable String thresholdType;
        public Builder() {}
        public Builder(MonitorTriggerConditionsLogsStaticConditionCriticalResolution defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resolutionWindow = defaults.resolutionWindow;
    	      this.threshold = defaults.threshold;
    	      this.thresholdType = defaults.thresholdType;
        }

        @CustomType.Setter
        public Builder resolutionWindow(@Nullable String resolutionWindow) {
            this.resolutionWindow = resolutionWindow;
            return this;
        }
        @CustomType.Setter
        public Builder threshold(@Nullable Double threshold) {
            this.threshold = threshold;
            return this;
        }
        @CustomType.Setter
        public Builder thresholdType(@Nullable String thresholdType) {
            this.thresholdType = thresholdType;
            return this;
        }
        public MonitorTriggerConditionsLogsStaticConditionCriticalResolution build() {
            final var o = new MonitorTriggerConditionsLogsStaticConditionCriticalResolution();
            o.resolutionWindow = resolutionWindow;
            o.threshold = threshold;
            o.thresholdType = thresholdType;
            return o;
        }
    }
}
