// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MonitorTriggerConditionsSloBurnRateConditionWarning {
    private Double burnRateThreshold;
    private String timeRange;

    private MonitorTriggerConditionsSloBurnRateConditionWarning() {}
    public Double burnRateThreshold() {
        return this.burnRateThreshold;
    }
    public String timeRange() {
        return this.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorTriggerConditionsSloBurnRateConditionWarning defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double burnRateThreshold;
        private String timeRange;
        public Builder() {}
        public Builder(MonitorTriggerConditionsSloBurnRateConditionWarning defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.burnRateThreshold = defaults.burnRateThreshold;
    	      this.timeRange = defaults.timeRange;
        }

        @CustomType.Setter
        public Builder burnRateThreshold(Double burnRateThreshold) {
            this.burnRateThreshold = Objects.requireNonNull(burnRateThreshold);
            return this;
        }
        @CustomType.Setter
        public Builder timeRange(String timeRange) {
            this.timeRange = Objects.requireNonNull(timeRange);
            return this;
        }
        public MonitorTriggerConditionsSloBurnRateConditionWarning build() {
            final var o = new MonitorTriggerConditionsSloBurnRateConditionWarning();
            o.burnRateThreshold = burnRateThreshold;
            o.timeRange = timeRange;
            return o;
        }
    }
}
