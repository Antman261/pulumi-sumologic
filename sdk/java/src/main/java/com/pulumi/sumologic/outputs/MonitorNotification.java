// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sumologic.outputs.MonitorNotificationNotification;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MonitorNotification {
    private MonitorNotificationNotification notification;
    private List<String> runForTriggerTypes;

    private MonitorNotification() {}
    public MonitorNotificationNotification notification() {
        return this.notification;
    }
    public List<String> runForTriggerTypes() {
        return this.runForTriggerTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorNotification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private MonitorNotificationNotification notification;
        private List<String> runForTriggerTypes;
        public Builder() {}
        public Builder(MonitorNotification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notification = defaults.notification;
    	      this.runForTriggerTypes = defaults.runForTriggerTypes;
        }

        @CustomType.Setter
        public Builder notification(MonitorNotificationNotification notification) {
            this.notification = Objects.requireNonNull(notification);
            return this;
        }
        @CustomType.Setter
        public Builder runForTriggerTypes(List<String> runForTriggerTypes) {
            this.runForTriggerTypes = Objects.requireNonNull(runForTriggerTypes);
            return this;
        }
        public Builder runForTriggerTypes(String... runForTriggerTypes) {
            return runForTriggerTypes(List.of(runForTriggerTypes));
        }
        public MonitorNotification build() {
            final var o = new MonitorNotification();
            o.notification = notification;
            o.runForTriggerTypes = runForTriggerTypes;
            return o;
        }
    }
}
