// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class MonitorTriggerConditionsSloSliConditionWarning {
    private Double sliThreshold;

    private MonitorTriggerConditionsSloSliConditionWarning() {}
    public Double sliThreshold() {
        return this.sliThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorTriggerConditionsSloSliConditionWarning defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double sliThreshold;
        public Builder() {}
        public Builder(MonitorTriggerConditionsSloSliConditionWarning defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sliThreshold = defaults.sliThreshold;
        }

        @CustomType.Setter
        public Builder sliThreshold(Double sliThreshold) {
            this.sliThreshold = Objects.requireNonNull(sliThreshold);
            return this;
        }
        public MonitorTriggerConditionsSloSliConditionWarning build() {
            final var o = new MonitorTriggerConditionsSloSliConditionWarning();
            o.sliThreshold = sliThreshold;
            return o;
        }
    }
}
