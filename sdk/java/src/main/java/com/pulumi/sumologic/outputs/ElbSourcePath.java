// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sumologic.outputs.ElbSourcePathCustomService;
import com.pulumi.sumologic.outputs.ElbSourcePathSnsTopicOrSubscriptionArn;
import com.pulumi.sumologic.outputs.ElbSourcePathTagFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElbSourcePath {
    /**
     * @return The name of the bucket.
     * 
     */
    private @Nullable String bucketName;
    private @Nullable List<ElbSourcePathCustomService> customServices;
    private @Nullable List<String> limitToNamespaces;
    private @Nullable List<String> limitToRegions;
    private @Nullable List<String> limitToServices;
    /**
     * @return The path to the data.
     * 
     */
    private @Nullable String pathExpression;
    /**
     * @return This is a computed field for SNS topic/subscription ARN.
     * 
     */
    private @Nullable List<ElbSourcePathSnsTopicOrSubscriptionArn> snsTopicOrSubscriptionArns;
    private @Nullable List<ElbSourcePathTagFilter> tagFilters;
    /**
     * @return type of polling source. This has to be `S3BucketPathExpression` for `ELB` source.
     * 
     */
    private String type;
    private @Nullable Boolean useVersionedApi;

    private ElbSourcePath() {}
    /**
     * @return The name of the bucket.
     * 
     */
    public Optional<String> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }
    public List<ElbSourcePathCustomService> customServices() {
        return this.customServices == null ? List.of() : this.customServices;
    }
    public List<String> limitToNamespaces() {
        return this.limitToNamespaces == null ? List.of() : this.limitToNamespaces;
    }
    public List<String> limitToRegions() {
        return this.limitToRegions == null ? List.of() : this.limitToRegions;
    }
    public List<String> limitToServices() {
        return this.limitToServices == null ? List.of() : this.limitToServices;
    }
    /**
     * @return The path to the data.
     * 
     */
    public Optional<String> pathExpression() {
        return Optional.ofNullable(this.pathExpression);
    }
    /**
     * @return This is a computed field for SNS topic/subscription ARN.
     * 
     */
    public List<ElbSourcePathSnsTopicOrSubscriptionArn> snsTopicOrSubscriptionArns() {
        return this.snsTopicOrSubscriptionArns == null ? List.of() : this.snsTopicOrSubscriptionArns;
    }
    public List<ElbSourcePathTagFilter> tagFilters() {
        return this.tagFilters == null ? List.of() : this.tagFilters;
    }
    /**
     * @return type of polling source. This has to be `S3BucketPathExpression` for `ELB` source.
     * 
     */
    public String type() {
        return this.type;
    }
    public Optional<Boolean> useVersionedApi() {
        return Optional.ofNullable(this.useVersionedApi);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElbSourcePath defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bucketName;
        private @Nullable List<ElbSourcePathCustomService> customServices;
        private @Nullable List<String> limitToNamespaces;
        private @Nullable List<String> limitToRegions;
        private @Nullable List<String> limitToServices;
        private @Nullable String pathExpression;
        private @Nullable List<ElbSourcePathSnsTopicOrSubscriptionArn> snsTopicOrSubscriptionArns;
        private @Nullable List<ElbSourcePathTagFilter> tagFilters;
        private String type;
        private @Nullable Boolean useVersionedApi;
        public Builder() {}
        public Builder(ElbSourcePath defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.customServices = defaults.customServices;
    	      this.limitToNamespaces = defaults.limitToNamespaces;
    	      this.limitToRegions = defaults.limitToRegions;
    	      this.limitToServices = defaults.limitToServices;
    	      this.pathExpression = defaults.pathExpression;
    	      this.snsTopicOrSubscriptionArns = defaults.snsTopicOrSubscriptionArns;
    	      this.tagFilters = defaults.tagFilters;
    	      this.type = defaults.type;
    	      this.useVersionedApi = defaults.useVersionedApi;
        }

        @CustomType.Setter
        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        @CustomType.Setter
        public Builder customServices(@Nullable List<ElbSourcePathCustomService> customServices) {
            this.customServices = customServices;
            return this;
        }
        public Builder customServices(ElbSourcePathCustomService... customServices) {
            return customServices(List.of(customServices));
        }
        @CustomType.Setter
        public Builder limitToNamespaces(@Nullable List<String> limitToNamespaces) {
            this.limitToNamespaces = limitToNamespaces;
            return this;
        }
        public Builder limitToNamespaces(String... limitToNamespaces) {
            return limitToNamespaces(List.of(limitToNamespaces));
        }
        @CustomType.Setter
        public Builder limitToRegions(@Nullable List<String> limitToRegions) {
            this.limitToRegions = limitToRegions;
            return this;
        }
        public Builder limitToRegions(String... limitToRegions) {
            return limitToRegions(List.of(limitToRegions));
        }
        @CustomType.Setter
        public Builder limitToServices(@Nullable List<String> limitToServices) {
            this.limitToServices = limitToServices;
            return this;
        }
        public Builder limitToServices(String... limitToServices) {
            return limitToServices(List.of(limitToServices));
        }
        @CustomType.Setter
        public Builder pathExpression(@Nullable String pathExpression) {
            this.pathExpression = pathExpression;
            return this;
        }
        @CustomType.Setter
        public Builder snsTopicOrSubscriptionArns(@Nullable List<ElbSourcePathSnsTopicOrSubscriptionArn> snsTopicOrSubscriptionArns) {
            this.snsTopicOrSubscriptionArns = snsTopicOrSubscriptionArns;
            return this;
        }
        public Builder snsTopicOrSubscriptionArns(ElbSourcePathSnsTopicOrSubscriptionArn... snsTopicOrSubscriptionArns) {
            return snsTopicOrSubscriptionArns(List.of(snsTopicOrSubscriptionArns));
        }
        @CustomType.Setter
        public Builder tagFilters(@Nullable List<ElbSourcePathTagFilter> tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }
        public Builder tagFilters(ElbSourcePathTagFilter... tagFilters) {
            return tagFilters(List.of(tagFilters));
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder useVersionedApi(@Nullable Boolean useVersionedApi) {
            this.useVersionedApi = useVersionedApi;
            return this;
        }
        public ElbSourcePath build() {
            final var o = new ElbSourcePath();
            o.bucketName = bucketName;
            o.customServices = customServices;
            o.limitToNamespaces = limitToNamespaces;
            o.limitToRegions = limitToRegions;
            o.limitToServices = limitToServices;
            o.pathExpression = pathExpression;
            o.snsTopicOrSubscriptionArns = snsTopicOrSubscriptionArns;
            o.tagFilters = tagFilters;
            o.type = type;
            o.useVersionedApi = useVersionedApi;
            return o;
        }
    }
}
