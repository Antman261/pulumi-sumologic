// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MonitorNotificationNotification {
    /**
     * @deprecated
     * The field `action_type` is deprecated and will be removed in a future release of the provider - please use `connection_type` instead.
     * 
     */
    @Deprecated /* The field `action_type` is deprecated and will be removed in a future release of the provider - please use `connection_type` instead. */
    private final @Nullable String actionType;
    private final @Nullable String connectionId;
    private final @Nullable String connectionType;
    private final @Nullable String messageBody;
    private final @Nullable String payloadOverride;
    private final @Nullable List<String> recipients;
    private final @Nullable String subject;
    private final @Nullable String timeZone;

    @CustomType.Constructor
    private MonitorNotificationNotification(
        @CustomType.Parameter("actionType") @Nullable String actionType,
        @CustomType.Parameter("connectionId") @Nullable String connectionId,
        @CustomType.Parameter("connectionType") @Nullable String connectionType,
        @CustomType.Parameter("messageBody") @Nullable String messageBody,
        @CustomType.Parameter("payloadOverride") @Nullable String payloadOverride,
        @CustomType.Parameter("recipients") @Nullable List<String> recipients,
        @CustomType.Parameter("subject") @Nullable String subject,
        @CustomType.Parameter("timeZone") @Nullable String timeZone) {
        this.actionType = actionType;
        this.connectionId = connectionId;
        this.connectionType = connectionType;
        this.messageBody = messageBody;
        this.payloadOverride = payloadOverride;
        this.recipients = recipients;
        this.subject = subject;
        this.timeZone = timeZone;
    }

    /**
     * @deprecated
     * The field `action_type` is deprecated and will be removed in a future release of the provider - please use `connection_type` instead.
     * 
     */
    @Deprecated /* The field `action_type` is deprecated and will be removed in a future release of the provider - please use `connection_type` instead. */
    public Optional<String> actionType() {
        return Optional.ofNullable(this.actionType);
    }
    public Optional<String> connectionId() {
        return Optional.ofNullable(this.connectionId);
    }
    public Optional<String> connectionType() {
        return Optional.ofNullable(this.connectionType);
    }
    public Optional<String> messageBody() {
        return Optional.ofNullable(this.messageBody);
    }
    public Optional<String> payloadOverride() {
        return Optional.ofNullable(this.payloadOverride);
    }
    public List<String> recipients() {
        return this.recipients == null ? List.of() : this.recipients;
    }
    public Optional<String> subject() {
        return Optional.ofNullable(this.subject);
    }
    public Optional<String> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorNotificationNotification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionType;
        private @Nullable String connectionId;
        private @Nullable String connectionType;
        private @Nullable String messageBody;
        private @Nullable String payloadOverride;
        private @Nullable List<String> recipients;
        private @Nullable String subject;
        private @Nullable String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitorNotificationNotification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.connectionId = defaults.connectionId;
    	      this.connectionType = defaults.connectionType;
    	      this.messageBody = defaults.messageBody;
    	      this.payloadOverride = defaults.payloadOverride;
    	      this.recipients = defaults.recipients;
    	      this.subject = defaults.subject;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder actionType(@Nullable String actionType) {
            this.actionType = actionType;
            return this;
        }
        public Builder connectionId(@Nullable String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Builder connectionType(@Nullable String connectionType) {
            this.connectionType = connectionType;
            return this;
        }
        public Builder messageBody(@Nullable String messageBody) {
            this.messageBody = messageBody;
            return this;
        }
        public Builder payloadOverride(@Nullable String payloadOverride) {
            this.payloadOverride = payloadOverride;
            return this;
        }
        public Builder recipients(@Nullable List<String> recipients) {
            this.recipients = recipients;
            return this;
        }
        public Builder recipients(String... recipients) {
            return recipients(List.of(recipients));
        }
        public Builder subject(@Nullable String subject) {
            this.subject = subject;
            return this;
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }        public MonitorNotificationNotification build() {
            return new MonitorNotificationNotification(actionType, connectionId, connectionType, messageBody, payloadOverride, recipients, subject, timeZone);
        }
    }
}