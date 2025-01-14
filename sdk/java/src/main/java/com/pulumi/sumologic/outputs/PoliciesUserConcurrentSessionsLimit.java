// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PoliciesUserConcurrentSessionsLimit {
    /**
     * @return Whether the [User Concurrent Sessions Limit Policy](https://help.sumologic.com/Manage/Security/Set_a_Limit_for_User_Concurrent_Sessions) is enabled.
     * 
     */
    private Boolean enabled;
    /**
     * @return Maximum number of concurrent sessions a user may have. Defaults to `100`.
     * 
     */
    private @Nullable Integer maxConcurrentSessions;

    private PoliciesUserConcurrentSessionsLimit() {}
    /**
     * @return Whether the [User Concurrent Sessions Limit Policy](https://help.sumologic.com/Manage/Security/Set_a_Limit_for_User_Concurrent_Sessions) is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Maximum number of concurrent sessions a user may have. Defaults to `100`.
     * 
     */
    public Optional<Integer> maxConcurrentSessions() {
        return Optional.ofNullable(this.maxConcurrentSessions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PoliciesUserConcurrentSessionsLimit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private @Nullable Integer maxConcurrentSessions;
        public Builder() {}
        public Builder(PoliciesUserConcurrentSessionsLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.maxConcurrentSessions = defaults.maxConcurrentSessions;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder maxConcurrentSessions(@Nullable Integer maxConcurrentSessions) {
            this.maxConcurrentSessions = maxConcurrentSessions;
            return this;
        }
        public PoliciesUserConcurrentSessionsLimit build() {
            final var o = new PoliciesUserConcurrentSessionsLimit();
            o.enabled = enabled;
            o.maxConcurrentSessions = maxConcurrentSessions;
            return o;
        }
    }
}
